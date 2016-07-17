package blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;

import blog.service.WisdomService;
import blog.util.MediaTypes;


/**
 * @apiDefine Wisdom 名人名言模块(WISDOM)
 */



@RestController
@RequestMapping(value = "wisdom", produces = MediaTypes.JSON_UTF_8)
public class WisdomController {
	
	@Autowired
	private WisdomService wisdomService;

	

	/**
	 *  @api {GET} http://121.196.232.233/card/activity/{id} 2-查询单条活动
	 *  @apiName retrieve
	 *  @apiGroup SActivity
	 *  @apiSuccessExample {json} Success-Response: HTTP/1.1  FIND 
	 *  {
	 *  }
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String getOne(){
		return JSON.toJSONString(this.wisdomService.getOne());
	}
}
