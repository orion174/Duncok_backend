package aips.duncok.api.test.service.impl;

import aips.duncok.common.res.ApiRes;
import aips.duncok.api.test.dto.res.TestDTO;
import aips.duncok.api.test.mapper.TestMapper;
import aips.duncok.api.test.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

    private final TestMapper webTestMapper;

    @Override
    public ResponseEntity<?> selectWebSampleList() {
        List<TestDTO> result = webTestMapper.selectWebSampleList();
        return new ResponseEntity<>(new ApiRes(result), HttpStatus.OK);
    }

}