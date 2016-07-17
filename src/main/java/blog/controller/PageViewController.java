package blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;

import blog.service.PageViewService;
import blog.util.MediaTypes;


/**
 * @apiDefine PageView 主页访问量模块(PAGEVIEW)
 */



@RestController
@RequestMapping(value = "pv", produces = MediaTypes.JSON_UTF_8)
public class PageViewController {
	
	
	@Autowired
	private PageViewService pageViewService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String getCount(){
		return JSON.toJSONString(this.pageViewService.getCount());
	}

}
