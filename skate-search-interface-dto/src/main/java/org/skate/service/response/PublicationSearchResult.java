package org.skate.service.response;

import java.util.List;

/**
 * 
 * @author Erik van Ingen
 * 
 */
public class PublicationSearchResult {

	private List<PublicationEntryFound> foundElementList;

	public List<PublicationEntryFound> getFoundElementList() {
		return foundElementList;
	}

	public void setFoundElementList(List<PublicationEntryFound> foundElementList) {
		this.foundElementList = foundElementList;
	}

}
