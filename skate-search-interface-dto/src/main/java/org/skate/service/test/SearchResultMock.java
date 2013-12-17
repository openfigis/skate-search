package org.skate.service.test;

import org.fao.fi.skate.search.ObjectFactory;
import org.fao.fi.skate.search.PublicationEntryFoundType;
import org.fao.fi.skate.search.PublicationSearchResult;

public class SearchResultMock {
	private static ObjectFactory f = new ObjectFactory();

	private static final String ABSTRACT = "This document contains the report of the Technical Consultation to review progress and promote the full implementation of the International Plan of Action (IPOA) to prevent, deter and eliminate illegal, unreported and unregulated (IUU) fishing and the International Plan of Action for the management of fishing capacity which was held at FAO headquarters, Rome, from 24 to 29 June 2004. The Technical Consultation was convened by the Director-General of FAO on the recommendation of the FAO Committee on Fisheries at it twenty-fifth session in February 2003. The Consultation reaffirmed the importance of Resolution (6/2003) “Progress Report on Implementation of the International Plan of Action to Prevent, Deter and Eliminate Illegal, Unreported and Unregulated (IUU) Fishing” adopted in December 2003 at the FAO Conference and identified major recommendations for consideration by the Twenty-sixth Session of COFI in 2005 and the following FAO Ministerial Meeting on Fisheries to ensure effective and full implementation of the resolution as well as IPOA-IUU and IPOA-capacity. The Technical Consultation suggested a number of actions to be facilitated by FAO to promote the full implementation of the IPOA-IUU and IPOA-capacity. The Consultation examined, under exceptional circumstances, the particular situation of the tuna fisheries in the western and central Pacific Ocean. In view of the urgency of the situation, and the fact that the relevant regional fishery management organization (RFMO) is still in the process of becoming operational, the Consultation suggested that governments in the region should lend priority attention to addressing the situation, including halting introductions of additional large-scale fishing vessels.";
	private static final String URL = "http://www.fao.org/docrep/007/y5681e/y5681e00.htm";

	public static PublicationSearchResult get(int numberOfElements) {
		PublicationEntryFoundType found = f.createPublicationEntryFoundType();
		found.setAbstract(ABSTRACT);
		found.setAuthor("Fabrizio Sibeni");
		found.setTitle("title");
		found.setAbstract("abstract");
		found.setAuthor("author");
		found.setPages("pages");
		found.setBiblioReference("biblioReference");
		found.setOwner("owner");
		found.setJobNumber("jobNumber");
		found.setDocumentNumber("documentNumber");
		found.setSeries("series");
		found.setLanguage("language");
		found.setStatutoryBody("statutoryBody");
		found.setIsbn("isbn");
		found.setProgrammeName("programmeName");
		found.setProjectName("projectName");
		found.setPublicationType("publicationType");
		found.setCountry("country");
		found.setYear(2015);
		found.setHtmlUrl(URL);
		found.setPdfUrl(URL);
		found.setZipUrl(URL);
		found.setCoverUrl(URL);
		found.setPopupUrl(URL);

		PublicationSearchResult sss = f.createPublicationSearchResult();
		for (int i = 0; i < numberOfElements; i++) {
			sss.getPublicationEntryFounds().add(found);
		}

		return sss;

	}

	public static PublicationSearchResult get() {
		return get(1);
	}

}
