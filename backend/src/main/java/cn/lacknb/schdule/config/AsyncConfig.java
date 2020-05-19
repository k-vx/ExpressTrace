package cn.lacknb.schdule.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * ClassName: AsyncConfig <br/>
 * Description:  <br/>
 * date: 2020年02月29日 19:25 <br/>
 *
 * @author nianshao <br/>
 */
@Configuration
@EnableAsync // 开启异步事件的支持( 在定时任务的类或者方法上添加@Async)
public class AsyncConfig {

    @Value("6")
    private int corePoolSize;

    @Value("12")
    private int maxPoolSize;

    @Value("13")
    private int queueCapacity;

    @Bean
    public Executor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(corePoolSize);
        executor.setMaxPoolSize(maxPoolSize);
        executor.setQueueCapacity(queueCapacity);
        executor.initialize();
        return executor;
    }

}
