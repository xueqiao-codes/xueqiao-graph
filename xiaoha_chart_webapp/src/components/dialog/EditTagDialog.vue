<template>
  <div
    v-if="isShow"
    class="dialog-bg"
  >
    <div class="dialog-container">
      <div class="dialog-header">
        <div class="dialog-title">编辑标签</div>
        <div class="dialog-close">
          <a
            href="#"
            @click="close"
          ><img src="../../assets/img/icon_close.png" /></a>
        </div>
      </div>
      <div class="dialog-content">
        <div class="input-item">
          <div class="input-key">
            <span>图表类型：</span>
          </div>
          <div>
            <span v-if="chart.chartType == undefined">--</span>
            <span v-else>{{CHART_TYPE[chart.chartType].LABEL}}</span>
          </div>
        </div>
        <div class="input-item">
          <div class="input-key">
            <span>板块：</span>
          </div>
          <div>
            <span>{{chart.plate}}</span>
          </div>
        </div>
        <div class="input-item">
          <div class="input-key">
            <span>商品/跨品种组合：</span>
          </div>
          <div>
            <span>{{chart.commodityName}}</span>
          </div>
        </div>
        <div class="input-item">
          <div class="input-key">
            <span>图表名称：</span>
          </div>
          <div>
            <span>{{chart.chartName}}</span>
          </div>
        </div>
        <div class="multi-input-item">
          <div class="multi-input-key">
            <span>标签：</span>
          </div>
          <div class="input-value my-input-value">
            <el-select
              v-model="selectedTags"
              placeholder="请选择"
              multiple
              filterable
              allow-create
              default-first-option
              class="my-input-value"
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
        </div>
      </div>
      <div class="dialog-button-container">
        <el-button
          type="primary"
          size="medium"
          @click="confirm"
        >确定</el-button>
        <el-button
          size="medium"
          @click="close"
        >取消</el-button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  props: ["isShow", "chart"],
  data() {
    return {
      // const
      CHART_TYPE: this.$config.ENUM.CHART_TYPE.ITEMS,

      // options
      tagOptions: [],

      // data
      selectedTags: []

      // tagOptions: [
      //   {
      //     value: "a"
      //   },
      //   {
      //     value: "b"
      //   },
      //   {
      //     value: "c"
      //   },
      //   {
      //     value: "d"
      //   },
      //   {
      //     value: "e"
      //   },
      //   {
      //     value: "f"
      //   }
      // ],
    };
  },
  mounted() {},
  watch: {
    isShow() {
      if (this.isShow) {
        this.reqTags();
        this.selectedTags = this.chart.tags;
      }
    }
  },
  methods: {
    close() {
      this.$emit("close");
    },
    confirm() {
      this.doUpdate();
    },
    checkParams() {
      if (!this.chart) {
        alert("页面过期，请刷新后再尝试");
        return 1;
      }
      return 0;
    },
    doUpdate() {
      if (this.checkParams()) {
        return;
      }
      var that = this;
      this.$api.updateChartTags(this.chart.chartId, this.selectedTags, function(
        response
      ) {
        if (response != null && response.errorMsg) {
          alert(response.errorMsg);
        } else {
          alert("修改成功");
          that.$emit("confirm");
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
    }
  }
};
</script>

<style scoped>
.my-input-value {
  width: 300px;
}
</style>

