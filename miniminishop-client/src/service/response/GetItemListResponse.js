import BaseResponse from '@/service/response/BaseResponse';


export default class GetItemListResponse extends BaseResponse {

  constructor() {
    super();

    this.items = null;
  }
}
