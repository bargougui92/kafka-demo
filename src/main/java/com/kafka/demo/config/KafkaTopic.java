package com.kafka.demo.config;

import com.kafka.demo.ServiceConfigurationProperties;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopic {
    private final String topicName;

    public KafkaTopic(final ServiceConfigurationProperties appProperties) {
        topicName = appProperties.getTopic().getName();
    }

    @Bean
    public NewTopic bargouguiTopic() {
        return TopicBuilder.name(this.topicName).build();
    }
}
