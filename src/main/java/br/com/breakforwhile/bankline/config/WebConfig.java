package br.com.breakforwhile.bankline.config;

import br.com.breakforwhile.bankline.converters.PlanoContaDTOToPlanoContaConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new PlanoContaDTOToPlanoContaConverter());
    }
}
