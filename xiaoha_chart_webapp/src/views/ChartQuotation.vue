<template>
  <div class="body">
    <div class="body-header">
      <div class="body-header-left">
        <div class="multi-line-search-item">
          <span>ID：</span>
          <el-input
            class="body-header-input body-header-component"
            placeholder="ID"
            v-model="searchKeyChartId"
            clearable
          >
          </el-input>
        </div>
        <div class="multi-line-search-item">
          <span>小哈图ID：</span>
          <el-input
            class="body-header-input body-header-component"
            placeholder="小哈图ID"
            v-model="searchKeyXiaohaOjbId"
            clearable
          ></el-input>
        </div>
        <div class="multi-line-search-item">
          <span>图表类型：</span>
          <el-select
            v-model="searchKeyChartType"
            placeholder="图表类型"
            clearable
            class="body-header-input body-header-component"
          >
            <el-option
              v-for="item in CHART_TYPE"
              :key="item.versionId"
              :label="item.LABEL"
              :value="item.KEY"
            >
            </el-option>
          </el-select>
        </div>
        <div class="multi-line-search-item">
          <span>板块：</span>
          <el-select
            v-model="searchKeyPlate"
            placeholder="板块"
            clearable
            class="body-header-input body-header-component"
          >
            <el-option
              v-for="item in plateOptions"
              :key="item"
              :label="item"
              :value="item"
            >
            </el-option>
          </el-select>
        </div>
        <div class="multi-line-search-item">
          <span>商品/跨品种组合：</span>
          <el-input
            class="body-header-input body-header-component"
            placeholder="商品/跨品种组合"
            v-model="searchKeyCommodityName"
            clearable
          ></el-input>
        </div>
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
        <div class="multi-line-search-item">
          <span>图表名称：</span>
          <el-input
            class="body-header-input body-header-component"
            placeholder="图表名称"
            v-model="searchKeyChartName"
            clearable
          ></el-input>
        </div>
        <el-button
          class="body-header-component"
          type="primary"
          size="small"
          @click="queryChartPage"
        >查询</el-button>
      </div>
      <div class="body-header-right">
        <el-button
          class="body-header-component"
          type="primary"
          size="small"
          @click="gotoTagManager"
        >标签管理</el-button>
      </div>
    </div>
    <div class="body-content">
      <table>
        <tr bgColor=#F8FCFF>
          <th width="200">ID</th>
          <th width="300">小哈图ID</th>
          <th width="500">图表名称</th>
          <th width="400">商品/跨品种组合</th>
          <th width="300">板块</th>
          <th width="400">图表类型</th>
          <th width="800">标签</th>
          <th width="500">操作</th>
        </tr>
        <tr
          v-for="(chart, index) in chartList"
          v-bind:key="index"
        >
          <td>{{chart.chartId}}</td>
          <td>{{chart.xiaohaObjId}}</td>
          <td>{{chart.chartName}}</td>
          <td>{{chart.commodityName}}</td>
          <td>{{chart.plate}}</td>
          <td>{{CHART_TYPE[chart.chartType].LABEL}}</td>
          <td class="align-left-item">
            <el-tag
              class="td-item"
              v-for="(tag, index) in chart.tags"
              :key="index"
            >{{tag}}</el-tag>
          </td>
          <td>
            <a
              class="td-item"
              href="#"
              @click="showEditTagDialog(chart)"
            >编辑标签</a>
            <a
              class="td-item"
              href="#"
              @click="showChartGraph(chart)"
            >查看</a>
            <a
              v-if="chart.chartState == 1"
              class="td-item"
              href="#"
              @click="showEnableCharDialog(chart)"
            >启用</a>
            <a
              v-else
              class="td-item"
              href="#"
              @click="showDisableCharDialog(chart)"
            >禁用</a>
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
    <d-edit-tag
      v-bind:isShow="isShowEditTagDialog"
      :chart="selectedChart"
      @confirm="confirmEditTagDialog"
      @close="closeEditTagDialog"
    ></d-edit-tag>
  </div>
</template>

<script>
import EditTagDialog from "../components/dialog/EditTagDialog";
export default {
  components: {
    "d-edit-tag": EditTagDialog
  },
  data() {
    return {
      // const
      CHART_TYPE: this.$config.ENUM.CHART_TYPE.ITEMS,

      // page
      totalNum: 0,
      currentPage: 1,
      pageSize: 10,

      // searchKey
      searchKeyChartId: null,
      searchKeyXiaohaOjbId: null,
      searchKeyChartType: null,
      searchKeyPlate: null,
      searchKeyCommodityName: null,
      searchKeyTag: null,
      searchKeyChartName: null,

      // dialog
      isShowEditTagDialog: false,

      // data
      nodata: true,
      chartList: [],

      // options
      plateOptions: [],
      tagOptions: [],

      // selected
      selectedChart: null
    };
  },
  mounted() {
    this.$util.resetNavigationStack();
    this.$util.pushNavigationStack({
      name: "投研图表管理 行情图表",
      router: { path: "/chart/quotation" }
    });

    this.queryChartPage();
    this.reqPlates();
    this.reqTags();
  },
  methods: {
    onPageChange(currentPage) {
      this.currentPage = currentPage;
      this.reqChart();
    },
    handleSizeChange(size) {
      this.pageSize = size;
      this.reqChart();
    },
    queryChartPage() {
      this.currentPage = 1;
      this.reqChart();
    },
    reqChart() {
      var option = new ReqChartOption();
      if (this.searchKeyChartId) {
        option.chartIds = [];
        option.chartIds.push(this.searchKeyChartId);
      }
      if (this.searchKeyXiaohaOjbId) {
        option.xiaohaObjId = this.searchKeyXiaohaOjbId;
      }
      if (this.searchKeyChartType != undefined) {
        option.chartType = ChartType[this.searchKeyChartType];
      }
      if (this.searchKeyPlate) {
        option.plate = this.searchKeyPlate;
      }
      if (this.searchKeyCommodityName) {
        option.commodityName = this.searchKeyCommodityName;
      }
      if (this.searchKeyTag) {
        option.keyWords = [];
        option.keyWords.push(this.searchKeyTag);
      }
      if (this.searchKeyChartName) {
        option.name = this.searchKeyChartName;
      }

      var pageOption = new IndexedPageOption();
      pageOption.needTotalCount = true;
      pageOption.pageIndex = this.currentPage - 1;
      pageOption.pageSize = this.pageSize;

      var that = this;
      this.$api.reqChart(option, pageOption, function(response) {
        if (response != null && response.errorMsg) {
          alert(response.errorMsg);
        } else {
          if (response && response.page && response.page.length > 0) {
            that.chartList = response.page;
            that.totalNum = response.total;
            that.nodata = false;
            return;
          }
          that.chartList = [];
          that.totalNum = 0;
          that.nodata = true;
        }
      });
    },
    reqPlates() {
      var that = this;
      this.$api.reqPlates(function(response) {
        if (response != null && response.errorMsg) {
          alert(response.errorMsg);
        } else {
          if (response && response.length > 0) {
            that.plateOptions = response;
            return;
          }
          that.plateOptions = [];
        }
      });
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
          that.tagOptions = [];
        }
      });
    },
    showEditTagDialog(chart) {
      this.selectedChart = chart;
      this.isShowEditTagDialog = true;
    },
    closeEditTagDialog() {
      this.isShowEditTagDialog = false;
    },
    confirmEditTagDialog() {
      this.reqChart();
      this.isShowEditTagDialog = false;
    },
    showChartGraph(chart) {
      window.open(chart.url);
    },
    showEnableCharDialog(chart) {
      if (confirm("确认启用图表（" + chart.chartName + ")?")) {
        var that = this;
        this.$api.updateChartState(chart.chartId, ChartState.ENABLE, function(
          response
        ) {
          if (response != null) {
            if (response.success) {
              alert("启用成功");
              that.reqChart();
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
    showDisableCharDialog(chart) {
      if (confirm("确认禁用图表（" + chart.chartName + ")?")) {
        var that = this;
        this.$api.updateChartState(chart.chartId, ChartState.DISABLE, function(
          response
        ) {
          if (response != null) {
            if (response.success) {
              alert("禁用成功");
              that.reqChart();
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
    gotoTagManager() {
      this.$router.push("/tag");
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
  /* margin: 15px; */
  height: 100%;
  background-color: white;
}
.multi-line-search-item {
  margin-top: 2px;
  margin-bottom: 2px;
}
.align-left-item {
  text-align: left;
  padding-left: 5px;
  padding-right: 5px;
}
.td-item {
  margin-left: 5px;
  margin-right: 5px;
  margin-top: 2px;
  margin-bottom: 2px;
}
</style>
