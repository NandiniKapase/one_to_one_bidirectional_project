package one_to_one_bi_project.controller;

import one_to_one_bi_project.dto.Company;
import one_to_one_bi_project.dto.Gst;
import one_to_one_bi_project.service.CompanyService;

public class Update {

	public static void main(String[] args) {
		Gst gst=new Gst();
		gst.setId(3);
		Company company=new Company();
		company.setId(3);
		company.setName("Reliance");
		company.setLoc("thane");
		CompanyService companyService=new CompanyService();
	//	companyService.updateCompany(company, gst);
		
		
		CompanyService companyService2=new CompanyService();
		//companyService.getAllDetails();
		
	}

}
