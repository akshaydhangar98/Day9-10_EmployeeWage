package UC13;

import java.util.ArrayList;

public class EmppWageBuilder  implements collection
{
  
		 
		 static ArrayList<Company> companyList=new ArrayList<Company>();

			
				public void showInfo(Company company) {
					// TODO Auto-generated method stub
					 System.out.println("Company name: "+company.name);
					 System.out.println("Total Wage :"+company.monthlyWage);
				}


				public void addCompany(Company company) {
					// TODO Auto-generated method stub
					 companyList.add(company);
	
}
}