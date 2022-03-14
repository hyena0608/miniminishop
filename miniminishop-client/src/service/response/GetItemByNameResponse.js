import BaseResponse from '@/service/response/BaseResponse';


export default class GetItemByNameResponse extends BaseResponse {

  constructor() {
    super();

    this.item = null;
  }
}
