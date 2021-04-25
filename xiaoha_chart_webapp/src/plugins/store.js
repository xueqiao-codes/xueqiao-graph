import Vue from "vue"
import Vuex from "vuex"

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    navigationStack: [
      { name: "投研图表管理 行情图表", router: { path: "/sending" } }
    ]
  },
  mutations: {
    resetNavigationStack(state) {
      state.navigationStack = []
    },
    pushNavigationStack(state, item) {
      state.navigationStack.push(item)
    }
  },
  actions: {}
})
