package org.hdcd.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

@Slf4j
@Controller
public class HomeController {

    @GetMapping("/ajaxHome")
    public String ajaxHome() {
        log.info("ajaxHome");
        return "ajaxHome";
    }

}
