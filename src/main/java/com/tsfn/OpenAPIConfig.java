/*
 * package com.tsfn;
 * 
 * import org.springframework.beans.factory.annotation.Value; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration;
 * 
 * import io.swagger.v3.oas.models.OpenAPI; import
 * io.swagger.v3.oas.models.info.Info; import
 * io.swagger.v3.oas.models.servers.Server;
 * 
 * @Configuration public class OpenAPIConfig {
 * 
 * @Value("${ayoub.openapi.dev-url}") private String devUrl;
 * 
 * @Bean public OpenAPI myOpenAPI() { Server devServer = new Server();
 * devServer.setUrl(devUrl);
 * devServer.setDescription("Server URL in Development environment");
 * 
 * Info info = new Info() .title("Tutorial Management API") .version("1.0")
 * .description("This API exposes endpoints to manage tutorials.")
 * .termsOfService("") // Add your terms of service URL here if applicable
 * .license(null); // Add your license information here if applicable
 * 
 * return new OpenAPI().info(info).addServersItem(devServer); } }
 */