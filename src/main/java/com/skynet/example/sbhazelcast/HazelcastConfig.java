package com.skynet.example.sbhazelcast;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.spring.cache.HazelcastCacheManager;

@Configuration
@EnableCaching
public class HazelcastConfig {

    @Bean
    HazelcastCacheManager hazelcastcacheManager() throws Exception {
        return new HazelcastCacheManager(hazelcastInstance());
    }

    @Bean
    HazelcastInstance hazelcastInstance() throws Exception {
        return Hazelcast.newHazelcastInstance();
    }	
}
