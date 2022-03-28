package com.kafka.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@ConfigurationProperties(prefix = "app")
@Configuration
@EnableConfigurationProperties
@Data
@Generated
@Accessors
@AllArgsConstructor
public class ServiceConfigurationProperties {
    private @Valid Topic topic;
    private @NotNull String kafkaBootStrapServers;

    @Data
    public static class Topic {
       private @NotNull String name;
    }
}
