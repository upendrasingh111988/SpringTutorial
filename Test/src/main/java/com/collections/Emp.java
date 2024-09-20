package com.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	
	private String name;
	private List<String> phone;
	private Set<String>addressees;
	private Map<String, String>cources;
	
	
	
	public Emp(String name, List<String> phone, Set<String> addressees, Map<String, String> cources) {
		
		this.name = name;
		this.phone = phone;
		this.addressees = addressees;
		this.cources = cources;
	}
	public Emp() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAddressees() {
		return addressees;
	}
	public void setAddressees(Set<String> addressees) {
		this.addressees = addressees;
	}
	public Map<String, String> getCources() {
		return cources;
	}
	public void setCources(Map<String, String> cources) {
		this.cources = cources;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", phone=" + phone + ", addressees=" + addressees + ", cources=" + cources + "]";
	}
	

}
