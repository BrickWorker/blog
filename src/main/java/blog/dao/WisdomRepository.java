package blog.dao;

import org.springframework.data.repository.CrudRepository;

import blog.model.Wisdom;

public interface WisdomRepository extends CrudRepository<Wisdom, Long>{

}
