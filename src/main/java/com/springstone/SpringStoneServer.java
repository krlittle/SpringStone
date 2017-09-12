package com.springstone;

import org.springframework.boot.builder.SpringApplicationBuilder;

public class SpringStoneServer extends SpringStoneApp {
    public static void main(String[] args) {
        new SpringStoneApp().configure(new SpringApplicationBuilder()).profiles("secret").run(args);
    }
}
