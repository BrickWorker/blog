package blog.model;

import javax.validation.constraints.NotNull;

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
