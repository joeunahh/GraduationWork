package graduation.project.dao;

import java.util.List;

import graduation.project.vo.GradVO;

public interface GradDAO {
	
	List<GradVO> selectAll() throws Exception; 
	GradVO selectByNo(int boardNo) throws Exception;
	void insert(GradVO board) throws Exception;

}
