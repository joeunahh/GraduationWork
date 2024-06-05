package graduation.project.service;


import graduation.project.vo.CustomerVO;

public interface CustomerService {
	
	CustomerVO login(CustomerVO customer) throws Exception;
	
	CustomerVO checkID(String id) throws Exception;
	
	void signUp(CustomerVO customer) throws Exception;

	void UpdateForm(CustomerVO customer);
}
