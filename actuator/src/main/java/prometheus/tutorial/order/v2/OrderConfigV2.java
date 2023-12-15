package prometheus.tutorial.order.v2;

import io.micrometer.core.aop.CountedAspect;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import prometheus.tutorial.order.OrderService;

@Configuration
public class OrderConfigV2 {

    @Bean
    public OrderService OrderService() {
        return new OrderServiceV2();
    }

    @Bean
    public CountedAspect countedAspect(MeterRegistry registry){
        return new CountedAspect(registry);
    }
}
