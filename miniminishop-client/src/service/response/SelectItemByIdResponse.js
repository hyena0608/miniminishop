import BaseResponse from '@/service/response/BaseResponse';


export default class SelectItemByIdResponse extends BaseResponse {

  constructor() {
    super();

    this.item = null;
  }
}
