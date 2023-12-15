package prometheus.tutorial.order.v3;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import prometheus.tutorial.order.OrderService;

@Configuration
public class OrderConfigV3 {

    @Bean
    OrderService orderService(MeterRegistry registry) {
        return new OrderServiceV3(registry);
    }
}
