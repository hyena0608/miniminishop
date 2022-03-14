import BaseResponse from '@/service/response/BaseResponse';


export default class SelectMemberByIdResponse extends BaseResponse {

  constructor() {
    super();

    this.member = null;
  }
}
