package com.example.booksmanagementsystem.controller;


import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;

@RestController
public class KaptchaController {

    private static final String KAPTCHA_SESSION_KEY = "HOME_KAPTCHA_SESSION_KEY";
    private static final String KAPTCHA_SESSION_KEY_DATE = "HOME_KAPTCHA_SESSION_DATE";
    private static final Long SESSION_TIMEOUT = 60 * 1000L;
    @RequestMapping("check")
    public boolean checkHomeCaptcha(String captcha, HttpSession session) {
        if (!StringUtils.hasLength(captcha)) {
            return false;
        }
        System.out.println(captcha);
        String saveCaptcha = (String) session.getAttribute(KAPTCHA_SESSION_KEY);
        System.out.println(saveCaptcha);
        Date saveDate = (Date) session.getAttribute(KAPTCHA_SESSION_KEY_DATE);

        if (captcha.equals(saveCaptcha)) {
            if (saveDate == null || System.currentTimeMillis() - saveDate.getTime() > SESSION_TIMEOUT) { // 超时
                return false;
            } else {
                return true;
            }
        }

        return false;
    }
}
