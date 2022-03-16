import BaseResponse from '@/service/response/BaseResponse';


export default class SelectOrderitemByMemberIdItemIdResponse extends BaseResponse {

  constructor() {
    super();

    this.orderitem = null;
  }
}
