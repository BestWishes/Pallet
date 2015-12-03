package ljj.sssp.pallet.service;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ljj.sssp.pallet.entity.User;

@Service
public interface UserService {
	@Transactional
	public Page<User> getPage(int pageNo,int pageSize);
}
