/**
 * 
 */
package edu.mum.cs544.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 * @author haftomtesfay
 *
 */
@Entity
public class ToDoList {

	@Id @GeneratedValue
	private int toDoListId;
	@NotNull
	private String title;
	@Column(columnDefinition = "varchar(2048)")
	private String description;
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedDate;
	@Temporal(TemporalType.DATE)
	private Date dueDate;
	@Temporal(TemporalType.DATE)
	private Date remainderStartDate;
	
	
}
