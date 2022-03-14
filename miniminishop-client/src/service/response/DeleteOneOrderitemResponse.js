import BaseResponse from '@/service/response/BaseResponse';


export default class DeleteOneOrderItemResponse extends BaseResponse {

  constructor() {
    super();

    this.orderitemId = 0;
  }
}
