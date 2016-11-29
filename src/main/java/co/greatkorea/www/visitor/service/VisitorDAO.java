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
	public List<VisitorVO> selectAll(HashMap<String, Integer> page) throws SQLException{
		System.out.println(page.size());
		List<VisitorVO> list = sql.queryForList("visitor.select", page);
		return list;
	}
	
	public int selectTot() throws SQLException{
		return (Integer) sql.queryForObject("visitor.selectTot");
	}
}
