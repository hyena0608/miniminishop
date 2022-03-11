import BaseResponse from '@/service/response/BaseResponse';


export default class UpdateDeliveryStatusResponse extends BaseResponse {

  constructor() {
    super();

    this.delivery_id = 0;
  }
}
