package UC9;
import java.util.ArrayList;

public class UC9_Employeewagebuilder {

	
	 
	 static ArrayList<Company> companyList=new ArrayList<Company>();
	 
	 void showInfo(Company company) {
		 System.out.println("Company name: "+company.name);
		 System.out.println("Total Wage :"+company.monthlyWage);
	 }
	 
	 void addCompany(Company company) {
		 companyList.add(company);
	 }
	
	
	}
