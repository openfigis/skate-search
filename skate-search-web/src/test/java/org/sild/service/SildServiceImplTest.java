package org.skate.service;

import org.skate.service.impl.SkateServiceImpl;
import org.skate.service.test.SkateAbstractServiceTest;
import org.jglue.cdiunit.AdditionalClasses;
import org.jglue.cdiunit.CdiRunner;
import org.junit.runner.RunWith;

@RunWith(CdiRunner.class)
@AdditionalClasses(SkateServiceImpl.class)
public class SkateServiceImplTest extends SkateAbstractServiceTest {


}
