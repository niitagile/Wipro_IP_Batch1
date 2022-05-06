package com.admfactory.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.FIELD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)  
public @interface DBField {
	String name();

	Class< ?> type();

	boolean isPrimaryKey() default false;
}
