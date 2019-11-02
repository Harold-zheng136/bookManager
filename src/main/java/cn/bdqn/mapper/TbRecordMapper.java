package cn.bdqn.mapper;

import cn.bdqn.pojo.TbRecord;

import java.util.List;

public interface TbRecordMapper {
    //查询所有信息
    List<TbRecord> getTbRecordList();
}