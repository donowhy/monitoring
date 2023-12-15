package prometheus.tutorial.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import prometheus.tutorial.order.OrderService;
import prometheus.tutorial.order.v2.OrderConfigV2;
import prometheus.tutorial.order.v2.OrderServiceV2;

@Slf4j
@RestController
@RequiredArgsConstructor
public class LogController {

    private final OrderService orderService;

    @GetMapping("/log")
    public String log() {
        log.trace("trace Log");
        log.debug("debug log");
        log.info("info log");
        log.warn("warn log");
        log.error("error log");
        return "ok";
    }

    @GetMapping("/order")
    public String order() {
        orderService.order();
        return "ok";
    }

    @GetMapping("/cancel")
    public String cancel() {
        orderService.cancel();
        return "ok";
    }

}
