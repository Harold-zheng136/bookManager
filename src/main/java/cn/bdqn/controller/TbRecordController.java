package cn.bdqn.controller;

import cn.bdqn.pojo.TbRecord;
import cn.bdqn.service.TbRecordSerice;
import cn.bdqn.tools.Constants;
import cn.bdqn.tools.PageSupport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/tbrecord")
public class TbRecordController {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    TbRecordSerice tbRecordSerice = (TbRecordSerice) ctx.getBean("tbRecordSerice");
    String path = null;

    @RequestMapping("/query")
    public String query(@RequestParam(value = "UserRecord", required = false)String temp,
                        @RequestParam(value = "bookName", required = false)String bookName,
                        @RequestParam(value = "pageIndex", required = false)String pageIndex,
                        Model model){
        int UserRecord = 0;
        List<TbRecord> tbRecordsList = null;
        //设置页面容量
        int pageSize = Constants.pageSize;
        //当前页码
        int currentPageNo = 1;
        System.out.println("bookName servlet--------" + bookName);
        System.out.println("UserRecord servlet--------" + UserRecord);
        System.out.println("query pageIndex--------- > " + pageIndex);
        if(bookName == null){
            bookName = "";
        }
        if(temp != null && temp.equals("")){
            UserRecord = Integer.parseInt(temp);
        }
        if(pageIndex != null){
            try {
                currentPageNo = Integer.valueOf(pageIndex);
            }catch (NumberFormatException e){
                return "error";
            }
        }
        //总数量（表）
        int totalCount = tbRecordSerice.getTbRecordCount(UserRecord,bookName);
        //总页数
        PageSupport pages = new PageSupport();
        pages.setCurrentPageNo(currentPageNo);
        pages.setPageSize(pageSize);
        pages.setTotalCount(totalCount);
        int totalPageCount = pages.getTotalPageCount();

        //控制首页和尾页
        if (currentPageNo < 1) {
            currentPageNo = 1;
        } else if (currentPageNo > totalPageCount) {
            currentPageNo = totalPageCount;
        }
        tbRecordsList  = tbRecordSerice.getTbRecordList(UserRecord,bookName,currentPageNo,pageSize);
        System.out.println("========"+tbRecordsList.size());
        model.addAttribute("bookName", bookName);
        model.addAttribute("UserRecord", UserRecord);
        model.addAttribute("totalPageCount", totalPageCount);
        model.addAttribute("totalCount", totalCount);
        model.addAttribute("currentPageNo", currentPageNo);
        model.addAttribute("tbRecordsList",tbRecordsList);
        return "record";
    }
    //归还图书
    @RequestMapping("/modifyexe")
    public String modify(@RequestParam("id") String id, HttpSession session){
        if(tbRecordSerice.modify(Integer.valueOf(id))){
            path = "redirect:query";
        }else{
            path="modifyexe";
        }
        return path;
    }
}
