package co.greatkorea.www.visitor.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.client.SqlMapClient;

@Repository("visitorDAO")
public class VisitorDAO {
	@Autowired
	private SqlMapClient sql;
	
	@SuppressWarnings("unchecked")
	public List<VisitorVO> selectAll(HashMap<String, Object> limit) throws SQLException{
		return sql.queryForList("visitor.selectAll", limit);
	}
	
	public int selectTot(String searchStr) throws SQLException{
		return (Integer) sql.queryForObject("visitor.selectTot", searchStr);
	}
}
