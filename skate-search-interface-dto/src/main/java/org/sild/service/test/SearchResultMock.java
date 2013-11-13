package org.skate.service.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.skate.service.SkateException;
import org.skate.service.response.FoundElement;
import org.skate.service.response.InfoLinkIcon;
import org.skate.service.response.LinkType;
import org.skate.service.response.SearchResult;

public class SearchResultMock {

	public static SearchResult get(int numberOfElements) {
		InfoLinkIcon fl = new InfoLinkIcon();
		fl.setLinkType(LinkType.pdf);
		URL url;
		try {
			url = new URL("http://www.fao.org/fi/eims_search/1_dett.asp?calling=simple_s_result&lang=en&pub_id=64256");
		} catch (MalformedURLException e) {
			throw new SkateException(e);
		}
		fl.setUrl(url);

		List<InfoLinkIcon> infoLinkIconList = new ArrayList<InfoLinkIcon>();
		infoLinkIconList.add(fl);

		FoundElement f = new FoundElement();
		f.setDescription("Implications of the Agreement for the Implementation of the Provisions of the United Nations Convention on the Law of the Sea of 10 December 1982 Relating to the Conservation and Management of Straddling Fish Stocks and Highly Migratory Fish Stocks.");
		f.setTitle("Fisheries and research for tunas and tuna-like-species in the Western Central Atlantic");
		f.setHrefHtmlVersion("http://www.fao.org/docrep/X5623E/X5623E00.htm");
		f.setInfoLink("javascript:new_window('http://www.fao.org/fi/eims_search/1_dett.asp?calling=simple_s_result&lang=en&pub_id=64912','pop',1,1,1,1,1,1,1,600,600)");
		f.setPublicationTitle("FAO Fisheries Technical Paper T357");
		f.setYear(2013);
		f.setInfoLinkIconList(infoLinkIconList);

		List<FoundElement> foundElementList = new ArrayList<FoundElement>();
		for (int i = 0; i < numberOfElements; i++) {
			foundElementList.add(f);
		}
		SearchResult r = new SearchResult();
		r.setFoundElementList(foundElementList);

		return r;

	}

	public static SearchResult get() {
		return get(1);
	}

}
