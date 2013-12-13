package org.skate.service.request;

/**
 * 
 * @author Erik van Ingen
 * 
 */
public class PublicationSearchRequest extends SearchRequest {

	private String wordInTitle;
	private String authors;
	private int publicationYear;
	private String seriesTitle;

	public String getWordInTitle() {
		return wordInTitle;
	}

	public void setWordInTitle(String wordInTitle) {
		this.wordInTitle = wordInTitle;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getSeriesTitle() {
		return seriesTitle;
	}

	public void setSeriesTitle(String seriesTitle) {
		this.seriesTitle = seriesTitle;
	}

}
