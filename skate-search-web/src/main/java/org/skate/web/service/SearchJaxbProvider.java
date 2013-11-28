package org.skate.web.service;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.fao.fi.skate.search.PublicationSearchResult;

@Provider
public class SearchJaxbProvider implements ContextResolver<JAXBContext> {
	private JAXBContext context = null;

	public JAXBContext getContext(Class<?> type) {
		if (type != PublicationSearchResult.class)
			return null; // we don't support nothing else than Planet

		if (context == null) {
			try {
				context = JAXBContext.newInstance(PublicationSearchResult.class);
			} catch (JAXBException e) {
				// log warning/error; null will be returned which indicates that
				// this
				// provider won't/can't be used.
			}
		}
		return context;
	}
}