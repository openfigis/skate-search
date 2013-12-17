package org.fao.fi.skate.search;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.IgnoreTextAndAttributeValuesDifferenceListener;
import org.custommonkey.xmlunit.XMLTestCase;
import org.junit.Test;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class PublicationSearchResultTest extends XMLTestCase {

	File file = new File("src/test/resources/PublicationSearchResult.xml");

	// PublicationSearchResult expectedResult = null;

	java.lang.Class<PublicationSearchResult> clazz = PublicationSearchResult.class;

	/**
	 * Marshall is from java to XML, which we need for the project.
	 * 
	 * 
	 * @throws SAXException
	 * @throws IOException
	 * @throws JAXBException
	 */
	@Test
	public void testMarshall() throws SAXException, IOException, JAXBException {
		PublicationSearchResult expectedResult = prepareExpectedResult();

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		Writer out = new BufferedWriter(new OutputStreamWriter(outputStream));

		// set up JAXB marshalling context
		JAXBContext context = JAXBContext.newInstance(clazz);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		// this property works fine with jdk1.6.0_16
		marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new SkateSearchNamespacePrefixMapper());

		marshaller.marshal(expectedResult, out);

		// marshal to console - nice if you're looking
		marshaller.marshal(expectedResult, new BufferedWriter(new OutputStreamWriter(System.out)));

		// convert to InputSource for the comparison test
		InputSource marshallingResult = new InputSource(new ByteArrayInputStream(outputStream.toByteArray()));

		// get expected result from filesystem
		InputSource expectedResultFile = new InputSource(new FileInputStream(file));

		// comparison test
		Diff diff = new Diff(expectedResultFile, marshallingResult);
		diff.overrideDifferenceListener(new IgnoreTextAndAttributeValuesDifferenceListener());
		assertTrue("Marshalled Object matches expected XML " + diff, diff.similar());
	}

	/**
	 * Unmarshall is from xml to java. For the project we only need from java to
	 * xml.
	 * 
	 * @throws JAXBException
	 */
	public void testUnmarshall() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(clazz);
		Unmarshaller unmarshaller = context.createUnmarshaller();

		JaxbValidationEventHandler handler = new JaxbValidationEventHandler();
		unmarshaller.setEventHandler(handler);

		Object object = unmarshaller.unmarshal(file);
		if (!handler.getMessages().isEmpty()) {
			String errorMessage = "XML parse errors:";
			for (Object message : handler.getMessages()) {
				errorMessage += "\n" + message;
			}
			throw new JAXBException(errorMessage);
		}

		// test equality
		// Equality cannot be tested like this because the equals of the jaxb
		// objects cannot be changed. Therefore it
		// will be tested on not null
		// assertEquals("Unmarshalling object", expectedResult, object);
		assertNotNull(object);
	}

	/**
	 * preparing the expected result in the
	 */
	public PublicationSearchResult prepareExpectedResult() {
		ObjectFactory f = new ObjectFactory();

		// InfoLinkIconType l = f.createInfoLinkIconType();
		// l.setUrl("www.fao.org");
		// l.setLinkType(LinkType.PDF);

		PublicationEntryFoundType e = f.createPublicationEntryFoundType();
		e.setAuthor("Erik");
		// e.getInfoLinkIcons().add(l);

		PublicationSearchResult r = f.createPublicationSearchResult();
		r.getPublicationEntryFounds().add(e);

		return r;

	}
}
