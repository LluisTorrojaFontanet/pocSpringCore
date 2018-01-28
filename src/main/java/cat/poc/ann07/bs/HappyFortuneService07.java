package cat.poc.ann07.bs;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService07 implements FortuneService {

	public String getFortune() {
		return "Today is your lucky day!";
	}

}
