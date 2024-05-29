package graduation.project.dao;

import java.util.List;

import graduation.project.vo.AccountVO;

public interface AccountDAO {

	void openAcc(AccountVO acc) throws Exception;

	List<AccountVO> selectAccMy(String id) throws Exception;

}
