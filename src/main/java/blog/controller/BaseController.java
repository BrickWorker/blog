package blog.controller;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseController<T,E> {
	
	@Autowired
	private T t;

}
