import BaseResponse from '@/service/response/BaseResponse';


export default class GetItemResponse extends BaseResponse {

  constructor() {
    super();

    this.item = null;
  }
}
