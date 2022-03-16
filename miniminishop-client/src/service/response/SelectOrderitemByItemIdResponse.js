import BaseResponse from '@/service/response/BaseResponse';


export default class SelectOrderitemByItemIdResponse extends BaseResponse {

  constructor() {
    super();

    this.orderitem = null;
  }
}
