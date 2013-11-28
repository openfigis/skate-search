package org.skate.service.impl;

import org.fao.fi.skate.search.PublicationSearchResult;
import org.skate.service.SearchService;
import org.skate.service.request.PublicationSearchRequest;
import org.skate.service.test.SearchResultMock;
import org.skate.service.test.SkateAbstractServiceTest;

/**
 * @author Erik van Ingen
 * 
 */

public class SearchServiceImpl implements SearchService {

	@Override
	public PublicationSearchResult search(String searchTerm) {
		return SearchResultMock.get();

	}

	@Override
	public PublicationSearchResult search(PublicationSearchRequest searchParameters) {
		return SearchResultMock.get(SkateAbstractServiceTest.ENTRIES_FOUND);
	}

}
