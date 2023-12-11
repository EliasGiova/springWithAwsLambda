package com.spring.aws.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Configuration
public class AwsLambdaConfig {

    @Bean(name = "Saludar")
    public Supplier<String> geeting(){ //funcion lambda que no recibe parametros pero si devuelve un valor Metodo GET
        return () -> "Hello world";
    }

    @Bean
    public Consumer<String> printParam(){ //Metodo POST
        return (param) -> System.out.println(param);
    }

    @Bean
    public Function<String, String> receiveParam(){
        return (param) ->  param.toUpperCase();
    }


}
