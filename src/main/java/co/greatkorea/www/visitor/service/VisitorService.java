package co.greatkorea.www.visitor.service;

import java.util.HashMap;
import java.util.List;

public interface VisitorService {
	/**
	 * 방명록 목록
	 * @param vo - 조회할 정보가 담긴 VisitorVO
	 * @return VisitorVO
	 * @exception Exception
	 */
	public List<VisitorVO> selectAll(HashMap<String, Object> limit) throws Exception;
	
	/**
	 * 방명록 목록 총갯수
	 * @param vo - 없음
	 * @return int
	 * @exception Exception
	 */
	public int selectTot(String searchStr) throws Exception;
}
