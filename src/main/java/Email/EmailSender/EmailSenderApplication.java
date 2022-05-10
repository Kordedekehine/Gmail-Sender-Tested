package Email.EmailSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailSenderApplication {
@Autowired
	private EmailSenderService senderService;

	public static void main(String[] args) {
		SpringApplication.run(EmailSenderApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerEmail(){

		senderService.sendSimpleEmail("bankolebrowne@gmail.com","Korede is sending this to you" +
						" FROM INTELLI J",
				"Testing Gmail sender");

//		senderService.sendEmailWithAttachment("faithkola450@gmail.com","Check out this picture"
//		,"From Korede",);
	}
}
