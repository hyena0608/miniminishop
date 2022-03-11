

export default class ResultCode {

  static Success = 0; // 성공

  static Failed = -1; // 실패

  static Unauthorized = 401; // Unauthorized

  static NotFoundUser = 1000; // 사용자를 찾을 수 없습니다.

  static BadParams = 10100; // 파라미터가 유효하지 않습니다.

  static DbFailed = 99999; // DB 실패

  static get(code /*: number */) {

    switch(code) {
      case 0: return "성공";
      case -1: return "실패";
      case 401: return "Unauthorized";
      case 1000: return "사용자를 찾을 수 없습니다.";
      case 10100: return "파라미터가 유효하지 않습니다.";
      case 99999: return "DB 실패";
    }
    return "Uknown";
  }
}
