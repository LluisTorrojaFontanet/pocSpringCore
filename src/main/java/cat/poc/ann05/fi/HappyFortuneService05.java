package cat.poc.ann05.fi;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService05 implements FortuneService {

	public String getFortune() {
		return "Today is your lucky day!";
	}

}
