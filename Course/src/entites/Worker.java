package entites;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entites.enums.WorkedLevel;

public class Worker {
	private String name;
	private WorkedLevel level;
	private Double baseSalary;
	
	private Departament departament = new Departament();
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
	}

	

	public Worker(String name, WorkedLevel level, Double baseSalary, Departament departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;		
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkedLevel getLevel() {
		return level;
	}

	public void setLevel(WorkedLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double som = baseSalary;
		
		for(HourContract c : contracts) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(c.getData());
			int c_year = cal.get(Calendar.YEAR);
			int c_mohth = cal.get(Calendar.MONTH);
			if(c_year == year && c_mohth == month) {
				som += c.totalValue();
			}
			return som;
		}
		return som;
		
	}
	
}
