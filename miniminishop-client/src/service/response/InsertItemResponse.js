import BaseResponse from '@/service/response/BaseResponse';


export default class InsertItemResponse extends BaseResponse {

  constructor() {
    super();

    this.itemId = 0;
  }
}
