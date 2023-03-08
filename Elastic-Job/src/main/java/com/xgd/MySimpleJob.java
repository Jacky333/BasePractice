package com.xgd;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

/**
 * @author pengcheng
 * 作业类
 */
public class MySimpleJob implements SimpleJob {
    @Override
    public void execute(ShardingContext context) {
        //获取分片总数
        int shardingTotalCount = context.getShardingTotalCount();
        //获取分片项
        int shardingItem = context.getShardingItem();
        //获取分片项参数
        String shardingParameter = context.getShardingParameter();
        //作业名称
        String jobName = context.getJobName();

        System.out.println("分片总数：" + shardingTotalCount);
        System.out.println("分片项：" + shardingItem);
        System.out.println("分片项参数：" + shardingParameter);
        System.out.println("作业名称：" + jobName);

        //不同分片项进行不同处理
        switch (shardingItem){
            case 0:
                System.out.println("0物流分发至："+shardingParameter);
                break;
            case 1:
                System.out.println("1物流分发至：" + shardingParameter);
                break;
            case 2:
                System.out.println("2物流分发至：" + shardingParameter);
                break;
            case 3:
                System.out.println("3物流分发至：" + shardingParameter);
                break;
        }

    }
}
