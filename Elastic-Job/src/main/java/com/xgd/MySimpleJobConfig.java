package com.xgd;

import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.dangdang.ddframe.job.config.JobCoreConfiguration;
import com.dangdang.ddframe.job.config.simple.SimpleJobConfiguration;
import com.dangdang.ddframe.job.lite.api.JobScheduler;
import com.dangdang.ddframe.job.lite.config.LiteJobConfiguration;
import com.dangdang.ddframe.job.lite.spring.api.SpringJobScheduler;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author pengcheng
 * 任务配置类
 */
@Configuration
public class MySimpleJobConfig {
    @Autowired
    private ZookeeperRegistryCenter zookeeperRegistryCenter;

    @Bean
    public SimpleJob simpleJob(){
        return new MySimpleJob();
    }

    @Bean(initMethod = "init")
    public JobScheduler simpleJobScheduler(final SimpleJob simpleJob){
        return new SpringJobScheduler(simpleJob, zookeeperRegistryCenter,createSimpleJobConfiguration());
    }

    private static LiteJobConfiguration createSimpleJobConfiguration(){
        // 定义作业核心配置
        JobCoreConfiguration simpleCoreConfig  = JobCoreConfiguration.newBuilder("SimpleJobDemo", "0/5 * * * * ?", 4)
                .shardingItemParameters("0=北京,1=上海,2=广州,3=深圳").build();
        // 定义SIMPLE类型配置
        SimpleJobConfiguration simpleJobConfiguration = new SimpleJobConfiguration(simpleCoreConfig, MySimpleJob.class.getCanonicalName());
        // 定义Lite作业根配置
        LiteJobConfiguration simpleJobRootConfig  = LiteJobConfiguration.newBuilder(simpleJobConfiguration).build();

        return simpleJobRootConfig;
    }
}
