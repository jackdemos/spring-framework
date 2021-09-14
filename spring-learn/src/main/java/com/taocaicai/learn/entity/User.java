package com.taocaicai.learn.entity;

/**
 * @project spring
 * @author Oakley
 * @created 2021-09-14 16:42:16:42
 * @package com.taocaicai.learn.entity
 * @description TODO
 * @since: 0.0.0.1
 */
public class User {
  private String id;
  private String name;
  private String email;

  public User() {}

  public User(String id, String name, String email) {
    this.id = id;
    this.name = name;
    this.email = email;
  }

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
}
