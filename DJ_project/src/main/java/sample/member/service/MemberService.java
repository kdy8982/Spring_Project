package sample.member.service;

import java.util.List;

import sample.domain.Member;

public interface MemberService {
	
	void add(Member member);
	
	void update(Member member);
	
	Member get(String id);
	
	List<Member> list();
	
	void delete(String id);

}
