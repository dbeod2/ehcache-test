package com.cache.config;

import com.cache.test.StringAppendController;
import org.ehcache.event.CacheEvent;
import org.ehcache.event.CacheEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CacheEventLogger implements CacheEventListener<Object, Object> {
    private static final Logger log = LoggerFactory.getLogger(StringAppendController.class);

    public void onEvent(CacheEvent<?, ?> cacheEvent) {
        log.info("cache event logger message. getKey: {} / getOldValue: {} / getNewValue:{}",
                cacheEvent.getKey(), cacheEvent.getOldValue(), cacheEvent.getNewValue());
    }
}
