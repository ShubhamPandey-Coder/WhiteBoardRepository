package com.amdocs.mecbrowsertool.launcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages={"com.amdocs.mecbrowsertool.entity"})
@ComponentScan(basePackages={"com.amdocs.mecbrowsertool"})
public class MecBrowserToolApplication {

	public static void main(String[] args) {
		SpringApplication.run(MecBrowserToolApplication.class, args);
	}

}
