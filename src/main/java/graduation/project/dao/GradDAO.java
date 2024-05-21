package graduation.project.dao;

import java.util.List;

import graduation.project.vo.GradVO;

public interface GradDAO {
	
	List<CustomerVO> selectAll() throws Exception; 
	CustomerVO selectByNo(int boardNo) throws Exception;
	void insert(CustomerVO board) throws Exception;

}
