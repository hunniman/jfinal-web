package com.joker.index;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;
import com.joker.common.model.Resources;

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

        Page<Resources> paginate = Resources.dao.paginate(1, 30);
        setAttr("resources", paginate);
        render("index.jsp");
    }
}





