package com.joker.common.other;

import lombok.Data;

/**
 * Created by OPtilex on 2016/11/4.
 */
@Data
public class ResponseModel {

    private int code;

    private String msg;

    private Object data;


    public static ResponseModel buildSuccess() {
        ResponseModel responseModel = new ResponseModel();
        responseModel.code = CodeMsgEnum.SUCCESS.getCode();
        responseModel.msg = CodeMsgEnum.SUCCESS.getMsg();
        return responseModel;
    }

    public static ResponseModel buildSuccess(Object obj) {
        ResponseModel responseModel = new ResponseModel();
        responseModel.code = CodeMsgEnum.SUCCESS.getCode();
        responseModel.msg = CodeMsgEnum.SUCCESS.getMsg();
        responseModel.data = obj;
        return responseModel;
    }

    public static ResponseModel buildError() {
        ResponseModel responseModel = new ResponseModel();
        responseModel.code = CodeMsgEnum.ERROR.getCode();
        responseModel.msg = CodeMsgEnum.ERROR.getMsg();
        return responseModel;
    }
}
