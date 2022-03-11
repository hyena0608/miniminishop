import BaseResponse from '@/service/response/BaseResponse';


export default class AddItemResponse extends BaseResponse {

  constructor() {
    super();

    this.item_id = 0;
  }
}
