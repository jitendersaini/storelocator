package com.storelocator.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.storelocator.rest.domain.Address;

@Service("addressService")
public class AddressService {

	protected static Logger logger = Logger.getLogger("service");

	// In-memory list
	private List<Address> addresses = new ArrayList<Address>();

	public AddressService() {
		logger.debug("Init database");
		Address address1 = new Address();
		address1.setId(1L);
		address1.setAddressTitle("Apple Store<br>The Summit<br>217 Summit Boulevard<br>Birmingham");
		address1.setPhoneNumber("(205) 909-2570");
		address1.setZipcode("AL 35243");
		address1.setCityId(1L);
		address1.setCountryId(1L);
		address1.setLatitude("33.57");
		address1.setLongitude("86.75");
		address1.setCityName("Alabama");

		Address address2 = new Address();
		address2.setId(2L);
		address2.setAddressTitle("Apple Store<br>Royal Hawaiian<br>2301 Kalakaua Avenue<br>Honolulu");
		address2.setPhoneNumber("(808) 931-2480");
		address2.setZipcode("HI 96815");
		address2.setCityId(2L);
		address2.setCountryId(1L);
		address2.setLatitude("21.280402500000000000");
		address2.setLongitude("-157.828214200000000000");
		address2.setCityName("Hawaii");

		Address address3 = new Address();
		address3.setId(3L);
		address3.setAddressTitle("Apple Store<br>Walden Galleria<br>G116 Walden Galleria<br>Buffalo");
		address3.setPhoneNumber("(716) 706-2000");
		address3.setZipcode("NY 14225");
		address3.setCityId(3L);
		address3.setCountryId(1L);
		address3.setLatitude("42.909795100000000000");
		address3.setLongitude("-78.762278499999980000");
		address3.setCityName("New York");

		Address address4 = new Address();
		address4.setId(4L);
		address4.setAddressTitle("Anchorage 5th Avenue Mall<br>320 West 5th Avenue<br>Anchorage");
		address4.setPhoneNumber("(907) 257-1900");
		address4.setZipcode("AK 99501");
		address4.setCityId(4L);
		address4.setCountryId(1L);
		address4.setLatitude("61.218055600000000000");
		address4.setLongitude("-149.900277800000030000");
		address4.setCityName("Alaska");

		Address address5 = new Address();
		address5.setId(5L);
		address5.setAddressTitle("Apple Store<br>Biltmore<br>2502 East Camelback Road<br>Phoenix");
		address5.setPhoneNumber("(602) 606-1470");
		address5.setZipcode("AZ 85016");
		address5.setCityId(5L);
		address5.setCountryId(1L);
		address5.setLatitude("33.5167058");
		address5.setLongitude("-112.0250686");
		address5.setCityName("Arizona");

		Address address6 = new Address();
		address6.setId(6L);
		address6.setAddressTitle("Apple Store<br>Beverly Center<br>8500 Beverly Boulevard<br>Los Angeles");
		address6.setPhoneNumber("(424) 239-3880");
		address6.setZipcode("CA 90048");
		address6.setCityId(6L);
		address6.setCountryId(1L);
		address6.setLatitude("34.076210700000000000");
		address6.setLongitude("-118.324650400000000000");
		address6.setCityName("California");

		Address address7 = new Address();
		address7.setId(7L);
		address7.setAddressTitle("Apple Store<br>University Park Mall<br>6501 North Grape Road<br>Mishawaka");
		address7.setPhoneNumber("(574) 277-9500");
		address7.setZipcode("IN 46545");
		address7.setCityId(7L);
		address7.setCountryId(1L);
		address7.setLatitude("41.711127");
		address7.setLongitude("-86.19104479999999");
		address7.setCityName("Indiana");

		Address address8 = new Address();
		address8.setId(8L);
		address8.setAddressTitle("Apple Store<br>CambridgeSide<br>100 CambridgeSide Place<br>Cambridge");
		address8.setPhoneNumber("(617) 528-7970");
		address8.setZipcode("MA 02141");
		address8.setCityId(8L);
		address8.setCountryId(1L);
		address8.setLatitude("42.3670997");
		address8.setLongitude("-71.0766499");
		address8.setCityName("Massachusetts");

		Address address9 = new Address();
		address9.setId(9L);
		address9.setAddressTitle("Apple Store<br>The Domain<br>11410 Century Oaks Terrace<br>Austin");
		address9.setPhoneNumber("(512) 691-4800");
		address9.setZipcode("TX 78758");
		address9.setCityId(9L);
		address9.setCountryId(1L);
		address9.setLatitude("30.402156600000000000");
		address9.setLongitude("-97.725900000000020000");
		address9.setCityName("Texas");

		// -------------------------------- for UK

		Address address10 = new Address();
		address10.setId(10L);
		address10
				.setAddressTitle("Apple Store<br>Union Square<br>27/28 Ground Level Mall, Union Square<br>Aberdeen");
		address10.setPhoneNumber("012 2428 7900");
		address10.setZipcode("AB11 5PN");
		address10.setCityId(10L);
		address10.setCountryId(2L);
		address10.setLatitude("57.1452834");
		address10.setLongitude("-2.0970471000000543");
		address10.setCityName("Aberdeen");

		Address address11 = new Address();
		address11.setId(9L);
		address11
				.setAddressTitle("Apple Store<br>Manchester Arndale<br>New Cannon Street Mall<br>Manchester");
		address11.setPhoneNumber("0161 455 1900");
		address11.setZipcode("M4 3AJ");
		address11.setCityId(9L);
		address11.setCountryId(2L);
		address11.setLatitude("53.483431");
		address11.setLongitude("-2.2415316000000303");
		address11.setCityName("Manchester");

		Address address12 = new Address();
		address12.setId(12L);
		address12
				.setAddressTitle("Apple Store<br>Princesshay<br>24 Princesshay<br>Exeter");
		address12.setPhoneNumber("013 9231 6600");
		address12.setZipcode("EX1 1GE");
		address12.setCityId(12L);
		address12.setCountryId(2L);
		address12.setLatitude("50.718412000000000000");
		address12.setLongitude("-3.533899000000019400");
		address12.setCityName("Exeter");

		Address address13 = new Address();
		address13.setId(13L);
		address13
				.setAddressTitle("Apple Store<br>Brent Cross<br>Lower East Mall<br>Barnet");
		address13.setPhoneNumber("020 3126 9200");
		address13.setZipcode("NW4 3FP");
		address13.setCityId(13L);
		address13.setCountryId(2L);
		address13.setLatitude("51.6344747");
		address13.setLongitude("-0.14738539999996192");
		address13.setCityName("Barnet");

		Address address14 = new Address();
		address14.setId(14L);
		address14
				.setAddressTitle("Apple Store<br>Metrocentre<br>Metrocentre<br>Gateshead");
		address14.setPhoneNumber("019 1402 2500");
		address14.setZipcode("NE11 9YG");
		address14.setCityId(14L);
		address14.setCountryId(2L);
		address14.setLatitude("54.958754300000000000");
		address14.setLongitude("-1.665637500000002500");
		address14.setCityName("Gateshead");

		Address address15 = new Address();
		address15.setId(15L);
		address15
				.setAddressTitle("Apple Store<br>Festival Place<br>Upper Level, Queen Anne’s Walk<br>Basingstoke");
		address15.setPhoneNumber("0125 669 6000");
		address15.setZipcode("RG21 7BE");
		address15.setCityId(15L);
		address15.setCountryId(2L);
		address15.setLatitude("51.2651499");
		address15.setLongitude("-1.0839955999999802");
		address15.setCityName("Basingstoke");

		Address address16 = new Address();
		address16.setId(16L);
		address16
				.setAddressTitle("Apple Store<br>Braehead<br>Braehead Shopping Centre<br>Glasgow");
		address16.setPhoneNumber("0141 885 4200");
		address16.setZipcode("G51 4BP");
		address16.setCityId(16L);
		address16.setCountryId(2L);
		address16.setLatitude("55.7859156");
		address16.setLongitude("-4.095518200000015");
		address16.setCityName("Glasgow");

		Address address17 = new Address();
		address17.setId(17L);
		address17
				.setAddressTitle("Apple Store<br>Milton Keynes<br>26 Midsummer Place<br>Milton Keynes");
		address17.setPhoneNumber("019 0885 6650");
		address17.setZipcode("MK9 3GB");
		address17.setCityId(17L);
		address17.setCountryId(2L);
		address17.setLatitude("52.0402218");
		address17.setLongitude("-0.7601915999999846");
		address17.setCityName("Milton Keynes");

		Address address18 = new Address();
		address18.setId(18L);
		address18
				.setAddressTitle("Apple Store<br> SouthGate<br>SU39, Southgate Place<br>Bath");
		address18.setPhoneNumber("0122 548 7000");
		address18.setZipcode("BA1 1AP");
		address18.setCityId(18L);
		address18.setCountryId(2L);
		address18.setLatitude("51.3773494");
		address18.setLongitude("-2.3817960000000085");
		address18.setCityName("Bath");

		// ----------------------------- for AU

		Address address19 = new Address();
		address19.setId(19L);
		address19
				.setAddressTitle("Apple Store<br> Canberra<br> Canberra Centre<br> Canberra");
		address19.setPhoneNumber("(02) 6224 9500");
		address19.setZipcode("ACT 2601");
		address19.setCityId(19L);
		address19.setCountryId(3L);
		address19.setLatitude("-34.9316986");
		address19.setLongitude("138.50271169999996");
		address19.setCityName("Canberra");

		Address address20 = new Address();
		address20.setId(20L);
		address20
				.setAddressTitle("Apple Store<br> Penrith<br> Westfield Penrith<br> Penrith");
		address20.setPhoneNumber("(02) 4702 9400");
		address20.setZipcode("NSW 2750");
		address20.setCityId(20L);
		address20.setCountryId(3L);
		address20.setLatitude("-33.752178500000000000");
		address20.setLongitude("150.691046700000010000");
		address20.setCityName("Penrith");

		Address address21 = new Address();
		address21.setId(21L);
		address21
				.setAddressTitle("Apple Store<br> Sydney<br> 367 George Street<br> Sydney");
		address21.setPhoneNumber("(02) 8083 9400");
		address21.setZipcode("NSW 2000");
		address21.setCityId(21L);
		address21.setCountryId(3L);
		address21.setLatitude("-33.870889100000000000");
		address21.setLongitude("151.206940900000060000");
		address21.setCityName("Sydney");

		Address address22 = new Address();
		address22.setId(22L);
		address22
				.setAddressTitle("Apple Store<br> Southland<br> Westfield Southland<br> Cheltenham");
		address22.setPhoneNumber("(03) 8523 1400");
		address22.setZipcode("VIC 3192");
		address22.setCityId(22L);
		address22.setCountryId(3L);
		address22.setLatitude("-34.868729700000000000");
		address22.setLongitude("138.522687899999940000");
		address22.setCityName("Southland");

		Address address23 = new Address();
		address23.setId(23L);
		address23
				.setAddressTitle("Apple Store<br> Doncaster<br> Westfield Doncaster<br> Doncaster");
		address23.setPhoneNumber("(03) 9914 2800");
		address23.setZipcode("VIC 3108");
		address23.setCityId(23L);
		address23.setCountryId(3L);
		address23.setLatitude("-37.7823116");
		address23.setLongitude("145.12568740000006");
		address23.setCityName("Doncaster");

		Address address24 = new Address();
		address24.setId(24L);
		address24
				.setAddressTitle("Apple Store<br> Fountain Gate<br> Westfield Fountain Gate<br> Fountain Gate");
		address24.setPhoneNumber("(03) 8765 4000");
		address24.setZipcode("VIC 3805");
		address24.setCityId(24L);
		address24.setCountryId(3L);
		address24.setLatitude("-38.027114999999990000");
		address24.setLongitude("145.303040000000000000");
		address24.setCityName("Fountain Gate");

		Address address25 = new Address();
		address25.setId(25L);
		address25
				.setAddressTitle("Apple Store<br> Bondi<br> 213 Oxford Street<br> Bondi");
		address25.setPhoneNumber("(02) 9019 2400");
		address25.setZipcode("NSW 2022");
		address25.setCityId(25L);
		address25.setCountryId(3L);
		address25.setLatitude("-33.890191000000000000");
		address25.setLongitude("151.241944600000000000");
		address25.setCityName("Bondi");

		Address address26 = new Address();
		address26.setId(26L);
		address26
				.setAddressTitle("Apple Store<br> Broadway<br> Broadway Shopping Centre<br> Broadway");
		address26.setPhoneNumber("(02) 8035 4000");
		address26.setZipcode("NSW 2007");
		address26.setCityId(26L);
		address26.setCountryId(3L);
		address26.setLatitude("-33.884206500000000000");
		address26.setLongitude("151.194886099999960000");
		address26.setCityName("Broadway");

		Address address27 = new Address();
		address27.setId(27L);
		address27
				.setAddressTitle("Apple Store<br> Perth City<br> 790 Hay Street<br> Perth");
		address27.setPhoneNumber("(08) 6140 3800");
		address27.setZipcode("WA 6000");
		address27.setCityId(27L);
		address27.setCountryId(3L);
		address27.setLatitude("-31.950961200000000000");
		address27.setLongitude("115.849017600000020000");
		address27.setCityName("Perth City");

		addresses.add(address1);
		addresses.add(address2);
		addresses.add(address3);
		addresses.add(address4);
		addresses.add(address5);
		addresses.add(address6);
		addresses.add(address7);
		addresses.add(address8);
		addresses.add(address9);
		addresses.add(address10);
		addresses.add(address11);
		addresses.add(address12);
		addresses.add(address13);
		addresses.add(address14);
		addresses.add(address15);
		addresses.add(address16);
		addresses.add(address17);
		addresses.add(address18);
		addresses.add(address19);
		addresses.add(address20);
		addresses.add(address21);
		addresses.add(address22);
		addresses.add(address23);
		addresses.add(address24);
		addresses.add(address25);
		addresses.add(address26);
		addresses.add(address27);

	}

	/**
	 * Retrieves a Address by Country ID
	 */
	public List<Address> getByCountryId(Long id) {
		logger.debug("Retrieving City with country id: " + id);
		List<Address> list = new ArrayList<Address>();
		for (Address address : addresses) {
			if (address.getCountryId().longValue() == id.longValue()) {
				logger.debug("Found by country record");
				list.add(address);

			}
		}

		// logger.debug("No records found");
		return list;
	}

	/**
	 * Retrieves all Addresses
	 */
	public List<Address> getAll() {
		logger.debug("Retrieving All addresses");
		return addresses;

	}

	/**
	 * Retrieves a Address by City ID
	 */
	public List<Address> getByCityId(Long id) {
		logger.debug("Retrieving City with city id: " + id);
		List<Address> list = new ArrayList<Address>();
		for (Address address : addresses) {
			if (address.getCityId().longValue() == id.longValue()) {
				// logger.debug("Found record");
				list.add(address);

			}
		}

		// logger.debug("No records found");
		return list;
	}

	/**
	 * Retrieves a Address by City ID
	 */
	public Address getByZipCode(String zip) {
		logger.debug("Retrieving City with zip code: " + zip);

		for (Address address : addresses) {
			if (address.getZipcode().equals(zip)) {
				logger.debug("Found record");
				return address;
			}
		}

		logger.debug("No records found");
		return null;
	}

	/**
	 * Retrieves a Address by ID
	 */
	public Address getById(Long id) {
		logger.debug("Retrieving City with id: " + id);

		for (Address address : addresses) {
			if (address.getId().longValue() == id.longValue()) {
				logger.debug("Found record");
				return address;
			}
		}

		logger.debug("No records found");
		return null;
	}

}
