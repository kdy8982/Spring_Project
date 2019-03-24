package sample.member.dao;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import sample.TestApplicationContext;
import sample.domain.Member;

@ContextConfiguration(classes=TestApplicationContext.class)
public class MemberDaoJdbcTest {

	@Autowired
	private MemberDao dao;

	private Member member1;
	private Member member2;
	private Member member3;
	
	@Before
	public void setUp() {
		member1 = new Member("kdy8982", "kdy8982@naver.com");
		member2 = new Member("kkk1234", "kkk1234@naver.com");
		member3 = new Member("asdf12", "asdf12@naver.com");
		
	}
	
	@Test
	public void isSetUp() {
		assertThat(member1.getEmail(), is("kdy8982@naver.com"));
		assertThat(member1.getId(), is("kdy8982"));
	}
	
	@Test
	public void testGet() {
		dao.deleteAll();
		dao.add(member1);
		dao.add(member2);
		dao.add(member3);
		
		assertThat(dao.get(member1.getEmail()), is(member1));
		assertThat(dao.get(member2.getEmail()), is(member2));
		assertThat(dao.get(member3.getEmail()), is(member3));

	}

	@Test
	public void testGetAll() {
		dao.deleteAll();
		dao.add(member1);
		dao.add(member2);
		dao.add(member3);

		ArrayList<Member> list = (ArrayList<Member>)dao.getAll();
		
		assertThat(list.size(), is(3));
	}

	@Test
	public void testAdd() {
		dao.deleteAll();
		dao.add(member1);
		dao.add(member2);
		dao.add(member3);
		
		assertThat(dao.getCount(), is(3));
		
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteAll() {
		dao.deleteAll();
		dao.add(member1);
		dao.add(member2);
		dao.add(member3);
		
		dao.deleteAll();
		
		assertThat(dao.getCount(), is(0));
	}

}
