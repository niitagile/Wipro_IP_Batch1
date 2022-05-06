package com.admfactory.annotation;

import java.lang.reflect.Field;
import java.util.Date;

public class AnnotationExample {

	public static void main(String[] args) throws Exception {
		System.out.println("Java Custom Annotation Example");
		System.out.println();

		User usr = new User();
		usr.setEmail("john.doe@example.com");
		usr.setName("John Doe");
		usr.setId(112);
		usr.setCreated(new Date());

		for (Field field : usr.getClass().getDeclaredFields()) {
			DBField dbField = field.getAnnotation(DBField.class);
			

			System.out.println("field type: " + dbField.type());
			System.out.println("is primary: " + dbField.isPrimaryKey());
			System.out.println();
		}
	}
}
