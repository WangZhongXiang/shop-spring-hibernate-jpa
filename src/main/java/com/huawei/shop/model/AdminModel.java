package com.huawei.shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class AdminModel
{
	@Id
    @Column(name = "AD_ID", nullable = true)
	private int id;
	
	@Column(name = "AD_NAME", nullable = false)
	private String name;
	
	@Column(name = "AD_PASSWORD", nullable = false)
	private String password;

	
	
	public int getId()
	{
		return id;
	}


	
	public void setId(int id)
	{
		this.id = id;
	}


	public String getName()
	{
		return name;
	}

	
	public void setName(String name)
	{
		this.name = name;
	}

	
	public String getPassword()
	{
		return password;
	}

	
	public void setPassword(String password)
	{
		this.password = password;
	}

}
