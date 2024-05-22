package graduation.project.dao;

import graduation.project.vo.CustomerVO;

public interface CustomerDAO {

	CustomerVO login(CustomerVO customer) throws Exception;
}
