package prometheus.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.web.exchanges.InMemoryHttpExchangeRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ActuatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActuatorApplication.class, args);
	}

	// 총 100 개의 http 요청을 저장할 수 있고, setCapacity() 를 통해 저장할 수 있는 용량 변경이 가능하다.
	// 근데, 이 기능은 제한도 많고 기능도 단순하여, 실제 운영 서비스에서는 모니터링 툴(프로메테우스 등)이나 핀포인트, Zipkin 같은 다른 기술 사용 추천
	@Bean
	public InMemoryHttpExchangeRepository httpExchangeRepository() {
		return new InMemoryHttpExchangeRepository();
	}
}

// 엑츄에이터는 많은 내부 정보를 보여주기 때문에, 외부 인터넷에서 접근이 불가능하게 막고, 내부에서만 접근 가능한 내부망을 사용하는 것이 안전하다.
