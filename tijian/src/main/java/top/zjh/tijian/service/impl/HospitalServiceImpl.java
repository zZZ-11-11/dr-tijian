package top.zjh.tijian.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zjh.tijian.mapper.HospitalMapper;
import top.zjh.tijian.pojo.Hospital;
import top.zjh.tijian.pojo.Result;
import top.zjh.tijian.service.inter.HospitalService;

import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService {
    @Autowired
    private HospitalMapper hospitalMapper;


    @Override
    public Result<List<Hospital>> listHospital() {
        return Result.success(hospitalMapper.listHospital());
    }

    @Override
    public Result<Hospital> getHospitalById(Integer hpId) {
        return Result.success(hospitalMapper.selectByPrimaryKey(hpId));
    }
}
