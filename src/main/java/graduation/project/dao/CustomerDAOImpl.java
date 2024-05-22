package graduation.project.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import graduation.project.vo.CustomerVO;

public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SqlSessionTemplate session;
	
	@Override
	public CustomerVO login(CustomerVO customer) throws Exception {
		CustomerVO log = session.selectOne("dao.CustomerDAO.loginCustomer", customer);
		return log;
	}

}
