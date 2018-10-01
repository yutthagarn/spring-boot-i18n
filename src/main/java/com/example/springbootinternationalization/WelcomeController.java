package com.example.springbootinternationalization;

import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

/**
 * Created by IntelliJ IDEA.
 * User: Cyl3erPunKz
 * Date: 01 October 2018
 * Time: 11:00 AM
 **/
@RestController
public class WelcomeController {

    private MessageSource messageSource;

    public WelcomeController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping("/welcome")
    public String msg(@RequestHeader(value = "Accept-Language", required = false) Locale locale) {
        return messageSource.getMessage("welcome.text", null, locale);
    }
}
