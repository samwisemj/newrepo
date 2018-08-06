package com.capgemini.basiccollection.classes;
//a cellphone class with getters and ctors..
public class CellPhone {

	private String company;
	private String model;
	private String description;
	private String os;
	private double price;

	public CellPhone(String company,String model, String description, String os, double price) {
		super();
		this.model = model;
		this.description = description;
		this.os = os;
		this.price = price;
		this.company=company;
	}

	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public String getDescription() {
		return description;
	}

	public String getOs() {
		return os;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((os == null) ? 0 : os.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CellPhone other = (CellPhone) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (os == null) {
			if (other.os != null)
				return false;
		} else if (!os.equals(other.os))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CellPhone [company=" + company + ", model=" + model + ", description=" + description + ", os=" + os
				+ ", price=" + price + "]";
	}

	

	
	

}
