/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package net.javalin.login;


import io.javalin.Javalin;
import io.javalin.plugin.openapi.OpenApiOptions;

import io.javalin.plugin.openapi.OpenApiPlugin;
import io.javalin.plugin.openapi.ui.ReDocOptions;
import io.javalin.plugin.openapi.ui.SwaggerOptions;
import io.swagger.v3.oas.models.info.Info;

/**
 *
 * @author User
 */
public class Login {

    public static void main(String[] args) {
       
       Javalin app = Javalin.create( config ->{
               config.registerPlugin(getConfiguredOpenApiPlugin());
               config.defaultContentType = "application/json";
               config.enableWebjars(); }).start(7010);
       
        new Router(app);   
    }
    private static OpenApiPlugin getConfiguredOpenApiPlugin() {
        Info info = new Info().version("1.0").description("User API");
        OpenApiOptions options = new OpenApiOptions(info)
                .activateAnnotationScanningFor("io.javalin.example.java")
                .path("/swagger-docs") // endpoint for OpenAPI json
                .swagger(new SwaggerOptions("/swagger-ui")) // endpoint for swagger-ui
                .reDoc(new ReDocOptions("/redoc")) // endpoint for redoc
               ;
        return new OpenApiPlugin(options);
    }

}
