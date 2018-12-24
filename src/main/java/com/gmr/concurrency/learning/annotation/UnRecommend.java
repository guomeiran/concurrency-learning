package com.gmr.concurrency.learning.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 描述【不推荐】的类或写法
 *
 * @author guomeiran
 * @since 2018/12/24 11:24
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface UnRecommend {
    String value() default "";
}
