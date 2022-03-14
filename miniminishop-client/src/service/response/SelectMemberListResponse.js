import BaseResponse from '@/service/response/BaseResponse';


export default class SelectMemberListResponse extends BaseResponse {

  constructor() {
    super();

    this.members = null;
  }
}
