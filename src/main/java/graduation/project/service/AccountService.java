package graduation.project.service;

import java.util.List;

import graduation.project.vo.AccountVO;

public interface AccountService {

	void openAccount(AccountVO acc) throws Exception;

	List<AccountVO> selectAccMy(String id) throws Exception;

	
}
