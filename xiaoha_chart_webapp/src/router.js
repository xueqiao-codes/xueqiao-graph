import Vue from "vue"
import Router from "vue-router"
import Home from "./views/Home.vue"
import ResearchChartManager from "./views/ResearchChartManager.vue"
import ChartQuotation from "./views/ChartQuotation.vue"
import TagManager from "./views/TagManager.vue"

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: "/",
      name: "home",
      component: Home,
      redirect: "/chart/quotation",
      children: [
        {
          path: "chart",
          name: "chart",
          component: ResearchChartManager,
          children: [
            {
              path: "quotation",
              name: "quotation",
              component: ChartQuotation
            }
          ]
        },
        {
          path: "tag",
          name: "tag",
          component: TagManager
        }
      ]
    }
  ]
})
