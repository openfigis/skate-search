package org.skate.service.test;

import java.util.ArrayList;
import java.util.List;

import org.fao.fi.skate.search.InfoLinkIconType;
import org.fao.fi.skate.search.LinkType;
import org.fao.fi.skate.search.ObjectFactory;
import org.fao.fi.skate.search.PublicationEntryFoundType;
import org.fao.fi.skate.search.PublicationSearchResult;

public class SearchResultMock {
	private static ObjectFactory f = new ObjectFactory();

	public static PublicationSearchResult get(int numberOfElements) {
		InfoLinkIconType fl = new InfoLinkIconType();
		fl.setLinkType(LinkType.PDF);
		String url = "http://www.fao.org/fi/eims_search/1_dett.asp?calling=simple_s_result&lang=en&pub_id=64256";
		fl.setUrl(url);

		List<InfoLinkIconType> infoLinkIconList = new ArrayList<InfoLinkIconType>();
		infoLinkIconList.add(fl);

		InfoLinkIconType l = f.createInfoLinkIconType();
		l.setUrl("www.fao.org");
		l.setLinkType(LinkType.PDF);

		PublicationEntryFoundType e = f.createPublicationEntryFoundType();
		e.getInfoLinkIcons().add(l);

		PublicationEntryFoundType found = f.createPublicationEntryFoundType();
		found.setDescription("Implications of the Agreement for the Implementation of the Provisions of the United Nations Convention on the Law of the Sea of 10 December 1982 Relating to the Conservation and Management of Straddling Fish Stocks and Highly Migratory Fish Stocks.");
		found.setTitle("Fisheries and research for tunas and tuna-like-species in the Western Central Atlantic");
		found.setHrefHtmlVersion("http://www.fao.org/docrep/X5623E/X5623E00.htm");
		found.setInfoLink("javascript:new_window('http://www.fao.org/fi/eims_search/1_dett.asp?calling=simple_s_result&lang=en&pub_id=64912','pop',1,1,1,1,1,1,1,600,600)");
		found.setPublicationTitle("FAO Fisheries Technical Paper T357");
		found.setYear(2013);
		found.getInfoLinkIcons().add(l);

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
