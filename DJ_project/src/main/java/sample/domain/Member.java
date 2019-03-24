package sample.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Member {
	
	@NotNull
	@Size(min=1, message="입력하세요.")
	String id;

	String email;
	
	public Member() {
		
	}
	
	public Member(String id, String email) {
		this.id = id;
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
}
