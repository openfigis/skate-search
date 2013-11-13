package org.skate.service.impl;

import org.skate.service.SearchService;
import org.skate.service.request.AdvancedSearchRequest;
import org.skate.service.response.SearchResult;
import org.skate.service.test.SearchResultMock;
import org.skate.service.test.SkateAbstractServiceTest;

/**
 * @author Erik van Ingen
 * 
 */

public class SkateServiceImpl implements SearchService {

	@Override
	public SearchResult search(String searchTerm) {
		return SearchResultMock.get();

	}

	@Override
	public SearchResult search(AdvancedSearchRequest searchParameters) {
		return SearchResultMock.get(SkateAbstractServiceTest.ENTRIES_FOUND);
	}

}
