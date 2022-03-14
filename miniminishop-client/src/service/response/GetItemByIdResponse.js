import BaseResponse from '@/service/response/BaseResponse';


export default class GetItemByIdResponse extends BaseResponse {

  constructor() {
    super();

    this.item = null;
  }
}
