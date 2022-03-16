import BaseResponse from '@/service/response/BaseResponse';


export default class SelectOrderitemByOrderitemIdResponse extends BaseResponse {

  constructor() {
    super();

    this.orderitem = null;
  }
}
