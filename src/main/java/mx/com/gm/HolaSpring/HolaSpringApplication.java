package mx.com.gm.HolaSpring;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class HolaSpringApplication  implements CommandLineRunner {



	public static void main(String[] args) {
		SpringApplication.run(HolaSpringApplication.class, args);
	}



	@Override
	public void run(String... args) throws Exception {

	}
}
