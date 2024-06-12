package graduation.project.service;

import java.util.List;

import graduation.project.vo.AccountVO;
import graduation.project.vo.HistoryVO;

public interface AccountService {

	void openAccount(AccountVO acc) throws Exception;

	List<AccountVO> selectAccMy(String id) throws Exception;

	List<HistoryVO> selectMyHis(int accNo) throws Exception;

	List<HistoryVO> allHistory(String id) throws Exception;	
}
