package com.sample.app;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.core.StandardThreadExecutor;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

/**
 * SpringBoot entry point application
 *
 * Created by facarvalho on 12/7/15.
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    private static final String TOMCAT_VI_THREAD_POOL_DOMAIN = "Tomcat";
    private static final String TOMCAT_VI_THREAD_POOL_NAME = "AppThreadPool";
    private static final String TOMCAT_VI_THREAD_POOL_NAME_PREFIX = "AppThreadPool-";

    @Bean
    public EmbeddedServletContainerCustomizer servletContainer() {
        return (ConfigurableEmbeddedServletContainer container) -> {
            ((TomcatEmbeddedServletContainerFactory) container).addConnectorCustomizers(new TomcatConnectorCustomizer() {
                @Override
                public void customize(Connector connector) {
                    StandardThreadExecutor executor = new StandardThreadExecutor();
                    executor.setDomain(TOMCAT_VI_THREAD_POOL_DOMAIN);
                    executor.setName(TOMCAT_VI_THREAD_POOL_NAME);
                    executor.setNamePrefix(TOMCAT_VI_THREAD_POOL_NAME_PREFIX);
                    executor.setMinSpareThreads(25);
                    executor.setMaxThreads(40);
                    Http11NioProtocol protocolHandler = (Http11NioProtocol) connector.getProtocolHandler();
                    protocolHandler.setExecutor(executor);
                    try {
                        executor.start();
                    } catch (LifecycleException e) {
                        logger.error(e);
                    }
                }
            });
        };
    }

}
