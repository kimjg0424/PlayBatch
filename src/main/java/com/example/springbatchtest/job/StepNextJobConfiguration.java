package com.example.springbatchtest.job;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@RequiredArgsConstructor
public class StepNextJobConfiguration {

private final  JobBuilderFactory jobBuilderFactory;

private final StepBuilderFactory stepBuilderFactory;


    @Bean
    public Job stepNextJob(){
    return jobBuilderFactory.get("stepNExtJob")
            .start(step1())
            .next(step2())
            .next(step3())
            .build();
    }

    private Step step1() {
        return null;
    }

    private Step step2() {
        return null;
    }

    private Step step3() {
        return null;
    }


}
