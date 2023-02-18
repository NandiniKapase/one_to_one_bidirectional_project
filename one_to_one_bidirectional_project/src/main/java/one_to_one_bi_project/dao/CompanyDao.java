package one_to_one_bi_project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.cj.Query;

import one_to_one_bi_project.dto.Company;
import one_to_one_bi_project.dto.Gst;

public class CompanyDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Nandini");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public Company insertCompany(Company company,Gst gst) {
		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(gst);
		entityTransaction.commit();
		System.out.println("Record Added");
		return company;
	} 
	public Company deleteCompany(Company company ,Gst gst) {
		Company company2=entityManager.find(Company.class, company.getId());
		Gst gst2=entityManager.find(Gst.class, gst.getId());
		entityTransaction.begin();
		entityManager.remove(company2);
		entityManager.remove(gst2);
		entityTransaction.commit();
		System.out.println("record deleted");
		return company2;
	}
	public Company updateCompany(Company company,Gst gst) {
		Company company2=entityManager.find(Company.class, company.getId());
			Gst gst2=entityManager.find(Gst.class, gst.getId());
				if(company2!=null) {
					company2.setName(company.getName());
					company2.setLoc(company.getLoc());
					System.out.println("Record updated");
					
				}
				else {
					System.out.println("Record not found");
				}
				entityTransaction.begin();
				entityManager.merge(company2);
			entityTransaction.commit();
			return company2;
			
	}
		}

