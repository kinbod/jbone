package cn.jbone.i;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableDiscoveryClient
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class JboneIAdminApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(JboneIAdminApplication.class).banner(new JboneIAdminBanner()).run(args);
    }
}
