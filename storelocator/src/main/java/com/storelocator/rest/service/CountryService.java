package com.storelocator.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.storelocator.rest.domain.Country;

@Service("countryService")
public class CountryService {

	protected static Logger logger = Logger.getLogger("service");

	// In-memory list
	private List<Country> countries = new ArrayList<Country>();

	public CountryService() {
		logger.debug("Init database");

		// Create in-memory list
		Country country1 = new Country();
		country1.setId(1L);
		country1.setCountryCode("US");
		country1.setCountryName("United States");

		Country country2 = new Country();
		country2.setId(2L);
		country2.setCountryCode("UK");
		country2.setCountryName("United Kingdom");

		Country country3 = new Country();
		country3.setId(3L);
		country3.setCountryCode("AU");
		country3.setCountryName("Australia");

		countries.add(country1);
		countries.add(country2);
		countries.add(country3);
	}

	/**
	 * Retrieves all persons
	 */
	public List<Country> getAll() {
		logger.debug("Retrieving all Countries");

		return countries;
	}

	/**
	 * Retrieves a single person
	 */
	public Country get(Long id) {
		logger.debug("Retrieving country with id: " + id);

		for (Country country : countries) {
			if (country.getId().longValue() == id.longValue()) {
				logger.debug("Found record");
				return country;
			}
		}

		logger.debug("No records found");
		return null;
	}

}
