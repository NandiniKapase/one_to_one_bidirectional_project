package one_to_one_bi_project.controller;

import one_to_one_bi_project.dto.Company;
import one_to_one_bi_project.dto.Gst;
import one_to_one_bi_project.service.CompanyService;

public class TestSave {

	public static void main(String[] args) {
		Company company=new Company();
		Gst gst=new Gst();
		gst.setGst_no("abd25");
		gst.setCompany(company);
		company.setName("JIO");
		company.setLoc("REBALE");
		company.setGst(gst);
		
		CompanyService companyService=new CompanyService();
		companyService.insertCompany(company, gst);
	}

}
