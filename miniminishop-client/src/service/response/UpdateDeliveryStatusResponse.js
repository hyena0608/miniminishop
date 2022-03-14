import BaseResponse from '@/service/response/BaseResponse';


export default class UpdateDeliveryStatusResponse extends BaseResponse {

  constructor() {
    super();

    this.deliveryId = 0;
  }
}
