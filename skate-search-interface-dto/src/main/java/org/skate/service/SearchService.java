/**
 * 
 */
package org.skate.service;

import org.fao.fi.skate.search.PublicationSearchResult;
import org.skate.service.request.PublicationSearchRequest;

/**
 * @author Erik van Ingen
 * 
 */
public interface SearchService {

	public PublicationSearchResult search(String searchTerm);

	public PublicationSearchResult search(PublicationSearchRequest searchParameters);

}
