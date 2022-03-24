package UC9;

public class Company {

	   public String name;
	   int wagePerHour;
	   int workingDays;
	   int workingHoursMonthly;
	   int monthlyWage;
	   void setInfo(String name,int wagePerHour,int workingDays,int workingHoursMonthly) {
		   this.name=name;
		   this.wagePerHour=wagePerHour;
		   this.workingDays=workingDays;
		   this.workingHoursMonthly=workingHoursMonthly;
		   
	   }
	   
	public   void companyMonthlyWage(int monthlyWage) {
		   this.monthlyWage=monthlyWage;
	   }
	}


