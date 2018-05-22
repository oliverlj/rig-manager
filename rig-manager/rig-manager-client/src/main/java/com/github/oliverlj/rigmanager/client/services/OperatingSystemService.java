package com.github.oliverlj.rigmanager.client.services;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.springframework.stereotype.Component;

import com.github.oliverlj.rigmanager.client.enums.OperatingSystem;

/**
 * service for operating system.
 * @author Olivier LE JACQUES
 *
 */
@Component
public class OperatingSystemService {
	
	private static final Collection<OperatingSystem> SUPPORTED_OPERATING_SYSTEM = Collections.unmodifiableList(Arrays.asList(OperatingSystem.LINUX));
	
	public void testCurrentOperatingSystemIsSupported() {
		OperatingSystem currentOperatingSystem = OperatingSystem.getCurrentOperatingSystem();
		if (!SUPPORTED_OPERATING_SYSTEM.contains(currentOperatingSystem)) {
			throw new IllegalStateException("Only " + SUPPORTED_OPERATING_SYSTEM + " is supported");
		}
	}
	
	public String getName() {
		throw new UnsupportedOperationException("Not implemented");
	}

}
