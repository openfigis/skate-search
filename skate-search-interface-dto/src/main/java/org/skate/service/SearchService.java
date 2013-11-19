/**
 * 
 */
package org.skate.service;

import org.skate.service.request.PublicationSearchRequest;
import org.skate.service.response.PublicationSearchResult;

/**
 * @author Erik van Ingen
 * 
 */
public interface SearchService {

	public PublicationSearchResult search(String searchTerm);

	public PublicationSearchResult search(PublicationSearchRequest searchParameters);

}
