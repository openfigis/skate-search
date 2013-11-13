/**
 * 
 */
package org.skate.service;

import org.skate.service.request.AdvancedSearchRequest;
import org.skate.service.response.SearchResult;

/**
 * @author Erik van Ingen
 * 
 */
public interface SearchService {

	public SearchResult search(String searchTerm);

	public SearchResult search(AdvancedSearchRequest searchParameters);

}
