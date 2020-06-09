package com.example.demo23;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@SpringBootTest(webEnvironment = NONE)
@ActiveProfiles("test, backend")
class ActiveProfilesTestBackendTest {

	@Value("${myapplicationvalue}")
	String myapplicationvalue;

	@Value("${mybackendvalue}")
	String mybackendvalue;

	@Test
	void contextLoads() {
		Assertions.assertThat(mybackendvalue).isEqualTo("mybackendvalueTEST");
		Assertions.assertThat(myapplicationvalue).isEqualTo("myapplicationvalueTEST");
	}

}
