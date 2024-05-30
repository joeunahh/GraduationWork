package graduation.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import graduation.project.dao.AccountDAO;
import graduation.project.vo.AccountVO;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDAO dao;
	
	@Override
	public void openAccount(AccountVO acc) throws Exception{
		dao.openAcc(acc);
	}

	@Override
	public List<AccountVO> selectAccMy(String id) throws Exception {
		List<AccountVO> list = dao.selectAccMy(id);
		return list;
	}
}