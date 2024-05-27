package graduation.project.dao;

import java.util.List;

import graduation.project.vo.CustomerVO;

public interface CustomerDAO {

	CustomerVO login(CustomerVO customer) throws Exception;

	List<CustomerVO> idCheck(CustomerVO customer);

	void insertCustomer(CustomerVO customer);
	
}
