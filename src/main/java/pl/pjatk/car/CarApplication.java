package pl.pjatk.car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarApplication.class, args);
		print();
	}

	public static void print() {
		String value = null;
		Car honda = new Car("honda", "civic",  "red",  2005, 4);
		System.out.println(honda);
	}
}

