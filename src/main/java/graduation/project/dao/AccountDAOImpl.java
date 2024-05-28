package graduation.project.dao;

import org.mybatis.spring.SqlSessionTemplate;

import graduation.project.vo.AccountVO;

public class AccountDAOImpl implements AccountDAO {

	private SqlSessionTemplate session;
	
	@Override
	public void openAcc(AccountVO acc) {
		session.insert("dao.AccountDAO.insertAcc", acc);
	}

}
