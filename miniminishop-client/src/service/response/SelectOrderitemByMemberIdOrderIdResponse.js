import BaseResponse from '@/service/response/BaseResponse';


export default class SelectOrderitemByMemberIdOrderIdResponse extends BaseResponse {

  constructor() {
    super();

    this.orderitemsDetail = null;
  }
}
