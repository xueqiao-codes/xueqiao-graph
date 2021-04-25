<template>
  <div class="page">
    <div class="header">
      <div class="header-text">标签管理</div>
    </div>
    <div class="body">
      <div class="body-header">
        <div class="body-header-left">
          <div class="multi-line-search-item">
            <span>标签：</span>
            <el-select
              v-model="searchKeyTag"
              placeholder="标签"
              clearable
              filterable
              allow-create
              class="body-header-input body-header-component"
            >
              <el-option
                v-for="item in tagOptions"
                :key="item"
                :label="item"
                :value="item"
              >
              </el-option>
            </el-select>
          </div>
          <el-button
            class="body-header-component"
            type="primary"
            size="small"
            @click="reqTagPage"
          >查询</el-button>
        </div>
        <div class="body-header-right">
          <el-button
            class="body-header-component"
            type="primary"
            size="small"
            @click="addTag"
          >添加</el-button>
        </div>
      </div>
      <div class="body-content">
        <table>
          <tr bgColor=#F8FCFF>
            <th width="500">ID</th>
            <th width="800">标签</th>
            <th width="800">创建时间</th>
            <th width="800">修改时间</th>
            <th width="600">操作</th>
          </tr>
          <tr
            v-for="(tag, index) in tagList"
            v-bind:key="index"
          >
            <td>{{tag.tagId}}</td>
            <td>{{tag.cnName}}</td>
            <td>{{formatTime(tag.createTimestamp)}}</td>
            <td>{{formatTime(tag.lastModifyTimestamp)}}</td>
            <td>
              <a
                class="td-item"
                href="#"
                @click="showEditTagDialog(tag)"
              >修改</a>
              <a
                class="td-item"
                href="#"
                @click="showDeleteTagDialog(tag)"
              >删除</a>
            </td>
          </tr>
        </table>
        <div
          class="body-content-nodata"
          v-if="nodata"
        >无数据</div>
      </div>
      <div class="pagination">
        <el-pagination
          background
          layout="total, sizes, prev, pager, next, jumper"
          :total="totalNum"
          :page-size="pageSize"
          :current-page="currentPage"
          @size-change="handleSizeChange"
          @current-change="onPageChange"
        >
        </el-pagination>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      // const
      CHART_TYPE: this.$config.ENUM.CHART_TYPE.ITEMS,

      // page
      totalNum: 0,
      currentPage: 1,
      pageSize: 10,

      // searchKey
      searchKeyTag: null,

      // data
      nodata: true,
      tagList: [],

      // options
      tagOptions: []
    };
  },
  mounted() {
    this.$util.resetNavigationStack();
    this.$util.pushNavigationStack({
      name: "投研图表管理 行情图表",
      router: { path: "/chart/quotation" }
    });
    this.$util.pushNavigationStack({
      name: "标签管理",
      router: { path: "/tag" }
    });

    this.reqTagPage();
    this.reqTags();
  },
  methods: {
    onPageChange(currentPage) {
      this.currentPage = currentPage;
      this.reqTagPage();
    },
    handleSizeChange(size) {
      this.pageSize = size;
      this.reqTagPage();
    },
    reqTags() {
      var that = this;
      this.$api.reqTags(function(response) {
        if (response != null && response.errorMsg) {
          alert(response.errorMsg);
        } else {
          if (response && response.length > 0) {
            that.tagOptions = response;
            return;
          }
        }
        that.tagOptions = [];
      });
    },
    reqTagPage() {
      var that = this;

      var option = new ReqTagOption();
      if (this.searchKeyTag) {
        option.namePartical = this.searchKeyTag;
      }

      var pageOption = new IndexedPageOption();
      pageOption.needTotalCount = true;
      pageOption.pageIndex = this.currentPage - 1;
      pageOption.pageSize = this.pageSize;

      this.$api.reqTagPage(option, pageOption, function(response) {
        if (response != null && response.errorMsg) {
          alert(response.errorMsg);
        } else {
          if (response && response.page && response.page.length > 0) {
            that.tagList = response.page;
            that.totalNum = response.total;
            that.nodata = false;
            return;
          }
          that.tagList = [];
          that.totalNum = 0;
          that.nodata = true;
        }
      });
    },
    addTag() {
      var newTag = prompt("请输入新标签名");
      if (!newTag) {
        alert("新标签名不能为空");
        return;
      }
      var that = this;
      var tag = new XueQiaoTag();
      tag.cnName = newTag;

      this.$api.addTag(tag, function(response) {
        if (response) {
          if (response.success) {
            alert("添加成功");
            that.reqTagPage();
            that.reqTags();
          } else if (response.message) {
            alert(response.message);
          } else if (response.errorMsg) {
            alert(response.errorMsg);
          } else {
            alert(that.$string.message.callMethodFail);
          }
        } else {
          alert(that.$string.message.serverBusy);
        }
      });
    },
    showEditTagDialog(oldTag) {
      var updateTag = prompt(
        "修改标签后，标记该标签的图表会一并修改。原标签名为（" +
          oldTag.cnName +
          ")，请输入新标签名"
      );
      if (!updateTag) {
        alert("新标签名不能为空");
        return;
      }
      var that = this;
      var tag = new XueQiaoTag();
      tag.tagId = oldTag.tagId;
      tag.cnName = updateTag;

      this.$api.updateTag(tag, function(response) {
        if (response != null) {
          if (response.success) {
            alert("修改成功");
            that.reqTagPage();
            that.reqTags();
          } else if (response.message) {
            alert(response.message);
          } else if (response.errorMsg) {
            alert(response.errorMsg);
          } else {
            alert(that.$string.message.callMethodFail);
          }
        } else {
          alert(that.$string.message.serverBusy);
        }
      });
    },
    showDeleteTagDialog(tag) {
      if (
        confirm(
          "标签删除后，标记该标签的图表会一并删除此标签。确认删除标签（" +
            tag.cnName +
            ")吗？"
        )
      ) {
        var that = this;
        this.$api.removeTag(tag.tagId, function(response) {
          if (response != null) {
            if (response.success) {
              alert("删除成功");
              that.reqTagPage();
              that.reqTags();
            } else if (response.message) {
              alert(response.message);
            } else if (response.errorMsg) {
              alert(response.errorMsg);
            } else {
              alert(that.$string.message.callMethodFail);
            }
          } else {
            alert(that.$string.message.serverBusy);
          }
        });
      }
    },
    formatTime(time) {
      if (time) {
        return this.$timeUtil.getYYYY_MM_DD_HH_MM_SS(time * 1000);
      } else {
        return "--";
      }
    }
  }
};
</script>

<style scoped>
.page {
  width: 100%;
  height: 100%;
}
.main {
  height: 100%;
  background-color: white;
}
.td-item {
  margin-left: 5px;
  margin-right: 5px;
  margin-top: 2px;
  margin-bottom: 2px;
}
</style>
