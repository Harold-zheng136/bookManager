package cn.bdqn.pojo;

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