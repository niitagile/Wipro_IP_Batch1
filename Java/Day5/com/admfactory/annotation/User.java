package com.admfactory.annotation;

import java.util.Date;

public class User {

	@DBField(name = "id", isPrimaryKey = true, type = Long.class)
	private long id;

	@DBField(name = "name", type = String.class)
	private String name;

	@DBField(name = "email", type = String.class)
	private String email;

	@DBField(name = "created", type = Date.class)
	private Date created;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
}
