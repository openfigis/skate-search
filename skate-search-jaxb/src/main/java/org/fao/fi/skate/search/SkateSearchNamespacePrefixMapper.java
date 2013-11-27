package org.fao.fi.skate.search;

import java.util.HashMap;
import java.util.Map;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

public class SkateSearchNamespacePrefixMapper extends NamespacePrefixMapper {

	private static Map<String, String> prefixMap = new HashMap<String, String>();
	static {
		prefixMap.put("http://www.fao.org/fi/skate/search/", "search");
		prefixMap.put("http://www.w3.org/2001/xmlschema-instance", "xsi");
		prefixMap.put("http://www.w3.org/xml/1998/namespace", "xmlns");
		prefixMap.put("http://www.w3.org/2001/xmlschema", "xs");

	}

	@Override
	public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
		// System.out.println(namespaceUri);
		// System.out.println(requirePrefix);
		String namespaceUriLowerCase = namespaceUri.toLowerCase();
		String prefix = prefixMap.get(namespaceUriLowerCase);
		return prefix;
	}
}
