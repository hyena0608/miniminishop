import BaseResponse from '@/service/response/BaseResponse';


export default class InsertOrderResponse extends BaseResponse {

  constructor() {
    super();

    this.orderId = 0;
  }
}
