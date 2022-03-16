import BaseResponse from '@/service/response/BaseResponse';


export default class DeleteAllOrderitemHandlerResponse extends BaseResponse {

  constructor() {
    super();

    this.orderId = 0;
  }
}
