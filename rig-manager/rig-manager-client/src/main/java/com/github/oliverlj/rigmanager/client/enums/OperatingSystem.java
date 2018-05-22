package com.github.oliverlj.rigmanager.client.enums;

/**
 * Enumeration of operating systems.
 * 
 * @author Olivier LE JACQUES
 *
 */
public enum OperatingSystem {

	LINUX, UNKNOWN;

	public static OperatingSystem getCurrentOperatingSystem() {
		String os = System.getProperty("os.name").toLowerCase();
		if (os.contains("linux")) {
			return LINUX;
		}
		return null;
	}

}
