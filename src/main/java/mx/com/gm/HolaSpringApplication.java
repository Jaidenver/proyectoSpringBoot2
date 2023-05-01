package mx.com.gm.HolaSpring;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

import java.util.logging.Logger;


@SpringBootApplication
@ComponentScan(basePackages = {"mx.com.gm.HolaSpring", "mx.com.gm.dao"})
public class HolaSpringApplication{


	ControladorInicio controladorInicio;




	public static void main(String[] args) {
		SpringApplication.run(HolaSpringApplication.class, args);
	}



}
