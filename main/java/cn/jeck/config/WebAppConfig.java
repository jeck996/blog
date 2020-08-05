package cn.jeck.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebAppConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/404").setViewName("notFound");
//        registry.addViewController("/404").setViewName("notFound");
        registry.addViewController("/404").setViewName("404");
        registry.addViewController("/about").setViewName("about");
        registry.addViewController("/xc").setViewName("xc");
        registry.addViewController("/shuo").setViewName("shuo");
    }
}
