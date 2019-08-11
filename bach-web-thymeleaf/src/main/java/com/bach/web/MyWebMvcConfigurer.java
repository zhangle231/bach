package com.bach.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import sun.util.locale.LocaleUtils;

import java.util.Locale;

@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {
    @Autowired
    private MessageSource messageSource;

    /**
     * 自动转换时间格式
     *
     * @param registry date
     */
    @Override
    public void addFormatters(FormatterRegistry registry) {
//        messageSource.
        Locale locale = LocaleContextHolder.getLocale();
        final String format = this.messageSource.getMessage("date.format", null, locale);
        registry.addFormatter(new DateFormatter(format));
    }
}
