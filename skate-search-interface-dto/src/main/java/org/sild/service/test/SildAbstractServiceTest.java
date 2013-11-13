package org.skate.service.test;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.junit.Test;
import org.skate.service.SearchService;
import org.skate.service.request.AdvancedSearchRequest;
import org.skate.service.response.SearchResult;

public abstract class SkateAbstractServiceTest {

	public final static int ENTRIES_FOUND = 100;

	String searchTerm = "asfis";
	@Inject
	protected SearchService searchService;

	@Test
	public void testSearch() {
		SearchResult response = searchService.search(searchTerm);
		assertEquals(response.getFoundElementList().size(), 1);
	}

	@Test
	public void testadvancedSearch() {
		AdvancedSearchRequest r = new AdvancedSearchRequest();
		r.setSearchTerm(searchTerm);
		r.setAuthors("");
		r.setLanguage("");
		r.setPublicationYear(0);
		r.setSeriesTitle("");
		r.setWordInTitle("");
		SearchResult response = searchService.search(r);
		assertEquals(ENTRIES_FOUND, response.getFoundElementList().size());
	}

}