package com.bach.monitor.scheduled;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

@Configuration
public class QuartzConfiguration {
    @Autowired
    @Qualifier("Cron1")
    private CronTriggerFactoryBean cron1;

    @Bean
    public AutoWiringSpringBeanJobFactory autoWiringSpringBeanJobFactory(){
        return new AutoWiringSpringBeanJobFactory();
    }

    @Bean
    public SchedulerFactoryBean schedulerFactoryBean() {
        SchedulerFactoryBean scheduler = new SchedulerFactoryBean();
        scheduler.setJobFactory(autoWiringSpringBeanJobFactory());
        scheduler.setTriggers(cron1.getObject());
        return scheduler;
    }
}
