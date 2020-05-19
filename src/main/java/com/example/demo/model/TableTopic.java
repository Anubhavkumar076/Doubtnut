package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table_topic" , catalog = "world")
public class TableTopic implements java.io.Serializable 
{
	@Id
	private Integer idtableTopicId;

	@Column(name = "table_topic_input")
	private String tableTopicInput;
	
	@Column(name = "table_topic_data")
	private String tableTopicData;

	public Integer getIdtableTopicId() {
		return idtableTopicId;
	}

	public void setIdtableTopicId(Integer idtableTopicId) {
		this.idtableTopicId = idtableTopicId;
	}

	public String getTableTopicInput() {
		return tableTopicInput;
	}

	public void setTableTopicInput(String tableTopicInput) {
		this.tableTopicInput = tableTopicInput;
	}

	public String getTableTopicData() {
		return tableTopicData;
	}

	public void setTableTopicData(String tableTopicData) {
		this.tableTopicData = tableTopicData;
	}
	
}
