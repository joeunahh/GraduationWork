package graduation.project.dao;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import graduation.project.vo.CustomerVO;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SqlSessionTemplate session;
	
	@Override
	public CustomerVO login(CustomerVO customer) throws Exception {
		CustomerVO log = session.selectOne("dao.CustomerDAO.loginCustomer", customer);
		return log;
	}

	@Override
	public CustomerVO idCheck(String id) {
		CustomerVO check = session.selectOne("dao.CustomerDAO.idCheck", id);
		return check;
	}

	@Override
	public void insertCustomer(CustomerVO customer) {
		session.insert("dao.CustomerDAO.insertCustomer", customer);
	}

}
