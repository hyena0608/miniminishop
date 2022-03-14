import BaseResponse from '@/service/response/BaseResponse';


export default class GetOrderitemByOrderIdResponse extends BaseResponse {

  constructor() {
    super();

    this.orderitems = null;
  }
}
