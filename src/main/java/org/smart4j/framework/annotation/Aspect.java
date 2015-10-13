package org.smart4j.framework.annotation;

import java.lang.annotation.*;

/**
 * 切面注解
 *
 * Created by admin on 2015/10/13.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {
    /**
     * 注解
     */
    Class<? extends Annotation> value();
}
