package a;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@MappedSuperclass
public abstract class ABase
{
	@Id
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date creationTimestamp;

	public Long getId() {return id;}

	protected void setId(Long id) {
		this.id = id;
	}

	public Date getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Date creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}
}

