package com.myteam.tts_connected_claims;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class location implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "address")
	private java.lang.String address;
	@org.kie.api.definition.type.Label(value = "city")
	private java.lang.String city;
	@org.kie.api.definition.type.Label(value = "country")
	private java.lang.String country;
	@org.kie.api.definition.type.Label(value = "latitude")
	private java.lang.String latitude;
	@org.kie.api.definition.type.Label(value = "longitude")
	private java.lang.String longitude;
	@org.kie.api.definition.type.Label(value = "province")
	private java.lang.String province;
	@org.kie.api.definition.type.Label(value = "suburb")
	private java.lang.String suburb;

	public location() {
	}

	public java.lang.String getAddress() {
		return this.address;
	}

	public void setAddress(java.lang.String address) {
		this.address = address;
	}

	public java.lang.String getCity() {
		return this.city;
	}

	public void setCity(java.lang.String city) {
		this.city = city;
	}

	public java.lang.String getCountry() {
		return this.country;
	}

	public void setCountry(java.lang.String country) {
		this.country = country;
	}

	public java.lang.String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(java.lang.String latitude) {
		this.latitude = latitude;
	}

	public java.lang.String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(java.lang.String longitude) {
		this.longitude = longitude;
	}

	public java.lang.String getProvince() {
		return this.province;
	}

	public void setProvince(java.lang.String province) {
		this.province = province;
	}

	public java.lang.String getSuburb() {
		return this.suburb;
	}

	public void setSuburb(java.lang.String suburb) {
		this.suburb = suburb;
	}

	public location(java.lang.String address, java.lang.String city,
			java.lang.String country, java.lang.String latitude,
			java.lang.String longitude, java.lang.String province,
			java.lang.String suburb) {
		this.address = address;
		this.city = city;
		this.country = country;
		this.latitude = latitude;
		this.longitude = longitude;
		this.province = province;
		this.suburb = suburb;
	}

}