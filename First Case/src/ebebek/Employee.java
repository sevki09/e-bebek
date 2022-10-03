package ebebek;

import java.text.DecimalFormat;

public class Employee {
	
	private String name;
	
	private double salary;
	
	private int workHours;
	
	private int hireYear;
	
	private int year=2021;
	
	DecimalFormat f = new DecimalFormat("##.00");
	
	private double rSalary;
	
	private int hours=40;

	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public int getHireYear() {
		return hireYear;
	}

	public void setHireYear(int hireYear) {
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
		rSalary=this.salary+bonus()-tax();
		if(raiseYear<10) {
			newSalary=rSalary*0.05;
		}
		else if(raiseYear>9 &&raiseYear<20) {
			newSalary=rSalary*0.10;
		}
		else if(raiseYear>19) {
			newSalary=rSalary*0.15;
		}
		return newSalary+rSalary-this.salary;
	}
	
	public String toString() {
		String result="Adý :"+this.name+"\n"
				+"Maaþ :"+this.salary+"\n"
				+"Çalýþma Saati :"+this.workHours+"\n"
				+"Baþlangýç Yýlý :"+this.hireYear+"\n"
				+"Vergi :"+tax()+"\n"
				+"Bonus :"+bonus()+"\n"
				+"Maaþ Artýþý :"+f.format(raiseSalary())+"\n"
			    +"Vergi ve Bonus ile Maaþ :"+f.format(rSalary)+"\n"
				+"Toplam Maaþ :"+f.format((this.salary+raiseSalary()))+"\n";
		return result;
		
	}
}
