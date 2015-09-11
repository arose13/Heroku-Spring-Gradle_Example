package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Anthony on 9/10/2015.
 * I just added a new class to be JSONed out!
 */
@RestController
public class MasterController {

    private static final String template = "Hallo %s";
    private static final AtomicLong counter = new AtomicLong();

    @RequestMapping("/test")
    public Test greeting(@RequestParam(value = "q", defaultValue = "welt!") String name) {
        return new Test(counter.incrementAndGet(), String.format(template, name));
    }

    @RequestMapping("/api")
    public CustomResult companyInfo(@RequestParam(value = "s", defaultValue = "^ixic") String symbol) {
        return new CustomResult(symbol);
    }

}
