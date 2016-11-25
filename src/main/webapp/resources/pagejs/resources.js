/**
 * Created by OPtilex on 2016/11/4.
 */
var resource=function () {
    var _self=this;
    _self.loading;
    _self.init=function () {
        $("#change").bind("click",function () {
            data.title="dddsljflsjflsjf";
            var html = template('test', data);
            document.getElementById('content').innerHTML = html;
        });
        _self.loading=Ladda.create(document.querySelector('#btnSearch'));
        $("#btnSearch").bind("click",function () {
            _self.loading.start();
            _self.search();
        });
    };

    _self.search=function () {
        var data={"searchData":$("#searchFile").val()};
        _self.getData("resources",data,function (d) {
            _self.loading.stop();
            _self.generateTable(d)
            paging.init(d.data.totalRow, res.tableCallback,true);
        });
    };

    _self.generateTable=function(data) {
        var html = template('test', data);
        document.getElementById('content').innerHTML = html;
    }
    
    _self.getData=function (url,data,callback) {
        $.ajax({
            type: "get",
            dataType: "json",
            url: url,
            data: data,
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
        });
    }
    
    _self.loadResourceData=function (pageNum,pageSize) {
        var data={"pageNum":pageNum,"pageSize":pageSize,"searchData":$("#searchFile").val()};
        _self.getData("resources",data,function (d) {
            toastr.success('操作成功');
            _self.generateTable(d)
            paging.init(d.data.totalRow, res.tableCallback,true);
        });
       /* $.ajax({
            type: "get",
            dataType: "json",
            url: "resources",
            data: {"pageNum":pageNum,"pageSize":pageSize},
            success: function(data) {
                if(data.code===0){
                    toastr.success('操作成功');
                    _self.generateTable(data)
                     paging.init(data.data.totalRow, res.tableCallback,true);
                }else{
                    toastr.error('操作失败');
                }
            },
            error: function(err) {
                toastr.error('操作失败');
            }
        });*/
    };

    _self.tableCallback=function (pageNum,pageSize) {
        var data={"pageNum":pageNum,"pageSize":pageSize,"searchData":$("#searchFile").val()};
        _self.getData("resources",data,function (d) {
            //toastr.success('操作成功');
            _self.generateTable(d)
            paging.init(d.data.totalRow, res.tableCallback,false);
        });
        /*
        $.ajax({
            type: "get",
            dataType: "json",
            url: "resources",
            data: {"pageNum":pageNum,"pageSize":pageSize},
            success: function(data) {
                if(data.code===0){
                   // toastr.success('操作成功');
                    _self.generateTable(data)
                    paging.init(data.data.totalRow, res.tableCallback,false);
                }else{
                    toastr.error('操作失败');
                }
            },
            error: function(err) {
                toastr.error('操作失败');
            }
        });*/
    }
}

var res;
var paging;
$(document).ready(function () {
    res=new resource();
    res.init();
    res.loadResourceData(1,defaultLength);
    paging=new paging();
});