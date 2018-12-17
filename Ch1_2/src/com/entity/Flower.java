package com.entity;

public class Flower {
//id NAME anothername property price production
	private Integer id;
	private String name;
	private String anothername;
	private String property;
	private Double price;
	private String production;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAnothername() {
		return anothername;
	}
	public void setAnothername(String anothername) {
		this.anothername = anothername;
	}
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property = property;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getProduction() {
		return production;
	}
	public void setProduction(String production) {
		this.production = production;
	}
	@Override
	public String toString() {
		return "Flower [id=" + id + ", name=" + name + ", anothername="
				+ anothername + ", property=" + property + ", price=" + price
				+ ", production=" + production + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getAnothername()="
				+ getAnothername() + ", getProperty()=" + getProperty()
				+ ", getPrice()=" + getPrice() + ", getProduction()="
				+ getProduction() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public Flower() {
		super();
	}
	public Flower(String name, String anothername, String property,
			Double price, String production) {
		super();
		this.name = name;
		this.anothername = anothername;
		this.property = property;
		this.price = price;
		this.production = production;
	}
	
}
