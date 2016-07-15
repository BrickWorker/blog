package blog.dao;

import org.springframework.data.repository.CrudRepository;

import blog.model.Article;

public interface ArticleTypeRepository extends CrudRepository<Article, Long> {

}
