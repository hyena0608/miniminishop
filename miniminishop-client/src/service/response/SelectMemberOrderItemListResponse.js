import BaseResponse from '@/service/response/BaseResponse';


export default class SelectMemberOrderItemListResponse extends BaseResponse {

  constructor() {
    super();

    this.memberOrderItemList = null;
  }
}
