package com.cirta.soft.springsecurity.resolutions;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity(name="authorities")
public class UserAuthority {
	@Id
	UUID id;

	@ManyToOne
    User user;

	@Column
	String authority;

	public UserAuthority() {}

	public UserAuthority(User user, String authority) {
		this.id = UUID.randomUUID();
		this.user = user;
		this.authority = authority;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
}
