package blog.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import blog.dao.WisdomRepository;
import blog.model.Wisdom;

@Service
@Transactional
public class WisdomService {
	
	@Autowired
	private WisdomRepository wisdomRepository;
	
	
	//获取每日一名言
	public Wisdom getOne() {
		Random random = new Random();
		Long pickNum = random.nextInt(100) * 1L;
		return this.wisdomRepository.findOne(pickNum);
	}

}
