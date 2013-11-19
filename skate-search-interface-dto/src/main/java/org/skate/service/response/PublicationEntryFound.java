package org.skate.service.response;

import java.util.List;

/**
 * 
 * @author Erik van Ingen
 * 
 */

public class PublicationEntryFound {

	private String title;
	private String description;
	private String hrefHtmlVersion;
	private String publicationTitle;
	private int year;
	private String infoLink;
	private List<InfoLinkIcon> infoLinkIconList;

	public List<InfoLinkIcon> getInfoLinkIconList() {
		return infoLinkIconList;
	}

	public void setInfoLinkIconList(List<InfoLinkIcon> infoLinkIconList) {
		this.infoLinkIconList = infoLinkIconList;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHrefHtmlVersion() {
		return hrefHtmlVersion;
	}

	public void setHrefHtmlVersion(String hrefHtmlVersion) {
		this.hrefHtmlVersion = hrefHtmlVersion;
	}

	public String getPublicationTitle() {
		return publicationTitle;
	}

	public void setPublicationTitle(String publicationTitle) {
		this.publicationTitle = publicationTitle;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getInfoLink() {
		return infoLink;
	}

	public void setInfoLink(String infoLink) {
		this.infoLink = infoLink;
	}

}
