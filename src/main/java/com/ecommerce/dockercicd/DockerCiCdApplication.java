package com.ecommerce.dockercicd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerCiCdApplication {

    private static final Logger log = LoggerFactory.getLogger(DockerCiCdApplication.class);

    @GetMapping("/hello")
    public String hello() {
        log.info("Received request for /hello endpoint");
        return "Hello, Docker!";

    }

    @GetMapping("/docker")
    public String docker() {
        log.info("Received request for /docker endpoint");
        return "Hello, Docker! From Docker Demo App";

    }

    @GetMapping("/test")
    public String test() {
        log.info("Received request for /test endpoint");
        return "Hello, Docker! From  tes App";

    }

    @GetMapping("/version")
    public String version() {
        log.info("Received request for /test endpoint");
        return "Hello, Docker! From  tes App";

    }

    @GetMapping("/new-api")
    public String newApi() {
        log.info("Received request for /new Api endpoint");
        return "Hello, Docker! From new api App";

    }




    public static void main(String[] args) {
        SpringApplication.run(DockerCiCdApplication.class, args);
    }

}
