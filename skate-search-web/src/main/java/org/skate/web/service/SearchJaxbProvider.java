package org.skate.web.service;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.fao.fi.skate.search.SkateSearchNamespacePrefixMapper;

@Provider
public class SearchJaxbProvider implements ContextResolver<JAXBContext> {
	private JAXBContext context = null;

	// @Override
	// public JAXBContext getContext(Class<?> type) {
	// throw new RuntimeException();
	// // return null;
	// }

	public JAXBContext getContext(Class<?> type) {
		if (type != SearchJaxbProvider.class)
			return null; // we don't support nothing else than Planet

		if (context == null) {
			try {
				context = JAXBContext.newInstance(SearchJaxbProvider.class);

				context.createBinder().setProperty("com.sun.xml.bind.namespacePrefixMapper",
						new SkateSearchNamespacePrefixMapper());

				// Marshaller marshaller = context.createMarshaller();
				// marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
				// Boolean.TRUE);
				// // this property works fine with jdk1.6.0_16
				// marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper",
				// new SkateSearchNamespacePrefixMapper());

			} catch (JAXBException e) {
				// log warning/error; null will be returned which indicates that
				// this
				// provider won't/can't be used.
			}
		}
		return context;
	}
}