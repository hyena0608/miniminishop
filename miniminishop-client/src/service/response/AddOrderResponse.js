import BaseResponse from '@/service/response/BaseResponse';


export default class AddOrderResponse extends BaseResponse {

  constructor() {
    super();

    this.order_id = 0;
  }
}
