package id.my.agungdh.nikahbe.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {
    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @GetMapping
    public String hello() {
        Thread t = Thread.currentThread();
        log.info(">> Current thread: {} (class={})", t, t.getClass());
        return t.toString();
    }
}
