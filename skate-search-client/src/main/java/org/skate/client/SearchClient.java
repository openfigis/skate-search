package org.skate.client;

import javax.ws.rs.core.MediaType;

import org.fao.fi.skate.search.PublicationSearchResult;
import org.skate.service.SearchService;
import org.skate.service.request.ExtendedPublicationSearchRequest;
import org.skate.service.request.PublicationSearchRequest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

/**
 * 
 * @author Erik van Ingen
 * 
 */
public class SearchClient implements SearchService {

	/**
	 * TODO make this configurable
	 */
	// private static String SERVER =
	// "http://hqldvfigis1:6747/skate-search-web/";
	private static String SERVER = "http://localhost:8081/skate-search-web/";

	private static String SEARCH = SERVER + "rest/search";
	private static String ADVANCED_SEARCH = SERVER + "rest/advancedsearch";

	private static String SEARCH_TERM = "searchTerm";
	private static String WORDINTITLE = "wordInTitle";
	private static String AUTHORS = "authors";
	private static String PUBLICATIONYEAR = "publicationYear";
	private static String LANGUAGE = "language";
	private static String SERIESTITLE = "seriesTitle";

	@Override
	public PublicationSearchResult search(String searchTerm) {

		ClientResponse response = getWebResource(SEARCH).queryParam(SEARCH_TERM, searchTerm)
				.accept(MediaType.APPLICATION_XML).get(ClientResponse.class);
		evaluateResponse(response);
		return response.getEntity(PublicationSearchResult.class);

	}

	@Override
	public PublicationSearchResult advancedSearch(PublicationSearchRequest sp) {
		WebResource wr = getWebResource(ADVANCED_SEARCH).queryParam(SEARCH_TERM, sp.getSearchTerm())
				.queryParam(WORDINTITLE, sp.getWordInTitle()).queryParam(AUTHORS, sp.getAuthors())
				.queryParam(PUBLICATIONYEAR, Integer.toString(sp.getPublicationYear()))
				.queryParam(LANGUAGE, sp.getLanguage()).queryParam(SERIESTITLE, sp.getSeriesTitle());
		ClientResponse response = wr.accept(MediaType.APPLICATION_XML).get(ClientResponse.class);
		evaluateResponse(response);
		return response.getEntity(PublicationSearchResult.class);
	}

	@Override
	public PublicationSearchResult extendedSearch(ExtendedPublicationSearchRequest sp) {
		WebResource wr = getWebResource(ADVANCED_SEARCH).queryParam(SEARCH_TERM, sp.getSearchTerm())
				.queryParam(WORDINTITLE, sp.getWordInTitle()).queryParam(AUTHORS, sp.getAuthors())
				.queryParam(PUBLICATIONYEAR, Integer.toString(sp.getPublicationYear()))
				.queryParam(LANGUAGE, sp.getLanguage()).queryParam(SERIESTITLE, sp.getSeriesTitle());
		ClientResponse response = wr.accept(MediaType.APPLICATION_XML).get(ClientResponse.class);
		evaluateResponse(response);
		return response.getEntity(PublicationSearchResult.class);
	}

	private WebResource getWebResource(String server) {
		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		return Client.create(clientConfig).resource(server);
	}

	private void evaluateResponse(ClientResponse response) {
		if (response.getStatus() != 200) {
			throw new ClientException("Failed : HTTP error code : " + response.getStatus());
		}
	}

}
