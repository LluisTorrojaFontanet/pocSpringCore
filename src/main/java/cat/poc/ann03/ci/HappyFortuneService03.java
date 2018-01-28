package cat.poc.ann03.ci;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService03 implements FortuneService {

	public String getFortune() {
		return "Today is your lucky day!";
	}

}
