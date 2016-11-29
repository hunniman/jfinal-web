package com.joker.index;

import com.jfinal.aop.Before;
import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;
import com.jfinal.ext.interceptor.GET;
import com.jfinal.plugin.activerecord.Page;
import com.joker.common.model.Resources;
import com.joker.common.other.ResponseModel;
import org.apache.commons.lang3.StringUtils;

/**
 * IndexController
 */
public class IndexController extends Controller {
    public void index() {

      /*  MongoQuery query=new MongoQuery();
        Teacher teacher=new Teacher();
        teacher.setName("踢宝宝");
        List<Teacher> teacher1 = query.use("teacher").find(Teacher.class);
        teacher1.forEach(s->{
            System.err.print(s.getId()+":"+s.getName());
        });*/
        setAttr("ddd",3333);
        render("index.jsp");
    }

    @Before(GET.class)
    @ActionKey("resources")
    public void getResourceData() {
        int pageNumber = getParaToInt("pageNum", 1);
        int pageSize = getParaToInt("pageSize", 10);
        String searchData=getPara("searchData");

        Page<Resources> paginate = Resources.dao.paginate(pageNumber, pageSize,searchData);
        renderJson(ResponseModel.buildSuccess(paginate));
    }
}





