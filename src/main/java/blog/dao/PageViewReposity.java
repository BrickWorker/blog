package blog.dao;

import org.springframework.data.repository.CrudRepository;

import blog.model.PageView;

public interface PageViewReposity extends CrudRepository<PageView, Long>{

}
