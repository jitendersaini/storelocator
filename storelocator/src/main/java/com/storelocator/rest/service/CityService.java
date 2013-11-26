package com.storelocator.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.storelocator.rest.domain.City;

@Service("cityService")
public class CityService {

	protected static Logger logger = Logger.getLogger("service");

	// In-memory list
	private List<City> cities = new ArrayList<City>();

	public CityService() {
		logger.debug("Init database");

		// Create in-memory list

		City city1 = new City();
		city1.setCountryId(1L);
		city1.setId(1L);
		city1.setCityName("Alabama");

		City city2 = new City();
		city2.setCountryId(1L);
		city2.setId(2L);
		city2.setCityName("Hawaii");

		City city3 = new City();
		city3.setCountryId(1L);
		city3.setId(3L);
		city3.setCityName("New York");

		City city4 = new City();
		city4.setCountryId(1L);
		city4.setId(4L);
		city4.setCityName("Alaska");

		City city5 = new City();
		city5.setCountryId(1L);
		city5.setId(5L);
		city5.setCityName("Arizona");

		City city6 = new City();
		city6.setCountryId(1L);
		city6.setId(6L);
		city6.setCityName("California");

		City city7 = new City();
		city7.setCountryId(1L);
		city7.setId(7L);
		city7.setCityName("Indiana");

		City city8 = new City();
		city8.setCountryId(1L);
		city8.setId(8L);
		city8.setCityName("Massachusetts");

		City city9 = new City();
		city9.setCountryId(1L);
		city9.setId(9L);
		city9.setCityName("Texas");

		// -------------------------------for UK

		City city10 = new City();
		city10.setCountryId(2L);
		city10.setId(10L);
		city10.setCityName("Aberdeen");

		City city11 = new City();
		city11.setCountryId(2L);
		city11.setId(11L);
		city11.setCityName("Manchester");

		City city12 = new City();
		city12.setCountryId(2L);
		city12.setId(12L);
		city12.setCityName("Exeter");

		City city13 = new City();
		city13.setCountryId(2L);
		city13.setId(13L);
		city13.setCityName("Barnet");

		City city14 = new City();
		city14.setCountryId(2L);
		city14.setId(14L);
		city14.setCityName("Gateshead");

		City city15 = new City();
		city15.setCountryId(2L);
		city15.setId(15L);
		city15.setCityName("Basingstoke");

		City city16 = new City();
		city16.setCountryId(2L);
		city16.setId(16L);
		city16.setCityName("Glasgow");

		City city17 = new City();
		city17.setCountryId(2L);
		city17.setId(17L);
		city17.setCityName("Milton Keynes");

		City city18 = new City();
		city18.setCountryId(2L);
		city18.setId(18L);
		city18.setCityName("Bath");

		// -----------------------------for AU

		City city19 = new City();
		city19.setCountryId(3L);
		city19.setId(19L);
		city19.setCityName("Canberra");

		City city20 = new City();
		city20.setCountryId(3L);
		city20.setId(20L);
		city20.setCityName("Penrith");

		City city21 = new City();
		city21.setCountryId(3L);
		city21.setId(21L);
		city21.setCityName("Sydney");

		City city22 = new City();
		city22.setCountryId(3L);
		city22.setId(22L);
		city22.setCityName("Southland");

		City city23 = new City();
		city23.setCountryId(3L);
		city23.setId(23L);
		city23.setCityName("Doncaster");

		City city24 = new City();
		city24.setCountryId(3L);
		city24.setId(24L);
		city24.setCityName("Fountain Gate");

		City city25 = new City();
		city25.setCountryId(3L);
		city25.setId(25L);
		city25.setCityName("Bondi");

		City city26 = new City();
		city26.setCountryId(3L);
		city26.setId(26L);
		city26.setCityName("Broadway");

		City city27 = new City();
		city27.setCountryId(3L);
		city27.setId(27L);
		city27.setCityName("Perth City");

		cities.add(city1);
		cities.add(city2);
		cities.add(city3);
		cities.add(city4);
		cities.add(city5);
		cities.add(city6);
		cities.add(city7);
		cities.add(city8);
		cities.add(city9);
		cities.add(city10);
		cities.add(city11);
		cities.add(city12);
		cities.add(city13);
		cities.add(city14);
		cities.add(city15);
		cities.add(city16);
		cities.add(city17);
		cities.add(city18);
		cities.add(city19);
		cities.add(city20);
		cities.add(city21);
		cities.add(city22);
		cities.add(city23);
		cities.add(city24);
		cities.add(city25);
		cities.add(city26);
		cities.add(city27);
	}

	/**
	 * Retrieves all City
	 */
	public List<City> getAllFromCountry(Long countryId) {
		logger.debug("Retrieving all cities by Country ID");
		List<City> list = new ArrayList<City>();
		for (City city : cities) {
			if (city.getCountryId().longValue() == countryId.longValue()) {
				list.add(city);
			}
		}
		return list;
	}
	
	/**
	 * Retrieves all persons
	 */
	public City getCity(Long id) {
		logger.debug("Retrieving all cities from id");
		
		for (City city : cities) {
			if (city.getId().longValue() == id.longValue()) {
				return city;
			}
		}
		return null;
	}
}
