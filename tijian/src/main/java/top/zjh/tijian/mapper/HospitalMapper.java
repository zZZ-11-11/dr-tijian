package top.zjh.tijian.mapper;

import org.apache.ibatis.annotations.Select;
import top.zjh.tijian.pojo.Hospital;

import java.util.List;

public interface HospitalMapper {
    int deleteByPrimaryKey(Integer hpId);

    int insert(Hospital record);

    int insertSelective(Hospital record);

    Hospital selectByPrimaryKey(Integer hpId);

    int updateByPrimaryKeySelective(Hospital record);

    int updateByPrimaryKeyWithBLOBs(Hospital record);

    int updateByPrimaryKey(Hospital record);

    @Select("select * from hospital")
    List<Hospital> listHospital();

    @Select("select * from hospital where hpId = #{hpId}")
    Hospital getHospitalById(Integer hpId);
}