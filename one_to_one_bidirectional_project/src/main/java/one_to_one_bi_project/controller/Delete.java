package one_to_one_bi_project.controller;

import one_to_one_bi_project.dto.Company;
import one_to_one_bi_project.dto.Gst;
import one_to_one_bi_project.service.CompanyService;

public class Delete {
	public static void main(String[] args) {
		Gst gst=new Gst();
		gst.setId(1);
		Company company=new Company();
		company.setId(1);
		CompanyService companyService=new CompanyService();
		companyService.deleteCompany(company, gst);
		
	}

}
