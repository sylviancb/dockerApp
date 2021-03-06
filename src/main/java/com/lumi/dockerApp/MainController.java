package com.lumi.dockerApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.applet.Main;

@RestController
public class MainController {

    Logger log = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/test")
    public String getTest() {
        log.info("hello logger");
        return "test";
    }

}
