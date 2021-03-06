package blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import blog.util.MediaTypes;


/**
 * @apiDefine ArticleType 文章类型模块(ARTICLETYPE)
 */


@RestController
@RequestMapping(value = "article", produces = MediaTypes.JSON_UTF_8)
public class ArticleTypeController {

}
