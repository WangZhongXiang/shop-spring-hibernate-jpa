
package com.huawei.shop.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.huawei.shop.model.AdminModel;


@Repository("AdminDao")
public class AdminDao
{

	@PersistenceContext
	private EntityManager	entityManager;

	// @Select("select	AD_NAME, AD_PASSWORD from ADMIN where AD_NAME=#{name};")
	public AdminModel getUserPassword(String name)
	{
		//AdminModel query = entityManager.find(AdminModel.class, 1);
		 Query query = entityManager.createQuery("select c from AdminModel c where c.name=?1 ");
		 query.setParameter(1, name);
		//return (AdminModel) entityManager.createQuery("select * from ADMIN").getResultList().get(0);
		
		 List<AdminModel> list = query.getResultList();
		
		 int id = list.get(0).getId();
		 
		AdminModel admin = list.get(0);
		
		return admin;
	}
}
