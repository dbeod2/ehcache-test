package com.cache.test;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class StringAppendService {

    @Cacheable(value = "append-cache", key = "#key")
    public String getStringAppend(final String key) {
        System.out.println("append cache : " + key);
        return "hello string append " + key;
    }
}
