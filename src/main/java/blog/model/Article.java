package blog.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Article extends BaseModel  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1745247545783808292L;
	
	private Long id; //文字
	
	private String creator; //创建者
	
	private Integer pageView; //浏览量
	
	private String Abstract; //摘要
	
	private String detail; //内容
	
	private ArticleType articleType;  //文章类型

	

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@NotNull
	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}
	
	@NotNull
	public Integer getPageView() {
		return pageView;
	}

	public void setPageView(Integer pageView) {
		this.pageView = pageView;
	}
	
	@NotNull
	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
	@ManyToOne
	@NotNull
	public ArticleType getArticleType() {
		return articleType;
	}

	public void setArticleType(ArticleType articleType) {
		this.articleType = articleType;
	}

	public String getAbstract() {
		return Abstract;
	}

	public void setAbstract(String abstract1) {
		Abstract = abstract1;
	}


}
