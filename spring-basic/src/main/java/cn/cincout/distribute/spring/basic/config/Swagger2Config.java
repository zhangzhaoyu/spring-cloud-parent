package cn.cincout.distribute.spring.basic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by zhaoyu on 18-7-16.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket createRESTFulApi(ApiInfo apiInfo) {
        return new Docket(DocumentationType.SWAGGER_2)
                // .host(docHost)
                .apiInfo(apiInfo)
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.cincout.distribute.spring.basic.web"))
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("pancloud monitor tx-report api document")
                //.description("http://" + docHost + "/monitorbase")
                //.termsOfServiceUrl("http://" + docHost + "/tx")
                .contact(new Contact("zhangzhaoyu", null, "zhangzhaoyu@163.com"))
                .version("1.0")
                .build();
    }

}
