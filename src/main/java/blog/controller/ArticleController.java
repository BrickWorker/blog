package blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;

import blog.annotation.JSONResponse;
import blog.model.Article;
import blog.service.ArticleService;
import blog.util.MediaTypes;


/**
 * @apiDefine Article 文章模块(ARTICLE)
 */

@RestController
@RequestMapping(value = "article", produces = MediaTypes.JSON_UTF_8)
public class ArticleController {
	
	@Autowired
	private ArticleService articleService;
	
	
	/**
	 *  @api {POST} http://www.winthen.com/blog/artcle 1-文章创建（管理员）
	 *  @apiName create
	 *  @apiGroup Article
	 *  @apiParamExample {json} Request-Example: 
	 *  {
	 *
	 *  }
	 *  @apiSuccessExample {json} Success-Response: HTTP/1.1  CREATED 
	 *  {
	 *  }
	 */

	@JSONResponse
	@RequestMapping(method = RequestMethod.POST)
	public String create(@RequestBody Article article){
		return JSON.toJSONString(this.articleService.save(article));
	}
}
