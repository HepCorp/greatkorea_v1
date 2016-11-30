package co.greatkorea.www.visitor.service;

import java.util.HashMap;
import java.util.List;

public interface VisitorService {
	/**
	 * ���� ���
	 * @param vo - ��ȸ�� ������ ��� VisitorVO
	 * @return VisitorVO
	 * @exception Exception
	 */
	public List<VisitorVO> selectAll(HashMap<String, Object> limit) throws Exception;
	
	/**
	 * ���� ��� �Ѱ���
	 * @param vo - ����
	 * @return int
	 * @exception Exception
	 */
	public int selectTot(String searchStr) throws Exception;
}
