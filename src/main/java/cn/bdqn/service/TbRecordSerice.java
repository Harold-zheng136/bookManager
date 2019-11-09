package cn.bdqn.service;

import cn.bdqn.pojo.TbRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbRecordSerice {
    //查询所有信息
    List<TbRecord> getTbRecordList(int user_id,String bookName,Integer currentPageNo,Integer pageSize);
    //通过条件查询学生用户数量
    int getTbRecordCount(int user_id,String bookName);
    //点击归还按照id修改图书状态
    boolean modify(@Param("id")int id);
}
