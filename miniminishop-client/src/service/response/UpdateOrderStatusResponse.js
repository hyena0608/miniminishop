import BaseResponse from '@/service/response/BaseResponse';


export default class UpdateOrderStatusResponse extends BaseResponse {

  constructor() {
    super();

    this.orderId = 0;
  }
}
