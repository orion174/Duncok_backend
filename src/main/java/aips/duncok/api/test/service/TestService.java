package aips.duncok.api.test.service;

import org.springframework.http.ResponseEntity;

public interface TestService {
    ResponseEntity<?> selectWebSampleList() throws Exception;
    
}
