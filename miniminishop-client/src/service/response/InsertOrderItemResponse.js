import BaseResponse from '@/service/response/BaseResponse';


export default class InsertOrderItemResponse extends BaseResponse {

  constructor() {
    super();

    this.orderitemId = 0;
  }
}
