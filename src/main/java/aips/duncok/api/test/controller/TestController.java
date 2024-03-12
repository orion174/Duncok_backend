package aips.duncok.api.test.controller;

import aips.duncok.api.test.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aips/duncok/test")
@RequiredArgsConstructor
public class TestController {
    private final TestService webTestService;

    @ResponseBody
    @GetMapping(value = "/getSampleList")
    public ResponseEntity<?> test() throws Exception {
        return webTestService.selectWebSampleList();
    }

}