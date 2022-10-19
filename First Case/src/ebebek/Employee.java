package ebebek;

public class Employee {
	
	private String name;
	
	private double salary;
	
	private int workHours;
	
	private int hireYear;
	
	private int year=2021;
	
	private int hours=40;

	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public double tax() {
		double result=0;
		if(this.salary>1000) {
			result=this.salary*0.03;
		}else {
			result=0;
		}
		
		return result;
	}

	public double bonus() {
		double extraWork=0;
		if(this.workHours>hours) {
			extraWork=(this.workHours-hours)*30;
		}
		else {
			extraWork=0;
		}
		return extraWork;
	}

	public double raiseSalary() {
		int raiseYear=year-this.hireYear;
		double newSalary=0;
		if(raiseYear<10) {
			newSalary=this.salary*0.05;
		}
		else if(raiseYear>9 &&raiseYear<20) {
			newSalary=this.salary*0.10;
		}
		else if(raiseYear>19) {
			newSalary=this.salary*0.15;
		}
		return newSalary;
	}
	
	public String toString() {
		String result="Adı : "+this.name+"\n"
				+"Maaş : "+this.salary+"\n"
				+"Çalışma Saati : "+this.workHours+"\n"
				+"Başlangıç Yılı : "+this.hireYear+"\n"
				+"Vergi : "+tax()+"\n"
				+"Bonus : "+bonus()+"\n"
				+"Maaş Artışı : "+raiseSalary()+"\n"
			    +"Vergi ve Bonuslar ile birlikte maaş : "+(this.salary+bonus()-tax())+"\n"
				+"Toplam Maaş : "+(this.salary+raiseSalary())+"\n";
		return result;
		
	}
}
