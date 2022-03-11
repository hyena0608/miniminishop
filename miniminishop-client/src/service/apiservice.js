import Vue from 'vue';
import qs from 'query-string';


export class ApiService {

  constructor() {
    this.useMock = false;
  }

  setAccessToken(accessToken /*: string*/) {
    Vue.axios.defaults.headers.common['Authorization'] = accessToken;
  }

  addDelivery(req /*: AddDeliveryRequest*/) {
    const url = '/api/v1//delivery/add?' + qs.stringify(req);
    return new Promise/*<AddDeliveryResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiDelivery/4001_addDelivery');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.get/*<AddDeliveryResponse>*/(url).then(res => {
        if (res.status === 200) {
          resolve(res.data);
          return;
        }
        console.error(res.status, res.statusText);
        reject(null);
      })
    })
  }

  updateDeliveryStatus(req /*: UpdateDeliveryStatusRequest*/) {
    return new Promise/*<UpdateDeliveryStatusResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiDelivery/4002_updateDeliveryStatus');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.post/*<UpdateDeliveryStatusResponse>*/("/api/v1//delivery/update", req).then(res => {
        if (res.status === 200) {
          resolve(res.data);
          return;
        }
        console.error(res.status, res.statusText);
        reject(null);
      })
    })
  }

  addItem(req /*: AddItemRequest*/) {
    return new Promise/*<AddItemResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiItem/2001_addItem');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.post/*<AddItemResponse>*/("/api/v1//item/add", req).then(res => {
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

  getItemList(req /*: GetItemListRequest*/) {
    const url = '/api/v1//item/list?' + qs.stringify(req);
    return new Promise/*<GetItemListResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiItem/2004_getItemList');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.get/*<GetItemListResponse>*/(url).then(res => {
        if (res.status === 200) {
          resolve(res.data);
          return;
        }
        console.error(res.status, res.statusText);
        reject(null);
      })
    })
  }

  getItem(req /*: GetItemRequest*/) {
    const url = '/api/v1//item/get?' + qs.stringify(req);
    return new Promise/*<GetItemResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiItem/2005_getItem');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.get/*<GetItemResponse>*/(url).then(res => {
        if (res.status === 200) {
          resolve(res.data);
          return;
        }
        console.error(res.status, res.statusText);
        reject(null);
      })
    })
  }

  addMember(req /*: AddMemberRequest*/) {
    return new Promise/*<AddMemberResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiMember/1001_addMember');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.post/*<AddMemberResponse>*/("/api/v1//member/add", req).then(res => {
        if (res.status === 200) {
          resolve(res.data);
          return;
        }
        console.error(res.status, res.statusText);
        reject(null);
      })
    })
  }

  addOrder(req /*: AddOrderRequest*/) {
    return new Promise/*<AddOrderResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiOrder/3001_addOrder');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.post/*<AddOrderResponse>*/("/api/v1//order/add", req).then(res => {
        if (res.status === 200) {
          resolve(res.data);
          return;
        }
        console.error(res.status, res.statusText);
        reject(null);
      })
    })
  }

  cancelOrder(req /*: CancelOrderRequest*/) {
    return new Promise/*<CancelOrderResponse>*/((resolve, reject) => {
      if (this.useMock) {
        let resData = require('../mock/ApiOrder/3002_cancelOrder');
        resolve(resData.default[0]);
        return;
      }
      Vue.axios.post/*<CancelOrderResponse>*/("/api/v1//order/status", req).then(res => {
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
