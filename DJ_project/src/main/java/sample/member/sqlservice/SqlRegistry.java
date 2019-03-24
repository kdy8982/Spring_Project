package sample.member.sqlservice;

public interface SqlRegistry {

	String findSql(String key) throws SqlNotFoundException;

	void registerSql(String key, String sql);

}
