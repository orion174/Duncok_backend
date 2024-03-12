package aips.duncok.api.test.mapper;

import aips.duncok.api.test.dto.res.TestDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    List<TestDTO> selectWebSampleList();
}
