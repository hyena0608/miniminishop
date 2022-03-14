import BaseResponse from '@/service/response/BaseResponse';


export default class DeleteItemResponse extends BaseResponse {

  constructor() {
    super();

    this.itemId = 0;
  }
}
