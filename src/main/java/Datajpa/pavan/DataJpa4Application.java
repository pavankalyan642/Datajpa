package Datajpa.pavan;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import Datajpa.pavan.service.VechileService;

@SpringBootApplication
public class DataJpa4Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DataJpa4Application.class, args);
		VechileService vechileservice=context.getBean(VechileService.class);
	/*	vechileservice.saveVechile();
		vechileservice.saveEmps();
		vechileservice.getEmp(2);
		vechileservice.getEmps(Arrays.asList(1,2,3)); */
		//vechileservice.getem();
		// vechileservice.checkVechile_Id(2);
		//vechileservice.callFindByMethods();
		vechileservice.checkVechile_Id(3);
		
		
		
		
	}

}
