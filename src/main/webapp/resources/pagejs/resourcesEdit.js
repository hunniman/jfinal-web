/**
 * Created by OPtilex on 2016/11/4.
 */
var resourceEdit=function () {
    var _self=this;
    _self.loading;
    _self.init=function () {
        $("#btnBack").bind("click",function () {
            mu.loadPage("/resource/",{});
        });
        $("#btnReg").bind("click",function () {
            _self.updateData();
        });
        _self.validation();
    };

    _self.updateData=function () {
        $('#roleForm').bootstrapValidator('validate');
        if ($('#roleForm').data('bootstrapValidator').isValid()) {
            var data=$('#roleForm').serialize();
            AJAX("resource/do_edit",data,"post",function (data) {
                if(data.code==0)
                    mu.loadPage("/resource/",{});
                else{
                    alert(data.msg);
                }
            });
        }
    }

    _self.validation=function () {
        $('.form-horizontal').bootstrapValidator({
            message: 'This value is not valid',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                resource_name: {
                    validators: {
                        notEmpty: {
                            message: '请输入resource_name.....'
                        },
                        stringLength: {
                            min: 1,
                            max: 100,
                            message: '长度在1~100个字符长度'
                        }
                    }
                }, resource_string: {
                            validators: {
                                notEmpty: {
                                    message: '请输入resource_string'
                                },
                                stringLength: {
                                    min: 1,
                                    max: 200,
                                    message: '长度在1~200个字符长度'
                                }
                            }
                        }, resource_method: {
                            validators: {
                                notEmpty: {
                                    message: '请输入resource_method'
                                },
                                stringLength: {
                                    min: 1,
                                    max: 200,
                                    message: '长度在1~200个字符长度'
                                }
                            }
                        }
                }
        });
    };

    _self.update=function(id){
        mu.loadPage("/resource/show_edit",{"id":id});
    }

}

var resEdit;
$(document).ready(function () {
    resEdit=new resourceEdit();
    resEdit.init();
});