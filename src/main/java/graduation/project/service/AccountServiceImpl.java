package graduation.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import graduation.project.dao.AccountDAO;
import graduation.project.vo.AccountVO;
import graduation.project.vo.HistoryVO;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDAO dao;
	
	@Override
<<<<<<< HEAD
//<<<<<<< HEAD
=======
>>>>>>> 78c26ca257f62db6fe52b19fce46c2283ccc9dbf
	public void openAccount(AccountVO acc) throws Exception{
		dao.openAcc(acc);
	}

	@Override
	public List<AccountVO> selectAccMy(String id) throws Exception {
		List<AccountVO> list = dao.selectAccMy(id);
		return list;
	}

<<<<<<< HEAD
//=======
	public void openAccountt(AccountVO acc) throws Exception {
		dao.openAcc(acc);
	}
//>>>>>>> eaacdf7f0af8d61f408ded6517c23652c241d10e
}
=======
	@Override
	public List<HistoryVO> selectMyHis(int accNo) throws Exception{
		List<HistoryVO> list = dao.selectMyHis(accNo);
		return list;
	}
}
>>>>>>> 78c26ca257f62db6fe52b19fce46c2283ccc9dbf
