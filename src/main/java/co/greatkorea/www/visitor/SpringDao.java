package co.greatkorea.www.visitor;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ibatis.sqlmap.client.SqlMapClient;

@Repository
public class SpringDao {
	
	@Autowired
	private SqlMapClient sql;
	
	@SuppressWarnings("unchecked")
	public ArrayList<String> ibatisTest() throws SQLException {
		return (ArrayList<String>)sql.queryForList("sql.showtable");
	}
}