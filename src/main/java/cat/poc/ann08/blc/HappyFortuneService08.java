package cat.poc.ann08.blc;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService08 implements FortuneService {

	public String getFortune() {
		return "Today is your lucky day!";
	}

}
