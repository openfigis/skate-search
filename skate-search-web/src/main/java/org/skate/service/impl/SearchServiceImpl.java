package org.skate.service.impl;

import org.fao.fdr.core.model.search.FdrSearchResult;
import org.fao.fdr.core.services.SearchServiceException;
import org.fao.fdr.core.services.SearchServiceFactory;
import org.fao.fi.skate.search.PublicationSearchResult;
import org.skate.service.SearchService;
import org.skate.service.SkateException;
import org.skate.service.request.ExtendedPublicationSearchRequest;
import org.skate.service.request.PublicationSearchRequest;
import org.skate.service.test.SearchResultMock;
import org.skate.service.test.SkateAbstractServiceTest;

/**
 * @author Erik van Ingen
 * 
 */

public class SearchServiceImpl implements SearchService {

	private org.fao.fdr.core.services.SearchService svc;

	public SearchServiceImpl() {
		String endpoint = "http://dev.fdroa.net/api";
		String apiKey = "5b3cfd7e-196c-4f6f-b772-ada5a9efa5a5";
		svc = SearchServiceFactory.create(endpoint, apiKey);
	}

	@Override
	public PublicationSearchResult search(String searchTerm) {
		// svc.search(query, filterQueries, sort, start, rows, params)

		// String query = "text:fish*";
		String query = "text:" + searchTerm + "*";
		try {
			FdrSearchResult result = svc.search(query, // the query text using
														// the
														// SOLR Syntax (*:* to
														// obtain all the
														// documents)
					null, // optional additional filter queries (filter queries
							// are
							// usually the fastest way to filter out results)
					null, // optional sort criteria (only on single-field
							// values)
							// e.g.: "fdr_year desc, fdr_last_modified asc"
					0, // starting row
					2, // number of rows to fetch (max. 100)
					null // optional additional query parameters (for future
							// extensions)
					);

		} catch (SearchServiceException e) {
			throw new SkateException(e);
		}

		return SearchResultMock.get();

	}

	@Override
	public PublicationSearchResult advancedSearch(PublicationSearchRequest searchParameters) {
		return SearchResultMock.get(SkateAbstractServiceTest.ENTRIES_FOUND);
	}

	@Override
	public PublicationSearchResult extendedSearch(ExtendedPublicationSearchRequest searchParameters) {
		return SearchResultMock.get(SkateAbstractServiceTest.ENTRIES_FOUND);
	}

}
