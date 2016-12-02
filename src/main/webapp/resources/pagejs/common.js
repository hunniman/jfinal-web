/**
 * Created by OPtilex on 2016/11/25.
 */
var menu=function () {
    var _self=this;
    
    _self.initEvent=function () {
        $(".nav-sidebar li").bind("click",function () {
            var url=$(this).attr("url");
            $(".nav-sidebar li").removeAttr("class");
            $(this).attr("class","active");
            $("#loadingDiv").show();
            $("#mainContent").load(url,function() {
                $("#loadingDiv").fadeOut();
            });
        });
    }
    _self.loadPage=function (url,data) {
        $("#loadingDiv").show();
        $("#mainContent").load(url,data,function() {
            $("#loadingDiv").fadeOut();
        });
    }


}
var mu;

$(document).ready(function () {
    mu=new menu();
    mu.initEvent();
});


function AJAX(url,data,methodType,callback) {
    $.ajax({
        type: methodType,
        dataType: "json",
        url: url,
        data: data,
        beforeSend:function () {
           if(methodType==="get"||methodType==="GET"){
               $("#loadingDiv").show();
           }
        },
        success: function(data) {
            if(data.code===0){
                callback(data);
            }else{
                toastr.error('操作失败');
            }
        },
        error: function(err) {
            toastr.error('操作失败');
        }
    }).done(function () {
        $("#loadingDiv").fadeOut();
    });
}

