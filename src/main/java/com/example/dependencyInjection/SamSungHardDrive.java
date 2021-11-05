package com.example.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class SamSungHardDrive  implements HardDrive {
	public void testHD() {
		System.out.print("SamSungHardDrive");
		
	}
}
