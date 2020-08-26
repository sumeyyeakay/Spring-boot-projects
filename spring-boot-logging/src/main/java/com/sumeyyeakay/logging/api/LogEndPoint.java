package com.sumeyyeakay.logging.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sumeyye Akay
 * logging will be in this class.
*/

@Slf4j
@RestController
@RequestMapping("/log")
public class LogEndPoint
{


    @GetMapping
    public String getDetails()
    {
        log.debug("get details method started");
        return internalLogDetail();
    }

    private String internalLogDetail(){
        try {
            log.debug("get details method started");
            Thread.sleep(1000);
            return "API Messages";
        } catch (InterruptedException interruptedException) {
            log.error("Error : {}", interruptedException);
        }
        return "";
    }
}
