package indigo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The main class for the SpringBootApplication containing the main method. This
 * is also the template class for the bean's
 */
@RestController
@SpringBootApplication
public class IndigoApplication implements CommandLineRunner {

	/**
	 * The main method to run the SpringBootApplication
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(IndigoApplication.class, args);
	}

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	/**
	 * @return {@link JavaMailSender} bean object that can be injected
	 */
//	@Bean
//	public JavaMailSender getJavaMailSender() {
//		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//
//		mailSender.setHost("smtp.gmail.com");
//		mailSender.setPort(587);
//
//		mailSender.setUsername("sample.rfp2@gmail.com");
//		mailSender.setPassword("rfp123!@#");
//
//		Properties props = mailSender.getJavaMailProperties();
//		props.put("mail.transport.protocol", "smtp");
//		props.put("mail.smtp.auth", "true");
//		props.put("mail.smtp.starttls.enable", "true");
//		props.put("mail.debug", "true");
//
//		return mailSender;
//	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	}

}
