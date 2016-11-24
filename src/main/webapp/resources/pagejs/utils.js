/**
 * Created by OPtilex on 2016/11/4.
 */
var defaultLength = 10;//默认分页阑珊

var paging=function (total,callback) {
    var _self=this;
    _self.init=function () {
        if(total<defaultLength)return;
        _self.generateHtml(1);
    }
    
    _self.generateHtml=function (index) {
        var content = "<li class=\"disabled\"><a href=\"javascript:void(0);\"> &laquo;</a></li>";
        for (var i = index; i <= index*defaultLength; i++) {
            if(i==index){
                content += "<li><a href=\"javascript:void(0);\" class='active'>" + i + "</a></li>";
            }else
                content += "<li><a href=\"javascript:void(0);\">" + i + "</a></li>";
        }
        content += "<li><a href=\"javascript:void(0);\" onclick=''>&raquo;</a></li>";
        $(".pagination").empty();
        $(content).appendTo($(".pagination"));
    }
    
    _self.nextPage=function () {
        
    }
    
}


var defaultLength = 10;//默认分页阑珊
var TOTAL;
function generatePageing(total, callBack) {
    if(total<10)return;
    TOTAL=total;
    var conent = "<li class=\"disabled\"><a href=\"javascript:void(0);\"> &laquo;</a></li>";
    if(total >10){
        total=10;
    }
    for (var i = 1; i <= total; i++) {
        if(i==1){
            conent += "<li><a href=\"javascript:void(0); class='active' onClick=next('"+i+"')>" + i + "</a></li>";
        }else
            conent += "<li><a href=\"javascript:void(0); onClick=next('"+i+"')>" + i + "</a></li>";
    }
    conent += "<li><a href=\"javascript:void(0);\" onclick=''>&raquo;</a></li>";
    $(conent).appendTo($(".pagination"));
}

function next(number) {
    alert(number);
}