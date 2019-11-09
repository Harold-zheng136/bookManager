package cn.bdqn.service;

import cn.bdqn.mapper.TbRecordMapper;
import cn.bdqn.pojo.TbRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("tbRecordSerice")
public class TbRecordSericeImpl implements TbRecordSerice {
    @Resource
    private TbRecordMapper tbRecordMapper;
    @Override
    public List<TbRecord> getTbRecordList(int user_id,String bookName , Integer currentPageNo,Integer pageSize) {
        List<TbRecord> tbRecordsList = null;
        try {
            tbRecordsList = tbRecordMapper.getTbRecordList(user_id,bookName,(currentPageNo - 1) * pageSize,pageSize);
        }catch (Exception e){
            e.printStackTrace();
        }
        return tbRecordsList;
    }

    @Override
    public int getTbRecordCount(int user_id,String bookName){
        int count = 0;
        System.out.println("user_id ---- > " + user_id);
        System.out.println("bookName ---- > " + bookName);
        try {
            count = tbRecordMapper.getTbRecordCount(user_id,bookName);
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public boolean modify(int id) {
        boolean flag = false;
        try {
            if(tbRecordMapper.modify(id)>0){
                flag = true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
}
