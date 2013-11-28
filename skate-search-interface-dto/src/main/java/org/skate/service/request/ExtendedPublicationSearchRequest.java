package org.skate.service.request;

public class ExtendedPublicationSearchRequest extends PublicationSearchRequest {

	private String dataOwner;
	private String statutoryBody;
	private String isbn;
	private String programmeName;
	private String projectCodeNumber;
	private String projectName;
	private String documentNumber;
	private String jobNumber;
	private String typeOfPublication;
	private String otherTypeOfPublication;
	private String country;
	private String continent;

	public String getDataOwner() {
		return dataOwner;
	}

	public void setDataOwner(String dataOwner) {
		this.dataOwner = dataOwner;
	}

	public String getStatutoryBody() {
		return statutoryBody;
	}

	public void setStatutoryBody(String statutoryBody) {
		this.statutoryBody = statutoryBody;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getProgrammeName() {
		return programmeName;
	}

	public void setProgrammeName(String programmeName) {
		this.programmeName = programmeName;
	}

	public String getProjectCodeNumber() {
		return projectCodeNumber;
	}

	public void setProjectCodeNumber(String projectCodeNumber) {
		this.projectCodeNumber = projectCodeNumber;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getJobNumber() {
		return jobNumber;
	}

	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber;
	}

	public String getTypeOfPublication() {
		return typeOfPublication;
	}

	public void setTypeOfPublication(String typeOfPublication) {
		this.typeOfPublication = typeOfPublication;
	}

	public String getOtherTypeOfPublication() {
		return otherTypeOfPublication;
	}

	public void setOtherTypeOfPublication(String otherTypeOfPublication) {
		this.otherTypeOfPublication = otherTypeOfPublication;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

}
