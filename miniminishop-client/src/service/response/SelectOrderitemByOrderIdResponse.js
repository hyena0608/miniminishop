import BaseResponse from '@/service/response/BaseResponse';


export default class SelectOrderitemByOrderIdResponse extends BaseResponse {

  constructor() {
    super();

    this.orderitemsDetail = null;
  }
}
