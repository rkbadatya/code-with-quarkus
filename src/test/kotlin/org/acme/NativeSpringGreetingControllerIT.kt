package org.acme

import io.quarkus.test.junit.NativeImageTest

@NativeImageTest
class NativeSpringGreetingControllerIT : SpringGreetingControllerTest()