import BaseResponse from '@/service/response/BaseResponse';


export default class SelectItemByNameResponse extends BaseResponse {

  constructor() {
    super();

    this.item = null;
  }
}
