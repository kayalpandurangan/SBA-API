package com.fse.sba.projectmanagement.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity
public class ParentTask {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer parentId;
	
	private String parentTask;

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getParentTask() {
		return parentTask;
	}

	public void setParentTask(String parentTask) {
		this.parentTask = parentTask;
	}

	
	
	/**
	 * 
	 */
	public ParentTask() {
		super();
	}

	/**
	 * @param parentId
	 * @param parentTask
	 */
	public ParentTask(Integer parentId, String parentTask) {
		super();
		this.parentId = parentId;
		this.parentTask = parentTask;
	}
	
	

}
