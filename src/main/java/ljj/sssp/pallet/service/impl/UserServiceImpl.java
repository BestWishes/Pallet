package ljj.sssp.pallet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.transaction.annotation.Transactional;

import ljj.sssp.pallet.entity.User;
import ljj.sssp.pallet.repository.UserRepository;
import ljj.sssp.pallet.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Transactional(readOnly=true)
	@Override
	public Page<User> getPage(int pageNo, int pageSize) {
		PageRequest pageRequest=new PageRequest(pageNo-1, pageSize);
		return userRepository.findAll(pageRequest);
	}

}
