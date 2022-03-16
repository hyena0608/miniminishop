import Vue from 'vue';
import qs from 'query-string';


export class ApiService {

  constructor() {
    this.useMock = false;
  }

  setAccessToken(accessToken /*: string*/) {
    Vue.axios.defaults.headers.common['Authorization'] = accessToken;
  }

  insertDelivery(req /*: InsertDeliveryRequest*/) {
    return new Promise/*<InsertDeliveryResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiDelivery/4001_insertDelivery');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.post/*<InsertDeliveryResponse>*/("/api/v1//delivery/add", req).then(res => {
        if (res.status === 200) {
          resolve(res.data);
          return;
        }
        console.error(res.status, res.statusText);
        reject(null);
      })
    })
  }

  updateDelivery(req /*: UpdateDeliveryRequest*/) {
    return new Promise/*<UpdateDeliveryResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiDelivery/4002_updateDelivery');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.post/*<UpdateDeliveryResponse>*/("/api/v1//delivery/update", req).then(res => {
        if (res.status === 200) {
          resolve(res.data);
          return;
        }
        console.error(res.status, res.statusText);
        reject(null);
      })
    })
  }

  insertItem(req /*: InsertItemRequest*/) {
    return new Promise/*<InsertItemResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiItem/2001_insertItem');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.post/*<InsertItemResponse>*/("/api/v1//item/add", req).then(res => {
        if (res.status === 200) {
          resolve(res.data);
          return;
        }
        console.error(res.status, res.statusText);
        reject(null);
      })
    })
  }

  deleteItem(req /*: DeleteItemRequest*/) {
    return new Promise/*<DeleteItemResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiItem/2002_deleteItem');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.post/*<DeleteItemResponse>*/("/api/v1//item/delete", req).then(res => {
        if (res.status === 200) {
          resolve(res.data);
          return;
        }
        console.error(res.status, res.statusText);
        reject(null);
      })
    })
  }

  updateItem(req /*: UpdateItemRequest*/) {
    return new Promise/*<UpdateItemResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiItem/2003_updateItem');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.post/*<UpdateItemResponse>*/("/api/v1//item/update", req).then(res => {
        if (res.status === 200) {
          resolve(res.data);
          return;
        }
        console.error(res.status, res.statusText);
        reject(null);
      })
    })
  }

  selectItemList(req /*: SelectItemListRequest*/) {
    const url = '/api/v1//item/list?' + qs.stringify(req);
    return new Promise/*<SelectItemListResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiItem/2004_selectItemList');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.get/*<SelectItemListResponse>*/(url).then(res => {
        if (res.status === 200) {
          resolve(res.data);
          return;
        }
        console.error(res.status, res.statusText);
        reject(null);
      })
    })
  }

  selectItemByName(req /*: SelectItemByNameRequest*/) {
    const url = '/api/v1//item/getByName?' + qs.stringify(req);
    return new Promise/*<SelectItemByNameResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiItem/2005_selectItemByName');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.get/*<SelectItemByNameResponse>*/(url).then(res => {
        if (res.status === 200) {
          resolve(res.data);
          return;
        }
        console.error(res.status, res.statusText);
        reject(null);
      })
    })
  }

  selectItemById(req /*: SelectItemByIdRequest*/) {
    const url = '/api/v1//item/getById?' + qs.stringify(req);
    return new Promise/*<SelectItemByIdResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiItem/2006_selectItemById');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.get/*<SelectItemByIdResponse>*/(url).then(res => {
        if (res.status === 200) {
          resolve(res.data);
          return;
        }
        console.error(res.status, res.statusText);
        reject(null);
      })
    })
  }

  insertMember(req /*: InsertMemberRequest*/) {
    return new Promise/*<InsertMemberResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiMember/1001_insertMember');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.post/*<InsertMemberResponse>*/("/api/v1//member/add", req).then(res => {
        if (res.status === 200) {
          resolve(res.data);
          return;
        }
        console.error(res.status, res.statusText);
        reject(null);
      })
    })
  }

  selectMemberList(req /*: SelectMemberListRequest*/) {
    const url = '/api/v1//member/getMemberList?' + qs.stringify(req);
    return new Promise/*<SelectMemberListResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiMember/1002_selectMemberList');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.get/*<SelectMemberListResponse>*/(url).then(res => {
        if (res.status === 200) {
          resolve(res.data);
          return;
        }
        console.error(res.status, res.statusText);
        reject(null);
      })
    })
  }

  selectMemberById(req /*: SelectMemberByIdRequest*/) {
    const url = '/api/v1//member/getMemberById?' + qs.stringify(req);
    return new Promise/*<SelectMemberByIdResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiMember/1003_selectMemberById');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.get/*<SelectMemberByIdResponse>*/(url).then(res => {
        if (res.status === 200) {
          resolve(res.data);
          return;
        }
        console.error(res.status, res.statusText);
        reject(null);
      })
    })
  }

  insertOrder(req /*: InsertOrderRequest*/) {
    return new Promise/*<InsertOrderResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiOrder/3001_insertOrder');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.post/*<InsertOrderResponse>*/("/api/v1//order/add", req).then(res => {
        if (res.status === 200) {
          resolve(res.data);
          return;
        }
        console.error(res.status, res.statusText);
        reject(null);
      })
    })
  }

  updateOrderStatus(req /*: UpdateOrderStatusRequest*/) {
    return new Promise/*<UpdateOrderStatusResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiOrder/3002_updateOrderStatus');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.post/*<UpdateOrderStatusResponse>*/("/api/v1//order/status", req).then(res => {
        if (res.status === 200) {
          resolve(res.data);
          return;
        }
        console.error(res.status, res.statusText);
        reject(null);
      })
    })
  }

  insertOrderItem(req /*: InsertOrderItemRequest*/) {
    return new Promise/*<InsertOrderItemResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiOrderiem/5001_insertOrderItem');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.post/*<InsertOrderItemResponse>*/("/api/v1//orderitem/add", req).then(res => {
        if (res.status === 200) {
          resolve(res.data);
          return;
        }
        console.error(res.status, res.statusText);
        reject(null);
      })
    })
  }

  deleteOneOrderItem(req /*: DeleteOneOrderItemRequest*/) {
    return new Promise/*<DeleteOneOrderItemResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiOrderiem/5002_deleteOneOrderItem');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.post/*<DeleteOneOrderItemResponse>*/("/api/v1//orderitem/delete", req).then(res => {
        if (res.status === 200) {
          resolve(res.data);
          return;
        }
        console.error(res.status, res.statusText);
        reject(null);
      })
    })
  }

  selectOrderitemByMemberIdOrderId(req /*: SelectOrderitemByMemberIdOrderIdRequest*/) {
    const url = '/api/v1//orderitem/getByOrderId?' + qs.stringify(req);
    return new Promise/*<SelectOrderitemByMemberIdOrderIdResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiOrderiem/5003_selectOrderitemByMemberIdOrderId');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.get/*<SelectOrderitemByMemberIdOrderIdResponse>*/(url).then(res => {
        if (res.status === 200) {
          resolve(res.data);
          return;
        }
        console.error(res.status, res.statusText);
        reject(null);
      })
    })
  }

  deleteAllOrderitem(req /*: DeleteAllOrderitemRequest*/) {
    return new Promise/*<DeleteAllOrderitemResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiOrderiem/5004_deleteAllOrderitem');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.post/*<DeleteAllOrderitemResponse>*/("/api/v1//orderitem/delete", req).then(res => {
        if (res.status === 200) {
          resolve(res.data);
          return;
        }
        console.error(res.status, res.statusText);
        reject(null);
      })
    })
  }
}
const _api = new ApiService();
ApiService.install = function (Vue, /* options?: any */) {
  Vue.api = _api;
  Object.defineProperties(Vue.prototype, {
    $api:  {
      get() {
        return _api;
      }
    },
    api:  {
      get() {
        return _api;
      }
    }
  })
}

Vue.use(ApiService);

export default ApiService;
