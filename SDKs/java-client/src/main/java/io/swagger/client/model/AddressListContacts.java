/*
 * Phone.com API
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AddressListContacts
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-13T08:15:06.119Z")
public class AddressListContacts {
  @SerializedName("type")
  private String type = null;

  @SerializedName("street")
  private String street = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("zip")
  private String zip = null;

  @SerializedName("country")
  private String country = null;

  public AddressListContacts type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Address type, one of: home or business. Default is home.
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Address type, one of: home or business. Default is home.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AddressListContacts street(String street) {
    this.street = street;
    return this;
  }

   /**
   * House number and street name, including apartment, suite, etc.
   * @return street
  **/
  @ApiModelProperty(example = "null", value = "House number and street name, including apartment, suite, etc.")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public AddressListContacts city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City
   * @return city
  **/
  @ApiModelProperty(example = "null", value = "City")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AddressListContacts state(String state) {
    this.state = state;
    return this;
  }

   /**
   * State or province
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "State or province")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public AddressListContacts zip(String zip) {
    this.zip = zip;
    return this;
  }

   /**
   * Zip code or postal code
   * @return zip
  **/
  @ApiModelProperty(example = "null", value = "Zip code or postal code")
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public AddressListContacts country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country name
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "Country name")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressListContacts addressListContacts = (AddressListContacts) o;
    return Objects.equals(this.type, addressListContacts.type) &&
        Objects.equals(this.street, addressListContacts.street) &&
        Objects.equals(this.city, addressListContacts.city) &&
        Objects.equals(this.state, addressListContacts.state) &&
        Objects.equals(this.zip, addressListContacts.zip) &&
        Objects.equals(this.country, addressListContacts.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, street, city, state, zip, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressListContacts {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
