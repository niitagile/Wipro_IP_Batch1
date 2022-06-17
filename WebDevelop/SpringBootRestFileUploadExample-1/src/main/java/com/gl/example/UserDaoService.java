package com.gl.example;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.springframework.stereotype.Component;
@Component
public class UserDaoService 
{
	public static int usersCount=5;
//creating an instance of ArrayList
	public static List<User> users=new ArrayList<>();
//static block 
	static
	{
	//adding users to the list
	users.add(new User(1, "John", new Date()));
	users.add(new User(2, "Robert", new Date()));
	users.add(new User(3, "Adam", new Date()));
	users.add(new User(4, "Andrew", new Date()));
	users.add(new User(5, "Jack", new Date()));
	}
	  
}