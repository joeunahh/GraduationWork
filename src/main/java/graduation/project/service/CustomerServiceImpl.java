package graduation.project.service;

import java.util.List;

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
	public List<CustomerVO> checkID(CustomerVO customer) throws Exception {
		List<CustomerVO> check = dao.idCheck(customer);
		return check;
	}

	@Override
	public void signUp(CustomerVO customer) throws Exception {
		dao.insertCustomer(customer);
	}
	
	

}
