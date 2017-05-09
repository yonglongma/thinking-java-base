package com.yonglong.framework.lucene.annotation;

import java.lang.annotation.*;

/**
 * @author MaYongLong
 * @date 2017/5/9.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface  Index {
    /**
     * 注解参数成员范围
     *  1.所有基本数据类型（int,float,boolean,byte,double,char,long,short)
　　　　2.String类型
　　　　3.Class类型
　　　　4.enum类型
　　　　5.Annotation类型
　　　　6.以上所有类型的数组
     */
    public String name() default "";
    public String description() default "";
    public boolean isHighLight() default false;

}
