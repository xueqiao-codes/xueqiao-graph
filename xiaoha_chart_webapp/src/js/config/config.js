export default {
  PROXY_ROUTER: {
    LOCALHOST: {
      HOST: "localhost:8080",
      PROXY_HOST: "https://devproxy.xueqiao.cn"
    },
    DEV: {
      HOST: "errorcode-manager.devoa.xueqiao.cn",
      PROXY_HOST: "https://devproxy.xueqiao.cn"
    },
    GAMMA: {
      HOST: "errorcode-manager.gaoa.xueqiao.cn",
      PROXY_HOST: "https://gaproxy.xueqiao.cn"
    },
    IDC: {
      HOST: "errorcode-manager.oa.xueqiao.cn",
      PROXY_HOST: "https://proxy.xueqiao.cn"
    }
  },
  ENUM: {
    CHART_TYPE: {
      DESCRIPTION: "信箱消息发送渠道",
      ITEMS: [
        {
          KEY: "HISTORICAL_DATA",
          VALUE: 0,
          LABEL: "历年期货价格"
        },
        {
          KEY: "SPREAD_MONTH",
          VALUE: 1,
          LABEL: "跨期"
        },
        {
          KEY: "SPREAD_COMMODITY",
          VALUE: 2,
          LABEL: "跨品种"
        },
        {
          KEY: "FORWARD_CURVE",
          VALUE: 3,
          LABEL: "远期曲线"
        }
      ]
    }
  }
}
