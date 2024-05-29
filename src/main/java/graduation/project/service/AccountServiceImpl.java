package graduation.project.service;

import graduation.project.dao.AccountDAO;
import graduation.project.vo.AccountVO;

public class AccountServiceImpl implements AccountService {

	private AccountDAO dao;
	
	@Override
	public void openAccount(AccountVO acc) {
		dao.openAcc(acc);
	}

}
