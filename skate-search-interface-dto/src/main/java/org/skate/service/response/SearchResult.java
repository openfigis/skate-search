/**
 * 
 */
package org.skate.service.response;

import java.util.List;

/**
 * @author Erik van Ingen
 * 
 */
public class SearchResult {

	private String fiets = "blaat";

	public String getFiets() {
		return fiets;
	}

	public void setFiets(String fiets) {
		this.fiets = fiets;
	}

	private List<FoundElement> foundElementList;

	public List<FoundElement> getFoundElementList() {
		return foundElementList;
	}

	public void setFoundElementList(List<FoundElement> foundElementList) {
		this.foundElementList = foundElementList;
	}

}
