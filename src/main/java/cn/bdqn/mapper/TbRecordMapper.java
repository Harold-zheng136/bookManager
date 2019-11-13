package cn.bdqn.mapper;

import cn.bdqn.pojo.TbRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbRecordMapper {
    //通过借阅人姓名和图书名称来查询
    List<TbRecord> getTbRecordList(@Param("user_id") Integer user_id,
                                   @Param("bookName") String bookName ,
                                   @Param("currentPageNo") Integer currentPageNo,
                                   @Param("pageSize") Integer pageSize) throws Exception;
    //通过条件查询学生用户数量
    int getTbRecordCount(@Param("user_id") Integer user_id,
                         @Param("bookName") String bookName)throws Exception;

    //点击归还按照id修改图书状态
    int modify(@Param("id")Integer id)throws Exception;
}