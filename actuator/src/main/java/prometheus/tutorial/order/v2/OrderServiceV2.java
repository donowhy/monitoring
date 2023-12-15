package prometheus.tutorial.order.v2;

import io.micrometer.core.annotation.Counted;
import io.micrometer.core.instrument.MeterRegistry;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import prometheus.tutorial.order.OrderService;

import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
@RequiredArgsConstructor
public class OrderServiceV2 implements OrderService {

    private AtomicInteger stock = new AtomicInteger(100);
    @Override
    @Counted("my.order")
    public void order() {
        log.info("주문");
        stock.decrementAndGet();
    }

    @Override
    @Counted("my.order")
    public void cancel() {
        log.info("주문취소");
        stock.incrementAndGet();
    }

    @Override
    public AtomicInteger getStock() {
        return null;
    }
}
