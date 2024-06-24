package graduation.project.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import graduation.project.vo.AccountVO;
import graduation.project.vo.HistoryVO;

@Repository
public class AccountDAOImpl implements AccountDAO {

	@Autowired
	private SqlSessionTemplate session;
	
	@Override
	public void openAcc(AccountVO acc) throws Exception{
		session.insert("dao.AccountDAO.insertAcc", acc);
	}

	@Override
	public List<AccountVO> selectAccMy(String id) throws Exception{
		List<AccountVO> list = session.selectList("dao.AccountDAO.selectAccMy", id);
		return list;
	}

	@Override
	public List<HistoryVO> selectMyHis(String accNo) throws Exception {
		List<HistoryVO> list = session.selectList("dao.AccountDAO.selectMyHis", accNo);
		return list;
	}

	@Override
	public List<HistoryVO> allHistory(String id) throws Exception {
		List<HistoryVO> list = session.selectList("dao.AccountDAO.allHistory", id);
		return list;
	}

}
