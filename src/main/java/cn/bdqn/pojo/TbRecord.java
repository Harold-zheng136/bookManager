package cn.bdqn.pojo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 借阅图书类
 */
public class TbRecord {

    private Integer id;//借阅id
    private Integer book_id;//图书id
    private String bookName;//图书名称
    private Integer user_id;//用户id
    private String userName;//用户名称
    private String recordDate;//借出日期
    private String backDate;//归还日期
    private Integer returnBook;//是否归还
    private String telNum;//电话
    private Double tiketFee;//借阅费用


    public String  getRecordDate1() throws Exception{
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date recordDate = dateFormat.parse(this.recordDate);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(recordDate);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;//月份从0开始，所以要+1
        int day = calendar.get(Calendar.DATE);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        if (hour >= 12){
            return year+"-"+(month<10?"0"+month:month)+"-"+(day<10?"0"+day:day)+" 下午"+
                    (hour-12<10?"0"+(hour-12):(hour-12))+":"+(minute<10?"0"+minute:minute);
        }else{
            return year+"-"+(month<10?"0"+month:month)+"-"+(day<10?"0"+day:day)+" 上午"+
                    (hour<10?"0"+(hour):(hour))+":"+(minute<10?"0"+minute:minute);
        }
    }
    public String  getBackDate2() throws Exception{
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date backDate = dateFormat.parse(this.backDate);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(backDate);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;//月份从0开始，所以要+1
        int day = calendar.get(Calendar.DATE);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        if (hour >= 12){
            return year+"-"+(month<10?"0"+month:month)+"-"+(day<10?"0"+day:day)+" 下午"+
                    (hour-12<10?"0"+(hour-12):(hour-12))+":"+(minute<10?"0"+minute:minute);
        }else{
            return year+"-"+(month<10?"0"+month:month)+"-"+(day<10?"0"+day:day)+" 上午"+
                    (hour<10?"0"+(hour):(hour))+":"+(minute<10?"0"+minute:minute);
        }
    }
    @Override
    public String toString() {
        return "TbRecord{" +
                "id=" + id +
                ", book_id=" + book_id +
                ", bookName='" + bookName + '\'' +
                ", user_id=" + user_id +
                ", userName='" + userName + '\'' +
                ", recodeDate='" + recordDate + '\'' +
                ", backDate='" + backDate + '\'' +
                ", returnBook=" + returnBook +
                ", tiketFee=" + tiketFee +
                '}';
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }

    public String getBackDate() {
        return backDate;
    }

    public void setBackDate(String backDate) {
        this.backDate = backDate;
    }

    public Integer getReturnBook() {
        return returnBook;
    }

    public void setReturnBook(Integer returnBook) {
        this.returnBook = returnBook;
    }

    public Double getTiketFee() {
        return tiketFee;
    }

    public void setTiketFee(Double tiketFee) {
        this.tiketFee = tiketFee;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
