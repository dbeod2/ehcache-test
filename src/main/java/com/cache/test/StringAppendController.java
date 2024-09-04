package com.cache.test;

import org.ehcache.core.spi.service.ServiceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/strings/appends")
public class StringAppendController {

    private static final Logger log = LoggerFactory.getLogger(StringAppendController.class);

    private final StringAppendService stringAppendService;

    public StringAppendController(StringAppendService stringAppendService) {
        this.stringAppendService = stringAppendService;
    }

    @GetMapping("/values/{key}")
    public String append(@PathVariable String key) {
        log.info("call stringAppendService with key {}", key);
        return stringAppendService.getStringAppend(key);
    }
}
