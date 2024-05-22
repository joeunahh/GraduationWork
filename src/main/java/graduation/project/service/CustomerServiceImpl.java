package graduation.project.service;

import org.springframework.beans.factory.annotation.Autowired;

import graduation.project.dao.CustomerDAO;
import graduation.project.vo.CustomerVO;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO dao;
	
	@Override
	public CustomerVO login(CustomerVO customer) throws Exception {
		CustomerVO log = dao.login(customer);
		return log;
	}

}
