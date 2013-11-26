package com.storelocator.rest.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "countries")
public class CountryList {

	private List<Country> data;

	public List<Country> getData() {
		return data;
	}

	public void setData(List<Country> data) {
		this.data = data;
	}
}
