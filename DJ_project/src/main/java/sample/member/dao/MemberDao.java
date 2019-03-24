package sample.member.dao;

import java.util.List;

import sample.domain.Member;

public interface MemberDao {

	Member get(String email);
	List<Member> getAll();
	void add(Member member);
	void update(Member member);
	void deleteAll();
	int getCount();
	
}
