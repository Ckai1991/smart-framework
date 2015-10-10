package org.smart4j.framework.helper;

import org.smart4j.framework.util.ClassUtil;

/**
 * 加载相应的Helper类
 * Created by admin on 2015/10/9.
 */
public class HelperLoader {
    public static void init(){
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };

        for (Class<?> cls : classList){
            ClassUtil.loadClass(cls.getName());
        }
    }
}
