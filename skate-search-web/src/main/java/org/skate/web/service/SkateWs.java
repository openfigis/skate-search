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
import org.skate.service.request.ExtendedPublicationSearchRequest;
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
		r.setAuthors(authors);
		r.setPublicationYear(publicationYear);
		r.setSearchTerm(searchTerm);
		r.setSeriesTitle(seriesTitle);
		r.setWordInTitle(wordInTitle);
		return service.advancedSearch(language, r);
	}

	@GET
	@Path("extendedsearch")
	public PublicationSearchResult extendedSearch(@QueryParam("language") String language,
			@QueryParam("searchTerm") String searchTerm, @QueryParam("wordInTitle") String wordInTitle,
			@QueryParam("authors") String authors, @QueryParam("publicationYear") int publicationYear,
			@QueryParam("seriesTitle") String seriesTitle, @QueryParam("dataOwner") String dataOwner,
			@QueryParam("statutoryBody") String statutoryBody, @QueryParam("isbn") String isbn,
			@QueryParam("programmeName") String programmeName,
			@QueryParam("projectCodeNumber") String projectCodeNumber, @QueryParam("projectName") String projectName,
			@QueryParam("documentNumber") String documentNumber, @QueryParam("jobNumber") String jobNumber,
			@QueryParam("typeOfPublication") String typeOfPublication,
			@QueryParam("otherTypeOfPublication") String otherTypeOfPublication, @QueryParam("country") String country,
			@QueryParam("continent") String continent

	) {
		System.out.println("hitting SkateWs search ExtendedPublicationSearchRequest!!! with searchTerm:" + searchTerm);

		ExtendedPublicationSearchRequest r = new ExtendedPublicationSearchRequest();
		// advanced part
		r.setAuthors(authors);
		r.setPublicationYear(publicationYear);
		r.setSearchTerm(searchTerm);
		r.setSeriesTitle(seriesTitle);
		r.setWordInTitle(wordInTitle);

		// extended part
		r.setDataOwner(dataOwner);
		r.setStatutoryBody(statutoryBody);
		r.setIsbn(isbn);
		r.setProgrammeName(programmeName);
		r.setProjectCodeNumber(projectCodeNumber);
		r.setProjectName(projectName);
		r.setDocumentNumber(documentNumber);
		r.setJobNumber(jobNumber);
		r.setTypeOfPublication(typeOfPublication);
		r.setOtherTypeOfPublication(otherTypeOfPublication);
		r.setCountry(country);
		r.setContinent(continent);

		return service.extendedSearch(language, r);
	}

}