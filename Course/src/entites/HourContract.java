package entites;

import java.util.Date;

public class HourContract {
	private Date data;
	private Double valueHour;
	private Integer hour;
	
	
	
	public HourContract() {
	}

	public HourContract(Date data, Double valueHour, Integer hour) {
		this.data = data;
		this.valueHour = valueHour;
		this.hour = hour;
	}

	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public Double getValueHour() {
		return valueHour;
	}


	public void setValueHour(Double valueHour) {
		this.valueHour = valueHour;
	}


	public Integer getHour() {
		return hour;
	}



	public void setHour(Integer hour) {
		this.hour = hour;
	}
	
	public double totalValue() {
		return valueHour * hour;
	}
	
	
	
	
}
