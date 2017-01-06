package ajdu_restful_api.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Task {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	private String description;
	
	@Temporal(TemporalType.DATE)
	private Date dueDate;
	
	@ManyToOne
	@JoinColumn(name="schedule_id")
	private Schedule schedule;
	
	@ManyToOne
	@JoinColumn(name="status_id")
	private TaskStatus status;
	
	
	public Task(){}


	public Task(String name, String description, Date dueDate,
			Schedule schedule, TaskStatus status) {
		super();
		this.name = name;
		this.description = description;
		this.dueDate = dueDate;
		this.schedule = schedule;
		this.status = status;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Date getDueDate() {
		return dueDate;
	}


	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}


	public Schedule getSchedule() {
		return schedule;
	}


	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}


	public TaskStatus getStatus() {
		return status;
	}


	public void setStatus(TaskStatus status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", description="
				+ description + ", dueDate=" + dueDate + ", schedule="
				+ schedule + ", status=" + status + "]";
	}
	
	
	
}
