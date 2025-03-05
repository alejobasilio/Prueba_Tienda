package com.alejobasilio.pruba_tienda.presentation.config;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

class PresentationExceptionTest {

	private PresentationException presentationException;
	private PresentationException presentationException1;
	
	@BeforeEach
	void setUp() {
		presentationException = new PresentationException("Prueba Test", HttpStatus.BAD_REQUEST);
		presentationException1 = new PresentationException("Prueba Test", 404);
	}
	
	@Test
	void testGettersAndSetters() {
		assertEquals(HttpStatus.BAD_REQUEST, presentationException.getHttpStatus());
		}
	}
