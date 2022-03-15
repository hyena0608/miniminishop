import BaseResponse from '@/service/response/BaseResponse';


export default class SelectOrderitemByMemberIdResponse extends BaseResponse {

  constructor() {
    super();

    this.orderitems = null;
  }
}
