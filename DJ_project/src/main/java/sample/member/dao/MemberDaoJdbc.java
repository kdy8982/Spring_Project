package sample.member.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import sample.domain.Member;
import sample.member.sqlservice.SqlService;

@Repository
public class MemberDaoJdbc implements MemberDao {
	
	private JdbcTemplate jdbcTemplate;
	private SqlService sqlService;
	
	/*DI를 위한 수정자 메서드*/
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void setSqlService(SqlService sqlService) {
		this.sqlService = sqlService;
	}
	
	
	private RowMapper<Member>  memberMapper = new RowMapper<Member>() {
		@Override
		public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
			Member member = new Member();
			member.setId(rs.getString("id"));
			member.setEmail(rs.getString("email"));
			return member;
		}
	};

	@Override
	public Member get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Member member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Member member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	} 

}
