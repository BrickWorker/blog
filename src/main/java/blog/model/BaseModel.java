package blog.model;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
@MappedSuperclass
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class BaseModel{

	private Long createTime;

	private Long updateTime;

	@NotNull
	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	@NotNull
	public Long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}

}
