/**
 * Created by OPtilex on 2016/11/4.
 */
var resource=function () {
    var _self=this;
    _self.init=function () {
        $("#change").bind("click",function () {
            data.title="dddsljflsjflsjf";
            var html = template('test', data);
            document.getElementById('content').innerHTML = html;
        });
    }

    _self.generateTable=function(data) {
        var html = template('test', data);
        document.getElementById('content').innerHTML = html;
    }
    
    _self.loadResourceData=function () {
        $.ajax({
            type: "get",
            dataType: "json",
            url: "resources",
            data: {},
            success: function(data) {
                if(data.code===0){
                    toastr.success('操作成功');
                    _self.generateTable(data)
                    var content= generatePageing(data.data.totalRow,null);
                    //alert(content);
                }else{
                    toastr.error('操作失败');
                }
            },
            error: function(err) {
                toastr.error('操作失败');
            }
        });
    }
}

var res;
$(document).ready(function () {
    res=new resource();
    res.init();
    res.loadResourceData();
});