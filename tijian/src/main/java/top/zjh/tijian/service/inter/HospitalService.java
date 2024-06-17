package top.zjh.tijian.service.inter;

import top.zjh.tijian.pojo.Hospital;
import top.zjh.tijian.pojo.Result;

import java.util.List;

public interface HospitalService {
    Result<List<Hospital>> listHospital();

    Result<Hospital> getHospitalById(Integer hpId);
}
