package org.skate.client;

import org.jglue.cdiunit.AdditionalClasses;
import org.jglue.cdiunit.CdiRunner;
import org.junit.runner.RunWith;
import org.skate.client.SearchClient;
import org.skate.service.test.SkateAbstractServiceTest;

/**
 * As configured now, this is an integration test.
 * 
 * 
 * @author Erik van Ingen
 * 
 */
@RunWith(CdiRunner.class)
@AdditionalClasses(SearchClient.class)
public class SkateClientGetTest extends SkateAbstractServiceTest {

}
