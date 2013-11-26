package com.storelocator.rest.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "addresses")
public class AddressList {

	private List<Address> data;

	public List<Address> getData() {
		return data;
	}

	public void setData(List<Address> data) {
		this.data = data;
	}
}
