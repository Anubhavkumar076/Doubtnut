package com.example.demo.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table_user" , catalog = "world")
public class TableUser implements java.io.Serializable 
{

	@Id
	private Integer idtableUserId;

	@Column(name = "table_user_active")
	private Boolean tableUserActive;
	
	@Column(name = "table_user_key")
	private String tableUserKey;

	public Integer getIdtableUserId() {
		return idtableUserId;
	}

	public void setIdtableUserId(Integer idtableUserId) {
		this.idtableUserId = idtableUserId;
	}

	public Boolean getTableUserActive() {
		return tableUserActive;
	}

	public void setTableUserActive(Boolean tableUserActive) {
		this.tableUserActive = tableUserActive;
	}

	public String getTableUserKey() {
		return tableUserKey;
	}

	public void setTableUserKey(String tableUserKey) {
		this.tableUserKey = tableUserKey;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getIdtableUserId());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof TableUser))
			return false;
		final TableUser tableUser = (TableUser) o;
		return Objects.equals(getIdtableUserId(), tableUser.getIdtableUserId());
	}

	
	
}
