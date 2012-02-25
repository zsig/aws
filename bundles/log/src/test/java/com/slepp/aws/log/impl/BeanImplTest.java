package com.slepp.aws.log.impl;

import junit.framework.TestCase;
import com.slepp.aws.log.Bean;

public class BeanImplTest extends TestCase {

    public void testBeanIsABean() {
	Bean aBean = new BeanImpl();
        assertTrue(aBean.isABean());
    }

}