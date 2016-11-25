/**
 * Created by OPtilex on 2016/11/25.
 */
var menu=function () {
    var _self=this;
    
    _self.initEvent=function () {
        $(".nav-sidebar li").bind("click",function () {
            var url=$(this).attr("url");
            $("#mainContent").load(url);
        });
    }
}
var mu;
$(document).ready(function () {
    mu=new menu();
    mu.initEvent();
});