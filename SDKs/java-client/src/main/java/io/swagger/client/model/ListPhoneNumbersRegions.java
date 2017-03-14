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
import io.swagger.client.model.FilterListPhoneNumbersRegions;
import io.swagger.client.model.PhoneNumbersRegionFull;
import io.swagger.client.model.SortListPhoneNumbersRegions;
import java.util.ArrayList;
import java.util.List;

/**
 * ListPhoneNumbersRegions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-13T08:15:06.119Z")
public class ListPhoneNumbersRegions {
  @SerializedName("group_by")
  private List<String> groupBy = new ArrayList<String>();

  @SerializedName("filters")
  private FilterListPhoneNumbersRegions filters = null;

  @SerializedName("sort")
  private SortListPhoneNumbersRegions sort = null;

  @SerializedName("total")
  private Integer total = null;

  @SerializedName("offset")
  private Integer offset = null;

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("items")
  private List<PhoneNumbersRegionFull> items = new ArrayList<PhoneNumbersRegionFull>();

  public ListPhoneNumbersRegions groupBy(List<String> groupBy) {
    this.groupBy = groupBy;
    return this;
  }

  public ListPhoneNumbersRegions addGroupByItem(String groupByItem) {
    this.groupBy.add(groupByItem);
    return this;
  }

   /**
   * Get groupBy
   * @return groupBy
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<String> groupBy) {
    this.groupBy = groupBy;
  }

  public ListPhoneNumbersRegions filters(FilterListPhoneNumbersRegions filters) {
    this.filters = filters;
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @ApiModelProperty(example = "null", value = "")
  public FilterListPhoneNumbersRegions getFilters() {
    return filters;
  }

  public void setFilters(FilterListPhoneNumbersRegions filters) {
    this.filters = filters;
  }

  public ListPhoneNumbersRegions sort(SortListPhoneNumbersRegions sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @ApiModelProperty(example = "null", value = "")
  public SortListPhoneNumbersRegions getSort() {
    return sort;
  }

  public void setSort(SortListPhoneNumbersRegions sort) {
    this.sort = sort;
  }

  public ListPhoneNumbersRegions total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public ListPhoneNumbersRegions offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public ListPhoneNumbersRegions limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public ListPhoneNumbersRegions items(List<PhoneNumbersRegionFull> items) {
    this.items = items;
    return this;
  }

  public ListPhoneNumbersRegions addItemsItem(PhoneNumbersRegionFull itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<PhoneNumbersRegionFull> getItems() {
    return items;
  }

  public void setItems(List<PhoneNumbersRegionFull> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPhoneNumbersRegions listPhoneNumbersRegions = (ListPhoneNumbersRegions) o;
    return Objects.equals(this.groupBy, listPhoneNumbersRegions.groupBy) &&
        Objects.equals(this.filters, listPhoneNumbersRegions.filters) &&
        Objects.equals(this.sort, listPhoneNumbersRegions.sort) &&
        Objects.equals(this.total, listPhoneNumbersRegions.total) &&
        Objects.equals(this.offset, listPhoneNumbersRegions.offset) &&
        Objects.equals(this.limit, listPhoneNumbersRegions.limit) &&
        Objects.equals(this.items, listPhoneNumbersRegions.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupBy, filters, sort, total, offset, limit, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPhoneNumbersRegions {\n");
    
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
