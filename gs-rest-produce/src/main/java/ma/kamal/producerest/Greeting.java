package ma.kamal.producerest;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Greeting {

    private  long id;
    private  String content;
    private  String from;
    private  LocalDate birthDay;
    
    
    
    public Greeting() {
	}

	public Greeting(long id,  String from, String content) {
    	
        this.from = from;
		this.id = id;
        this.content = content;
        this.birthDay = LocalDate.now();
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    
	public String getFrom() {
		return from;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}
    
}
