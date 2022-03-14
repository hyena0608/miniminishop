import BaseResponse from '@/service/response/BaseResponse';


export default class SelectItemListResponse extends BaseResponse {

  constructor() {
    super();

    this.items = null;
  }
}
