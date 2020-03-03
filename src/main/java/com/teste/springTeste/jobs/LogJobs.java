package com.teste.springTeste.jobs;

import com.teste.springTeste.endpoint.TestEndpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class LogJobs {
    Logger logger = LoggerFactory.getLogger(TestEndpoint.class);

    @Scheduled(cron = "1 0 * * * *")
    public void execute1() {
        logger.info("Log info cronjob 1");
    }

    @Scheduled(cron = "0 0 2 1/1 * ?")
    public void execute2() {
        logger.info("Log info cronjob 2");
    }

/*
    @Scheduled(cron = "* * * 1/1 * ?")
    public void execute3() {
        logger.info("Log info cronjob mathRand() = " + Math.random());
    }
*/
    @Scheduled(fixedDelay = 3000)
    public void execute3() {
        logger.info("Log info cronjob mathRand() = " + Math.random());
    }

}
