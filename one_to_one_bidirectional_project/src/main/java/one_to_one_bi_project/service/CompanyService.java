package one_to_one_bi_project.service;

import one_to_one_bi_project.dao.CompanyDao;
import one_to_one_bi_project.dto.Company;
import one_to_one_bi_project.dto.Gst;

public class CompanyService {
	CompanyDao companyDao=new CompanyDao();
	public Company insertCompany(Company company,Gst gst) {
		return companyDao.insertCompany(company, gst);
		
	}
	public Company deleteCompany(Company company,Gst gst) {
		return companyDao.deleteCompany(company, gst);
	}
	//public Company updateCompany(Company company,Gst gst) {
	//	return companyDao.updateCompany(company, gst);
	//}
//	public void getAllDetails() {
		//companyDao.getAllDetails();
	//}

}
