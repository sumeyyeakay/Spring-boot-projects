package com.sumeyyeakay.logging.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sumeyye Akay
 * logging will be in this class.
 *
 *  Loglama -> Asenkron olmalidir. Bunu yapmazsak uygulama performansi biraz kaybedilmis olur.
 *  Request boylece gecikmemis olacaktir.
 */

@RestController
@RequestMapping("/log")
public class LogEndPoint {

    @GetMapping
    public String getDetails(){
        return "Messages";
    }
}
