package co.greatkorea.www.visitor.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.client.SqlMapClient;

@Repository("visitorDAO")
public class VisitorDAO {
	private SqlMapClient sql;
	
	@SuppressWarnings("unchecked")
	public List<VisitorVO> selectAll() throws SQLException{
		return sql.queryForList("visitor.selectAll");
	}
	public int selectTot() throws SQLException{
		return (Integer) sql.queryForObject("visitor.selectTot");
	}
}
