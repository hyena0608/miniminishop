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

  insertOrderItem(req /*: InsertOrderItemRequest*/) {
    return new Promise/*<InsertOrderItemResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiOrderitem/5001_insertOrderItem');
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
        let resData = require('../mock/ApiOrderitem/5002_deleteOneOrderItem');
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

  selectOrderitemByMemberIdOrderIdStatus(req /*: SelectOrderitemByMemberIdOrderIdStatusRequest*/) {
    const url = '/api/v1//orderitem/getByOrderId?' + qs.stringify(req);
    return new Promise/*<SelectOrderitemByMemberIdOrderIdStatusResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiOrderitem/5003_selectOrderitemByMemberIdOrderIdStatus');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.get/*<SelectOrderitemByMemberIdOrderIdStatusResponse>*/(url).then(res => {
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
        let resData = require('../mock/ApiOrderitem/5004_deleteAllOrderitem');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.post/*<DeleteAllOrderitemResponse>*/("/api/v1//orderitem/deleteAll", req).then(res => {
        if (res.status === 200) {
          resolve(res.data);
          return;
        }
        console.error(res.status, res.statusText);
        reject(null);
      })
    })
  }

  selectOrderitemByOrderitemId(req /*: SelectOrderitemByOrderitemIdRequest*/) {
    const url = '/api/v1//orderitem/getByOrderitemId?' + qs.stringify(req);
    return new Promise/*<SelectOrderitemByOrderitemIdResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiOrderitem/5005_selectOrderitemByOrderitemId');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.get/*<SelectOrderitemByOrderitemIdResponse>*/(url).then(res => {
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

  insertRider(req /*: InsertRiderRequest*/) {
    return new Promise/*<InsertRiderResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiRider/6001_insertRider');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.post/*<InsertRiderResponse>*/("/api/v1//rider/add", req).then(res => {
        if (res.status === 200) {
          resolve(res.data);
          return;
        }
        console.error(res.status, res.statusText);
        reject(null);
      })
    })
  }

  selectRiderListByStatus(req /*: SelectRiderListByStatusRequest*/) {
    const url = '/api/v1//rider/getRiderListByStatus?' + qs.stringify(req);
    return new Promise/*<SelectRiderListByStatusResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiRider/6002_selectRiderListByStatus');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.get/*<SelectRiderListByStatusResponse>*/(url).then(res => {
        if (res.status === 200) {
          resolve(res.data);
          return;
        }
        console.error(res.status, res.statusText);
        reject(null);
      })
    })
  }

  selectRiderByRiderId(req /*: SelectRiderByRiderIdRequest*/) {
    const url = '/api/v1//rider/getRiderByRiderId?' + qs.stringify(req);
    return new Promise/*<SelectRiderByRiderIdResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiRider/6003_selectRiderByRiderId');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.get/*<SelectRiderByRiderIdResponse>*/(url).then(res => {
        if (res.status === 200) {
          resolve(res.data);
          return;
        }
        console.error(res.status, res.statusText);
        reject(null);
      })
    })
  }

  updateRiderStatus(req /*: UpdateRiderStatusRequest*/) {
    const url = '/api/v1//rider/status?' + qs.stringify(req);
    return new Promise/*<UpdateRiderStatusResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiRider/6004_updateRiderStatus');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.get/*<UpdateRiderStatusResponse>*/(url).then(res => {
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
