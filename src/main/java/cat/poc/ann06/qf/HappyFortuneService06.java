package cat.poc.ann06.qf;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService06 implements FortuneService {

	public String getFortune() {
		return "Today is your lucky day!";
	}

}
