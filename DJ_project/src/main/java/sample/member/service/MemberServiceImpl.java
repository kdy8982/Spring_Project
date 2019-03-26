package sample.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sample.domain.Member;
import sample.member.dao.MemberDao;

@Service
@Transactional
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	 MemberDao dao;

	public void add(Member member) {
		dao.add(member);
	}

	public void delete(String id) {
		dao.delete(id);
	}

	public Member get(String id) {
		return dao.get(id);
	}

	public List<Member> list() {
		System.out.println("testttttt");
		return dao.getAll();
	}

	public void update(Member member) {
		dao.update(member);
	}
	
}
