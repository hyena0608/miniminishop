import BaseResponse from '@/service/response/BaseResponse';


export default class SelectRiderListByStatusResponse extends BaseResponse {

  constructor() {
    super();

    this.riders = null;
  }
}
