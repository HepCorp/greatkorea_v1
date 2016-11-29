package co.greatkorea.www.visitor.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import co.greatkorea.www.visitor.service.VisitorDAO;
import co.greatkorea.www.visitor.service.VisitorService;
import co.greatkorea.www.visitor.service.VisitorVO;

@Service("visitService")
public class VisitorServiceImpl implements VisitorService {
	
	@Resource(name="visitorDAO")
	VisitorDAO dao;

	/**
	 * ���� ���
	 * @param vo - ��ȸ�� ������ ��� VisitorVO
	 * @return VisitorVO
	 * @exception Exception
	 */
	@Override
	public List<VisitorVO> selectAll(HashMap<String, Integer> page) throws Exception {
		return dao.selectAll(page);
	}

	/**
	 * ���� ��� �Ѱ���
	 * @param vo - ����
	 * @return int
	 * @exception Exception
	 */
	@Override
	public int selectTot() throws Exception {
		return dao.selectTot();
	}

}
