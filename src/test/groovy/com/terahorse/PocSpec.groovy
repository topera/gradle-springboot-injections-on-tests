/*
 * Copyright (c) 2017 - Terahorse
 */

package com.terahorse

import com.terahorse.poc.Parent
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import spock.lang.Specification

@RunWith(SpringRunner)
@SpringBootTest(classes=Module)
class PocSpec extends Specification {

    @Autowired
    Parent parent

    @Test
    def "poc"() {
        expect:
        parent.getChild() != null
    }

}
