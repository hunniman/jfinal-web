package com.joker.resource;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;
import com.joker.common.model.Resources;
import com.joker.common.other.ResponseModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * IndexController
 */
public class ResourceController extends Controller {

    private static final Logger logger = LoggerFactory.getLogger(ResourceController.class);

    public void index() {

      /*  MongoQuery query=new MongoQuery();
        Teacher teacher=new Teacher();
        teacher.setName("踢宝宝");
        List<Teacher> teacher1 = query.use("teacher").find(Teacher.class);
        teacher1.forEach(s->{
            System.err.print(s.getId()+":"+s.getName());
        });*/
        render("index.jsp");
    }

    /* @Before(GET.class)*/
    @ActionKey("/resource/show_edit")
    public void showEdit() {
        int id = getParaToInt("id", 0);
        Resources resources =null;
        if(id>0){
            resources = Resources.dao.findById(id);
        }
        setAttr("resource", resources);
        render("edit.jsp");
    }

    @ActionKey("/resource/do_edit")
    public void doEdit() {
        ResponseModel  responseModel=null;
        try{
            String resource_id = getPara("resource_id");
            String resource_name = getPara("resource_name");
            String resource_type = getPara("resource_type");
            String resource_string = getPara("resource_string");
            String enabled = getPara("enabled");
            String resource_method = getPara("resource_method");
            String resource_desc = getPara("resource_desc");
            Resources resources = Resources.dao.findById(resource_id);
            boolean isAdd=true;
            if(resources==null){
                resources=new Resources();
                resources.set("create_time",new Date());
            }else{
                isAdd=false;
                resources.set("update_time",new Date());
            }
            if(resource_id!=null&&resource_id.trim().length()>0)
                 resources.setResourceId(Long.parseLong(resource_id));
            resources.setResourceName(resource_name);
            resources.setResourceType(resource_type);
            resources.setResourceString(resource_string);
            int enda=(enabled!=null&&enabled.equals("on"))?1:0;
            resources.setEnabled(enda);
            resources.setResourceMethod(resource_method);
            resources.setResourceDesc(resource_desc);
            if(isAdd)
                resources.save();
            else
                resources.update();
            responseModel=ResponseModel.buildSuccess();
        }catch (Exception ex){
            logger.error(".....doEdit error.",ex);
            responseModel=ResponseModel.buildError(null);
        }
        renderJson(responseModel);

    }

    @ActionKey("/resource/do_delete")
    public void doDelete() {
        ResponseModel responseModel;
        int id=getParaToInt("id");
        boolean b = Resources.dao.deleteById(id);
        if(b){
            responseModel=ResponseModel.buildSuccess(id);
        }else {
            responseModel=ResponseModel.buildError("删除失败，数据不存在!");
        }
        renderJson(responseModel);
    }
}





