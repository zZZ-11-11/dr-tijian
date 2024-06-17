package top.zjh.tijian.mapper;

import top.zjh.tijian.pojo.Doctor;

public interface DoctorMapper {
    int deleteByPrimaryKey(Integer docId);

    int insert(Doctor record);

    int insertSelective(Doctor record);

    Doctor selectByPrimaryKey(Integer docId);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);
}