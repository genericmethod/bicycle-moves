package com.bicyclemoves.data.config;

import com.bicyclemoves.data.datafire.BicycleDataRequestScheduler;
import com.genericmethod.feedfire.config.DataFireSchedulerConfig;
import com.genericmethod.feedfire.request.DataFireRequestScheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.support.PeriodicTrigger;

@Configuration
public class BicycleDataSchedulingConfig extends DataFireSchedulerConfig {

    @Autowired
    BicycleDataRequestScheduler bicycleDataRequestScheduler;

    @Override
    public DataFireRequestScheduler myTask() {
        return bicycleDataRequestScheduler;
    }

    @Override
    public Trigger getTrigger() {
        return new PeriodicTrigger(10000);
    }
}
