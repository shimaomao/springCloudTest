package com.lim.test;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMethodCache(basePackages = "com.lim.test.jetcache")
@EnableCreateCacheAnnotation
public class TestJetcacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestJetcacheApplication.class, args);
    }

}
