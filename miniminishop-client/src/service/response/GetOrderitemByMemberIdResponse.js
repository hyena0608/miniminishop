import BaseResponse from '@/service/response/BaseResponse';


export default class GetOrderitemByMemberIdResponse extends BaseResponse {

  constructor() {
    super();

    this.orderitems = null;
  }
}
