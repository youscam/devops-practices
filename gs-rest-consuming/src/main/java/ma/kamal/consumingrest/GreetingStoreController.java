package ma.kamal.consumingrest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingStoreController {

	@Autowired
	ScheduledTasks scheduledTasks;
	
	@RequestMapping("/getAllgreeting")
	public List<Greeting> greeting() {
		return scheduledTasks.getListGreeting();
	}
}
