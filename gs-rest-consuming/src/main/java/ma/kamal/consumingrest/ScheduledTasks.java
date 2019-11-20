package ma.kamal.consumingrest;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    
    private static final List<Greeting> listGreeting = new ArrayList<>();

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));
        RestTemplate restTemplate = new RestTemplate();
        Greeting greeting = restTemplate.getForObject(
				"http://localhost:2022/greeting", Greeting.class);
        if(greeting != null) {
        	listGreeting.add(greeting);
    		log.info(greeting.toString());
        }

    }
    
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	public List<Greeting> getListGreeting(){
		return listGreeting;
	}
    
}
