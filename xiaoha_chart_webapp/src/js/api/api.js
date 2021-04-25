import cookie from "../storage/cookie.js"
import strings from "../config/strings.js"

var transport = new Thrift.Transport("")
var protocol = new Thrift.Protocol(transport)
var client = new XiaohaChartWebapiClient(protocol)

export default {
  reqChart(option, pageOption, response) {
    var clientSendData = client.send_reqChart(
      new PlatformArgs(),
      option,
      pageOption
    )
    this.doHttpPost(
      clientSendData,
      function() {
        var ret = null
        try {
          ret = client.recv_reqChart()
          response(ret)
        } catch (ei) {
          let eiJson = JSON.stringify(ei)
          if (eiJson != "{}") {
            alert(eiJson)
          } else {
            alert(ei)
          }
        }
      },
      function() {
        var errorInfo = {
          errorCode: -1,
          errorMsg: strings.message.callMethodFail
        }
        response(errorInfo)
      }
    )
  },
  updateChartState(chartId, state, response) {
    var clientSendData = client.send_updateChartState(
      new PlatformArgs(),
      chartId,
      state
    )
    this.doHttpPost(
      clientSendData,
      function() {
        var ret = null
        try {
          ret = client.recv_updateChartState()
          response(ret)
        } catch (ei) {
          let eiJson = JSON.stringify(ei)
          if (eiJson != "{}") {
            alert(eiJson)
          } else {
            alert(ei)
          }
        }
      },
      function() {
        var errorInfo = {
          errorCode: -1,
          errorMsg: strings.message.callMethodFail
        }
        response(errorInfo)
      }
    )
  },
  reqTags(response) {
    var clientSendData = client.send_reqTags(new PlatformArgs())
    this.doHttpPost(
      clientSendData,
      function() {
        var ret = null
        try {
          ret = client.recv_reqTags()
          response(ret)
        } catch (ei) {
          let eiJson = JSON.stringify(ei)
          if (eiJson != "{}") {
            alert(eiJson)
          } else {
            alert(ei)
          }
        }
      },
      function() {
        var errorInfo = {
          errorCode: -1,
          errorMsg: strings.message.callMethodFail
        }
        response(errorInfo)
      }
    )
  },
  reqPlates(response) {
    var clientSendData = client.send_reqPlates(new PlatformArgs())
    this.doHttpPost(
      clientSendData,
      function() {
        var ret = null
        try {
          ret = client.recv_reqPlates()
          response(ret)
        } catch (ei) {
          let eiJson = JSON.stringify(ei)
          if (eiJson != "{}") {
            alert(eiJson)
          } else {
            alert(ei)
          }
        }
      },
      function() {
        var errorInfo = {
          errorCode: -1,
          errorMsg: strings.message.callMethodFail
        }
        response(errorInfo)
      }
    )
  },
  updateChartTags(chartId, tags, response) {
    var clientSendData = client.send_updateChartTags(
      new PlatformArgs(),
      chartId,
      tags
    )
    this.doHttpPost(
      clientSendData,
      function() {
        var ret = null
        try {
          ret = client.recv_updateChartTags()
          response(ret)
        } catch (ei) {
          let eiJson = JSON.stringify(ei)
          if (eiJson != "{}") {
            alert(eiJson)
          } else {
            alert(ei)
          }
        }
      },
      function() {
        var errorInfo = {
          errorCode: -1,
          errorMsg: strings.message.callMethodFail
        }
        response(errorInfo)
      }
    )
  },
  reqTagPage(option, pageOption, response) {
    var clientSendData = client.send_reqTagPage(
      new PlatformArgs(),
      option,
      pageOption
    )
    this.doHttpPost(
      clientSendData,
      function() {
        var ret = null
        try {
          ret = client.recv_reqTagPage()
          response(ret)
        } catch (ei) {
          let eiJson = JSON.stringify(ei)
          if (eiJson != "{}") {
            alert(eiJson)
          } else {
            alert(ei)
          }
        }
      },
      function() {
        var errorInfo = {
          errorCode: -1,
          errorMsg: strings.message.callMethodFail
        }
        response(errorInfo)
      }
    )
  },
  removeTag(tagId, response) {
    var clientSendData = client.send_removeTag(new PlatformArgs(), tagId)
    this.doHttpPost(
      clientSendData,
      function() {
        var ret = null
        try {
          ret = client.recv_removeTag()
          response(ret)
        } catch (ei) {
          let eiJson = JSON.stringify(ei)
          if (eiJson != "{}") {
            alert(eiJson)
          } else {
            alert(ei)
          }
        }
      },
      function() {
        var errorInfo = {
          errorCode: -1,
          errorMsg: strings.message.callMethodFail
        }
        response(errorInfo)
      }
    )
  },
  updateTag(tag, response) {
    var clientSendData = client.send_updateTag(new PlatformArgs(), tag)
    this.doHttpPost(
      clientSendData,
      function() {
        var ret = null
        try {
          ret = client.recv_updateTag()
          response(ret)
        } catch (ei) {
          let eiJson = JSON.stringify(ei)
          if (eiJson != "{}") {
            alert(eiJson)
          } else {
            alert(ei)
          }
        }
      },
      function() {
        var errorInfo = {
          errorCode: -1,
          errorMsg: strings.message.callMethodFail
        }
        response(errorInfo)
      }
    )
  },
  addTag(tag, response) {
    var clientSendData = client.send_addTag(new PlatformArgs(), tag)
    this.doHttpPost(
      clientSendData,
      function() {
        var ret = null
        try {
          ret = client.recv_addTag()
          response(ret)
        } catch (ei) {
          let eiJson = JSON.stringify(ei)
          if (eiJson != "{}") {
            alert(eiJson)
          } else {
            alert(ei)
          }
        }
      },
      function() {
        var errorInfo = {
          errorCode: -1,
          errorMsg: strings.message.callMethodFail
        }
        response(errorInfo)
      }
    )
  },
  /**
   * common do post method
   * @param {thrift send data} clientSendData
   * @param {http success callback} responseSuccess
   * @param {http error callback} responseError
   */
  doHttpPost(clientSendData, responseSuccess, responseError) {
    let proxyhost = this.getProxyHost()
    // alert("proxyhost : " + proxyhost)
    if (!proxyhost) {
      alert("proxyHost is empty, please refresh and try again")
      return
    }
    var proxyurl = proxyhost + "?servant=xiaoha_chart_webapi"
    $.ajax({
      url: proxyurl,
      data: clientSendData,
      type: "POST",
      cache: false,
      contentType: "application/json",
      dataType: "json",
      beforeSend: function(XMLHttpRequest) {
        XMLHttpRequest.setRequestHeader(
          "X-Oa-Falcon-Sig",
          cookie.getCookie("oa_falcon_sig")
        )
        XMLHttpRequest.setRequestHeader(
          "X-Oa-User-Id",
          cookie.getCookie("oa_user_id")
        )
        XMLHttpRequest.setRequestHeader(
          "X-Oa-User-Name",
          cookie.getCookie("oa_user_name")
        )
        XMLHttpRequest.setRequestHeader(
          "X-Oa-User-Secret",
          cookie.getCookie("oa_user_secret")
        )
      },
      success: function(res) {
        transport.setRecvBuffer(res)
        responseSuccess()
      },
      error: function() {
        responseError()
      }
    })
  },
  getProxyHost() {
    var host = window.location.host
    if (host === "192.168.0.62:8080") {
      return "http://xiaoha-chart.devoa.xueqiao.cn/webapi"
    } else if (host == "localhost:8080") {
      return "http://xiaoha-chart.devoa.xueqiao.cn/webapi"
    }
    return "/webapi"
  }
}
