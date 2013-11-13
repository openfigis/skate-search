package org.skate.service.response;

import java.util.List;

/**
 * 
 * @author Erik van Ingen
 * 
 */
public class SystemResultList {

	private System system;

	private List<FoundElement> foundElementList;

	public System getSystem() {
		return system;
	}

	public void setSystem(System system) {
		this.system = system;
	}

	public List<FoundElement> getFoundElementList() {
		return foundElementList;
	}

	public void setFoundElementList(List<FoundElement> foundElementList) {
		this.foundElementList = foundElementList;
	}

}
