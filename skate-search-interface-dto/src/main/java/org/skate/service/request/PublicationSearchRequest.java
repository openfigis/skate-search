package org.skate.service.request;

/**
 * The request parameters for the FDR search.
 * 
 * http://km.fao.org/FIGISwiki/index.php/FAO_Document_Repository#
 * Webservice_Interface
 * 
 * 
 * @author Erik van Ingen
 * 
 */
public class PublicationSearchRequest extends SearchRequest {

	private String wordsInTitle;
	private String author;
	private int year;
	private String series;
	private String owner;
	private String statutoryBody;
	private String isbn;
	private String programmeName;
	private String projectName;
	private String documentNumber;
	private String jobNumber;
	private String publicationType;
	private String country;
	private String continent;

	public String getWordsInTitle() {
		return wordsInTitle;
	}

	public void setWordsInTitle(String wordsInTitle) {
		this.wordsInTitle = wordsInTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
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

	public String getPublicationType() {
		return publicationType;
	}

	public void setPublicationType(String publicationType) {
		this.publicationType = publicationType;
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
