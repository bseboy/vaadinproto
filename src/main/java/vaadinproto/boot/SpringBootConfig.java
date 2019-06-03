package vaadinproto.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.vaadin.flow.spring.annotation.EnableVaadin;

@EnableVaadin(value = "vaadinproto.flow")
@SpringBootApplication
public class SpringBootConfig extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootConfig.class, args);
    }
}
