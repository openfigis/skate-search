package org.skate.service.test;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.fao.fi.skate.search.PublicationSearchResult;
import org.junit.Test;
import org.skate.service.SearchService;
import org.skate.service.request.ExtendedPublicationSearchRequest;
import org.skate.service.request.PublicationSearchRequest;

public abstract class SkateAbstractServiceTest {

	public final static int ENTRIES_FOUND = 100;

	String language = "nl";
	String searchTerm = "asfis";
	@Inject
	protected SearchService searchService;

	@Test
	public void testSearch() {
		PublicationSearchResult response = searchService.search(language, searchTerm);
		assertEquals(response.getPublicationEntryFounds().size(), 1);
	}

	@Test
	public void testadvancedSearch() {
		PublicationSearchRequest r = new PublicationSearchRequest();
		r.setSearchTerm(searchTerm);
		r.setAuthors("");

		r.setPublicationYear(0);
		r.setSeriesTitle("");
		r.setWordInTitle("");
		PublicationSearchResult response = searchService.advancedSearch(language, r);
		assertEquals(ENTRIES_FOUND, response.getPublicationEntryFounds().size());
	}

	@Test
	public void testExtendedSearch() {
		ExtendedPublicationSearchRequest r = new ExtendedPublicationSearchRequest();
		r.setSearchTerm(searchTerm);
		r.setAuthors("");

		r.setPublicationYear(0);
		r.setSeriesTitle("");
		r.setWordInTitle("");
		PublicationSearchResult response = searchService.extendedSearch(language, r);
		assertEquals(ENTRIES_FOUND, response.getPublicationEntryFounds().size());
	}

}
