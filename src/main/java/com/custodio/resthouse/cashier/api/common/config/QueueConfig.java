package com.custodio.resthouse.cashier.api.common.config;

import com.custodio.resthouse.cashier.api.outcome.model.Outcome;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

import java.util.Map;

@Configuration
public class QueueConfig
{
    @Bean
    public MessageConverter jacksonJmsMessageConverter()
    {
        final MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        converter.setTargetType(MessageType.TEXT);
        converter.setTypeIdPropertyName("_type");
        converter.setTypeIdMappings(Map.of("outcome", Outcome.class));
        return converter;
    }
}