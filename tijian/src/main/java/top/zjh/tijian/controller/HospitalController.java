package top.zjh.tijian.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zjh.tijian.pojo.Hospital;
import top.zjh.tijian.pojo.Result;
import top.zjh.tijian.service.inter.HospitalService;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/hospital")
public class HospitalController {
    @Autowired
    private HospitalService hospitalService;

    @GetMapping("/listHospital")
    public Result<List<Hospital>> listHospital() {

        return hospitalService.listHospital();
    }

    @GetMapping("/getHospitalById")
    public Result<Hospital> getHospitalById(Integer hpId) {
        return hospitalService.getHospitalById(hpId);
    }
}
