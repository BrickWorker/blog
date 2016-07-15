package blog.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BaseService<T,ID extends Serializable> {

	@Autowired
	private CrudRepository<T, ID> crudRepository;
	
	//增
	public T save(T t){
		return crudRepository.save(t);
	}
	
	
	//删
	public void delete(T t){
		crudRepository.delete(t);
	}
	
	
	//改(同新建)
	
	//查
	public T findOne(ID id){
		return crudRepository.findOne(id);
	}
}
