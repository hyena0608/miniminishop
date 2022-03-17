import BaseResponse from '@/service/response/BaseResponse';


export default class SelectRiderByRiderIdResponse extends BaseResponse {

  constructor() {
    super();

    this.rider = null;
  }
}
