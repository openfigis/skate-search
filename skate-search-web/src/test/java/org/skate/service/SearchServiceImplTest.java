package org.skate.service;

import org.jglue.cdiunit.AdditionalClasses;
import org.jglue.cdiunit.CdiRunner;
import org.junit.runner.RunWith;
import org.skate.service.impl.SearchServiceImpl;
import org.skate.service.test.SkateAbstractServiceTest;

@RunWith(CdiRunner.class)
@AdditionalClasses(SearchServiceImpl.class)
public class SearchServiceImplTest extends SkateAbstractServiceTest {


}
