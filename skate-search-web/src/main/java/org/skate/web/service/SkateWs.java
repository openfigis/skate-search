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
		System.out.println("hitting SkateWs search searchTerm!!! with searchTerm:" + searchTerm);

		return service.search(language, searchTerm);
	}

	@GET
	@Path("advancedsearch")
	public PublicationSearchResult advancedSearch(@QueryParam("language") String language,
			@QueryParam("searchTerm") String searchTerm, @QueryParam("wordInTitle") String wordInTitle,
			@QueryParam("authors") String authors, @QueryParam("publicationYear") int publicationYear,
			@QueryParam("seriesTitle") String seriesTitle

	) {
		System.out.println("hitting SkateWs search advancedSearchRequest!!! with searchTerm:" + searchTerm);

		PublicationSearchRequest r = new PublicationSearchRequest();
		r.setAuthor(authors);
		r.setYear(publicationYear);
		r.setSearchTerm(searchTerm);
		r.setSeries(seriesTitle);
		r.setWordsInTitle(wordInTitle);
		return service.advancedSearch(language, r);
	}

}