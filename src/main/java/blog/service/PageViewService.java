package blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import blog.dao.PageViewReposity;
import blog.model.PageView;

@Service
@Transactional
public class PageViewService {

	@Autowired
	private PageViewReposity pageViewReposity;
	
	//获取主页访问量
	public PageView getCount(){
		PageView pv = this.pageViewReposity.findOne(1L);
		pv.setPageCount(pv.getPageCount()+1);
		return this.pageViewReposity.save(pv);
	}
}
