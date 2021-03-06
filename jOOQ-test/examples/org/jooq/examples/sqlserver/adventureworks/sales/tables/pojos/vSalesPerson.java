/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "vSalesPerson", schema = "Sales")
public class vSalesPerson implements java.io.Serializable {

	private static final long serialVersionUID = -924947616;


	@javax.validation.constraints.NotNull
	private java.lang.Integer    SalesPersonID;

	@javax.validation.constraints.Size(max = 8)
	private java.lang.String     Title;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 50)
	private java.lang.String     FirstName;

	@javax.validation.constraints.Size(max = 50)
	private java.lang.String     MiddleName;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 50)
	private java.lang.String     LastName;

	@javax.validation.constraints.Size(max = 10)
	private java.lang.String     Suffix;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 50)
	private java.lang.String     JobTitle;

	@javax.validation.constraints.Size(max = 25)
	private java.lang.String     Phone;

	@javax.validation.constraints.Size(max = 50)
	private java.lang.String     EmailAddress;

	@javax.validation.constraints.NotNull
	private java.lang.Integer    EmailPromotion;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 60)
	private java.lang.String     AddressLine1;

	@javax.validation.constraints.Size(max = 60)
	private java.lang.String     AddressLine2;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 30)
	private java.lang.String     City;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 50)
	private java.lang.String     StateProvinceName;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 15)
	private java.lang.String     PostalCode;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 50)
	private java.lang.String     CountryRegionName;

	@javax.validation.constraints.Size(max = 50)
	private java.lang.String     TerritoryName;

	@javax.validation.constraints.Size(max = 50)
	private java.lang.String     TerritoryGroup;
	private java.math.BigDecimal SalesQuota;

	@javax.validation.constraints.NotNull
	private java.math.BigDecimal SalesYTD;

	@javax.validation.constraints.NotNull
	private java.math.BigDecimal SalesLastYear;

	@javax.persistence.Column(name = "SalesPersonID", nullable = false, precision = 10)
	public java.lang.Integer getSalesPersonID() {
		return this.SalesPersonID;
	}

	public void setSalesPersonID(java.lang.Integer SalesPersonID) {
		this.SalesPersonID = SalesPersonID;
	}

	@javax.persistence.Column(name = "Title", length = 8)
	public java.lang.String getTitle() {
		return this.Title;
	}

	public void setTitle(java.lang.String Title) {
		this.Title = Title;
	}

	@javax.persistence.Column(name = "FirstName", nullable = false, length = 50)
	public java.lang.String getFirstName() {
		return this.FirstName;
	}

	public void setFirstName(java.lang.String FirstName) {
		this.FirstName = FirstName;
	}

	@javax.persistence.Column(name = "MiddleName", length = 50)
	public java.lang.String getMiddleName() {
		return this.MiddleName;
	}

	public void setMiddleName(java.lang.String MiddleName) {
		this.MiddleName = MiddleName;
	}

	@javax.persistence.Column(name = "LastName", nullable = false, length = 50)
	public java.lang.String getLastName() {
		return this.LastName;
	}

	public void setLastName(java.lang.String LastName) {
		this.LastName = LastName;
	}

	@javax.persistence.Column(name = "Suffix", length = 10)
	public java.lang.String getSuffix() {
		return this.Suffix;
	}

	public void setSuffix(java.lang.String Suffix) {
		this.Suffix = Suffix;
	}

	@javax.persistence.Column(name = "JobTitle", nullable = false, length = 50)
	public java.lang.String getJobTitle() {
		return this.JobTitle;
	}

	public void setJobTitle(java.lang.String JobTitle) {
		this.JobTitle = JobTitle;
	}

	@javax.persistence.Column(name = "Phone", length = 25)
	public java.lang.String getPhone() {
		return this.Phone;
	}

	public void setPhone(java.lang.String Phone) {
		this.Phone = Phone;
	}

	@javax.persistence.Column(name = "EmailAddress", length = 50)
	public java.lang.String getEmailAddress() {
		return this.EmailAddress;
	}

	public void setEmailAddress(java.lang.String EmailAddress) {
		this.EmailAddress = EmailAddress;
	}

	@javax.persistence.Column(name = "EmailPromotion", nullable = false, precision = 10)
	public java.lang.Integer getEmailPromotion() {
		return this.EmailPromotion;
	}

	public void setEmailPromotion(java.lang.Integer EmailPromotion) {
		this.EmailPromotion = EmailPromotion;
	}

	@javax.persistence.Column(name = "AddressLine1", nullable = false, length = 60)
	public java.lang.String getAddressLine1() {
		return this.AddressLine1;
	}

	public void setAddressLine1(java.lang.String AddressLine1) {
		this.AddressLine1 = AddressLine1;
	}

	@javax.persistence.Column(name = "AddressLine2", length = 60)
	public java.lang.String getAddressLine2() {
		return this.AddressLine2;
	}

	public void setAddressLine2(java.lang.String AddressLine2) {
		this.AddressLine2 = AddressLine2;
	}

	@javax.persistence.Column(name = "City", nullable = false, length = 30)
	public java.lang.String getCity() {
		return this.City;
	}

	public void setCity(java.lang.String City) {
		this.City = City;
	}

	@javax.persistence.Column(name = "StateProvinceName", nullable = false, length = 50)
	public java.lang.String getStateProvinceName() {
		return this.StateProvinceName;
	}

	public void setStateProvinceName(java.lang.String StateProvinceName) {
		this.StateProvinceName = StateProvinceName;
	}

	@javax.persistence.Column(name = "PostalCode", nullable = false, length = 15)
	public java.lang.String getPostalCode() {
		return this.PostalCode;
	}

	public void setPostalCode(java.lang.String PostalCode) {
		this.PostalCode = PostalCode;
	}

	@javax.persistence.Column(name = "CountryRegionName", nullable = false, length = 50)
	public java.lang.String getCountryRegionName() {
		return this.CountryRegionName;
	}

	public void setCountryRegionName(java.lang.String CountryRegionName) {
		this.CountryRegionName = CountryRegionName;
	}

	@javax.persistence.Column(name = "TerritoryName", length = 50)
	public java.lang.String getTerritoryName() {
		return this.TerritoryName;
	}

	public void setTerritoryName(java.lang.String TerritoryName) {
		this.TerritoryName = TerritoryName;
	}

	@javax.persistence.Column(name = "TerritoryGroup", length = 50)
	public java.lang.String getTerritoryGroup() {
		return this.TerritoryGroup;
	}

	public void setTerritoryGroup(java.lang.String TerritoryGroup) {
		this.TerritoryGroup = TerritoryGroup;
	}

	@javax.persistence.Column(name = "SalesQuota", precision = 19, scale = 4)
	public java.math.BigDecimal getSalesQuota() {
		return this.SalesQuota;
	}

	public void setSalesQuota(java.math.BigDecimal SalesQuota) {
		this.SalesQuota = SalesQuota;
	}

	@javax.persistence.Column(name = "SalesYTD", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getSalesYTD() {
		return this.SalesYTD;
	}

	public void setSalesYTD(java.math.BigDecimal SalesYTD) {
		this.SalesYTD = SalesYTD;
	}

	@javax.persistence.Column(name = "SalesLastYear", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getSalesLastYear() {
		return this.SalesLastYear;
	}

	public void setSalesLastYear(java.math.BigDecimal SalesLastYear) {
		this.SalesLastYear = SalesLastYear;
	}
}
