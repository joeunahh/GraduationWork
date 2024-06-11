package graduation.project.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import graduation.project.dao.CustomerDAO;
import graduation.project.vo.CustomerVO;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO dao;
	
	@Override
	public CustomerVO login(CustomerVO customer) throws Exception {
		CustomerVO log = dao.login(customer);
		return log;
	}

	@Override
	public CustomerVO checkID(String id) throws Exception {
		CustomerVO check = dao.idCheck(id);
		return check;
	}

	@Override
	public void signUp(CustomerVO customer) throws Exception {
		dao.insertCustomer(customer);
	}
	
	@Override
	public void UpdateForm(CustomerVO customer) {
		//dao.updateCustomer(customer);
	}

}