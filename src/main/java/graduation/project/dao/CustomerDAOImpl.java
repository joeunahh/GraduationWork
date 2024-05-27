package graduation.project.dao;

import java.util.List;

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
	public List<CustomerVO> idCheck(CustomerVO customer) {
		List<CustomerVO> check = session.selectList("dao.CustomerDAO.idCheck", customer);
		return check;
	}

	@Override
	public void insertCustomer(CustomerVO customer) {
		session.insert("dao.CustomerDAO.insertCustomer", customer);
	}

}
