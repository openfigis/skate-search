package org.skate.web.service;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.fao.fi.skate.search.PublicationSearchResult;
import org.skate.service.SearchService;
import org.skate.service.request.PublicationSearchRequest;

/**
 * 
 * @author Erik van Ingen
 * 
 */
@Path("")
@Singleton
@Produces(MediaType.APPLICATION_XML)
public class SkateWs {

	@Inject
	private SearchService service;

	@GET
	@Path("search")
	// @CrossOriginResourceSharing(allowAllOrigins = true)
	public PublicationSearchResult search(@QueryParam("language") String language,
			@QueryParam("searchTerm") String searchTerm) {
		System.out.println("hitting SkateWs search searchTerm!!! with params:" + language + searchTerm);

		return service.search(language, searchTerm);
	}

	@GET
	@Path("advancedsearch")
	public PublicationSearchResult advancedSearch(@QueryParam("language") String language,
			@QueryParam("searchTerm") String searchTerm, @QueryParam("wordsInTitle") String wordsInTitle,
			@QueryParam("author") String author, @QueryParam("year") int year, @QueryParam("series") String series,
			@QueryParam("owner") String owner, @QueryParam("statutoryBody") String statutoryBody,
			@QueryParam("isbn") String isbn, @QueryParam("programmeName") String programmeName,
			@QueryParam("projectName") String projectName, @QueryParam("documentNumber") String documentNumber,
			@QueryParam("jobNumber") String jobNumber, @QueryParam("publicationType") String publicationType,
			@QueryParam("country") String country, @QueryParam("continent") String continent

	) {
		System.out.println("hitting SkateWs search advancedSearchRequest!!! with searchTerm:" + language + searchTerm
				+ wordsInTitle + author + year + language + series + owner + statutoryBody + isbn + programmeName
				+ projectName + documentNumber + jobNumber + publicationType + country + continent);

		PublicationSearchRequest r = new PublicationSearchRequest();
		return service.advancedSearch(language, r);
	}

}