package com.storelocator.rest.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "cities")
public class CityList {

	private List<City> data;

	public List<City> getData() {
		return data;
	}

	public void setData(List<City> data) {
		this.data = data;
	}
}
