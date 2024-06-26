package graduation.project.dao;

import java.util.List;

import graduation.project.vo.AccountVO;
import graduation.project.vo.HistoryVO;

public interface AccountDAO {

	void openAcc(AccountVO acc) throws Exception;

	List<AccountVO> selectAccMy(String id) throws Exception;

	List<HistoryVO> selectMyHis(String accNo) throws Exception;

	List<HistoryVO> allHistory(String id) throws Exception;

	void insertHistory(String accNo);

}
