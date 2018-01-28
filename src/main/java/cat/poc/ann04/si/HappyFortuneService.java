package cat.poc.ann04.si;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService04 {

	public String getFortune() {
		return "Today is your lucky day!";
	}

}
