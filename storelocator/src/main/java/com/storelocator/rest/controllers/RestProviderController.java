package com.storelocator.rest.controllers;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.storelocator.rest.domain.Address;
import com.storelocator.rest.domain.AddressList;
import com.storelocator.rest.domain.CityList;
import com.storelocator.rest.domain.Country;
import com.storelocator.rest.domain.CountryList;
import com.storelocator.rest.service.AddressService;
import com.storelocator.rest.service.CityService;
import com.storelocator.rest.service.CountryService;

/**
 * REST service provider
 * 
 * Only GET and POST will return values PUT and DELETE will not.
 */
@Controller
public class RestProviderController {

	protected static Logger logger = Logger.getLogger("controller");

	@Autowired
	private CountryService countryService;
	
	@Autowired
	private CityService cityServices;
	
	@Autowired
	private AddressService addressService;

	@RequestMapping(value = "/countries", method = RequestMethod.GET, headers = "Accept=application/xml, application/json")
	public @ResponseBody
	CountryList getCountries() {
		logger.debug("Provider has received request to get all countries");

		// Call service here
		CountryList result = new CountryList();
		result.setData(countryService.getAll());

		return result;

	}

	@RequestMapping(value = "/country/{id}", method = RequestMethod.GET, headers = "Accept=application/xml, application/json")
	public @ResponseBody
	Country getCountry(@PathVariable("id") Long id) {
		logger.debug("Provider has received request to get country with id: "
				+ id);
		// Call service here
		return countryService.get(id);
	}
	
	@RequestMapping(value = "/cities/{countryId}", method = RequestMethod.GET, headers = "Accept=application/xml, application/json")
	public @ResponseBody
	CityList getCities(@PathVariable("countryId") Long countryId) {
		logger.debug("Provider has received request to get all cities");

		// Call service here
		CityList result = new CityList();
		result.setData(cityServices.getAllFromCountry(countryId));

		return result;

	}
	
	@RequestMapping(value = "/address/{countryId}", method = RequestMethod.GET, headers = "Accept=application/xml, application/json")
	public @ResponseBody
	AddressList getAddressesByCountryId(@PathVariable("countryId") Long countryId) {
		logger.debug("Provider has received request to get all Addresses"+countryId);

		// Call service here
		AddressList result = new AddressList();
		result.setData(addressService.getByCountryId(countryId));

		return result;

	}
	
	@RequestMapping(value = "/addresses", method = RequestMethod.GET, headers = "Accept=application/xml, application/json")
	public @ResponseBody
	AddressList getAllAddresses() {
		logger.debug("Provider has received request to get all Addresses");

		// Call service here
		AddressList result = new AddressList();
		result.setData(addressService.getAll());
		return result;

	}
	
	@RequestMapping(value = "/address/zip/{zipcode}", method = RequestMethod.GET, headers = "Accept=application/xml, application/json")
	public @ResponseBody
	AddressList getAddressesByZipCode(@PathVariable("zipcode") String zipcode) {
		logger.debug("Provider has received request to get Addresses from zip code"+zipcode);

		// Call service here
		List<Address> list = new ArrayList<Address>();
		list.add(addressService.getByZipCode(zipcode));
		AddressList result = new AddressList();
		result.setData(list);

		return result;

	}
	
	@RequestMapping(value = "/address/city/{cityid}", method = RequestMethod.GET, headers = "Accept=application/xml, application/json")
	public @ResponseBody
	AddressList getAddressesByCityId(@PathVariable("cityid") Long cityid) {
		logger.debug("Provider has received request to get Addresses from city code"+cityid);

		// Call service here
		
		AddressList result = new AddressList();
		result.setData(addressService.getByCityId(cityid));

		return result;

	}
	
	@RequestMapping(value = "/address/id/{id}", method = RequestMethod.GET, headers = "Accept=application/xml, application/json")
	public @ResponseBody
	AddressList getAddressesById(@PathVariable("id") Long id) {
		logger.debug("Provider has received request to get Addresses by id"+id);

		// Call service here
		List<Address> list = new ArrayList<Address>();
		list.add(addressService.getById(id));
		
		AddressList result = new AddressList();
		result.setData(list);

		return result;

	}

}
