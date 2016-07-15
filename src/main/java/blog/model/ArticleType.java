package blog.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class ArticleType extends BaseModel  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3400950392260203191L;
	
	private Long id; //id
	
	private String description; // 类型描述
	

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@NotNull
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
