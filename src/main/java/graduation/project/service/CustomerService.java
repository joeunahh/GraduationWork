package graduation.project.service;

import java.util.List;

import graduation.project.vo.CustomerVO;

public interface CustomerService {
	
	CustomerVO login(CustomerVO customer) throws Exception;
	
	List<CustomerVO> checkID(CustomerVO customer) throws Exception;
	
	void signUp(CustomerVO customer) throws Exception;
}
