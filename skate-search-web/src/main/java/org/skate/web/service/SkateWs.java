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
public class SkateWs {

	@Inject
	private SearchService service;

	@GET
	@Path("search")
	@Produces({ MediaType.APPLICATION_XML })
	// @CrossOriginResourceSharing(allowAllOrigins = true)
	public PublicationSearchResult search(@QueryParam("searchTerm") String searchTerm) {
		System.out.println("hitting SkateWs search searchTerm!!! with searchTerm:" + searchTerm);

		return service.search(searchTerm);
	}

	@GET
	@Path("advancedsearch")
	@Produces({ MediaType.APPLICATION_XML })
	public PublicationSearchResult advancedSearch(@QueryParam("searchTerm") String searchTerm,
			@QueryParam("wordInTitle") String wordInTitle, @QueryParam("authors") String authors,
			@QueryParam("publicationYear") int publicationYear, @QueryParam("language") String language,
			@QueryParam("seriesTitle") String seriesTitle

	) {
		System.out.println("hitting SkateWs search advancedSearchRequest!!! with searchTerm:" + searchTerm);

		PublicationSearchRequest r = new PublicationSearchRequest();
		r.setAuthors(authors);
		r.setLanguage(language);
		r.setPublicationYear(publicationYear);
		r.setSearchTerm(searchTerm);
		r.setSeriesTitle(seriesTitle);
		r.setWordInTitle(wordInTitle);
		return service.search(r);
	}

}