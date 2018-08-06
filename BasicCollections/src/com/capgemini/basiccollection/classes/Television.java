package com.capgemini.basiccollection.classes;
//a Television class with getters and ctors..
public class Television {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Television other = (Television) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Television [company=" + company + ", type=" + type + ", is3DEnabled=" + is3DEnabled + ", price=" + price
				+ "]";
	}

	private String company;
	private String type;
	private boolean is3DEnabled;
	private double price;

	public Television(String company, String type, boolean is3dEnabled, double price) {

		this.company = company;
		this.type = type;
		is3DEnabled = is3dEnabled;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public String getType() {
		return type;
	}

	public boolean isIs3DEnabled() {
		return is3DEnabled;
	}

	public double getPrice() {
		return price;
	}

}
