package com.joker.common.other;


/**
 * @Description: Return status code and description
 * @Copyright: Copyright by AIRAG
 * @Author: ZhengCongchun
 * @Created: 2016-07-22
 * @version: 1.0
 */
public enum CodeMsgEnum {

    /*SUCCESS(0, "操作成功!"),
    ERROR_MESSAGE_FORMAT(1, "请求消息格式错误!"),
    ERROR_MISSING_PARAMETER(2, "请求消息缺少参数{}!"),
    FAILED_SYNC_OSS(3, "图片保存到OSS发生错误!"),
    FAILED_DATA_NOT_FOUND(4, "未查询到数据!"),
    FAILED_DATA_EXISTED(5, "数据已存在!"),
    FAILED_USER_ID_NOT_FOUND(6, "USER_ID不存在!"),
    FAILED_INVALID_VERSION(7,"接口版本号不正确!"),
    ERROR_REMOTE_REQUEST(8,"远程{}请求发生错误!"),
    ERROR(9, "操作失败!"),
    UNKNOWN_EXCEPTION(99, "系统异常!");*/


    SUCCESS(0, "接口响应成功!"),
    ERROR(-1, "接口发生失败!"),
    WRONG_PARAMETER(1001,"请求参数错误"),
    ERROR_MISSING_PARAMETER(1002,"参数错误：请求消息缺少参数{#}!!"),
    ERROR_INVALID_FORMAT(1003,"参数错误：请求消息格式错误!"),
    FAILED_NO_FOUND_DATA(1004, "数据不存在!"),
    FAILED_EXITS(1005, "数据已存在!"),
    ERROR_USER_ID_NOT_EXIST(1006,"USER_ID不存在!"),
    ERROR_INVALID_VERSION(1007,"接口版本号不正确!"),
    ERROR_REMOTE_LOSE(1008,"远程{#}请求发生错误!"),
    FAILED_INCORRECT_PASSWORD(1009,"登录密码不正确!"),
    FAILED_ACCOUNT_NOT_EXIST(1010,"登录帐号不存在!"),
    /***定农眼失败***/
    FAILED_USER_BOUND(1011,"当前用户与该农眼绑定过！"),
    FAILED_USER_NOT_EXIST(1012,"当前用户不存在！"),
    FAILED_AE_BOUND(1013,"当前农眼已被用户绑定！"),
    FAILED_INVALID_AE_ID(1014,"农眼ID无效!"),
    FAILED_USER_AE_BOUND(1015,"当前农眼已被其他农场主绑定！");

    int code;
    String msg;

    CodeMsgEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static String getMsg(int code) {
        for (CodeMsgEnum codeMsg : CodeMsgEnum.values()) {
            if (codeMsg.code == code) {
                return codeMsg.msg;
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static void main(String[]args){
        String msg="参数错误：请求消息缺少参数{#}!!";
        System.err.println(msg.replaceAll("#","dddsdkfjslkdf"));
    }
}
