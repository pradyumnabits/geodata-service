package com.prady;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GeoDataApplicationTests {

	@Test
	void contextLoads() {
	}

	// Test class added ONLY to cover main() invocation not covered by application tests.
	@Test
	void applicationContextTest() {
		GeoDataApplication.main(new String[] {});
	}
}
