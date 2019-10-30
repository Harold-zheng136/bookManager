package cn.bdqn.pojo;

/**
 * 借阅图书类
 */
public class Recode {

    private Integer id;//借阅id
    private Integer book_id;//图书id
    private Integer user_id;//用户id
    private String recodeDate;//借出日期
    private String backDate;//归还日期
    private Integer returnBook;//是否归还
    private Double tiketFee;//借阅费用

    @Override
    public String toString() {
        return "Recode{" +
                "id=" + id +
                ", book_id=" + book_id +
                ", user_id=" + user_id +
                ", recodeDate='" + recodeDate + '\'' +
                ", backDate='" + backDate + '\'' +
                ", returnBook=" + returnBook +
                ", tiketFee=" + tiketFee +
                '}';
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

    public String getRecodeDate() {
        return recodeDate;
    }

    public void setRecodeDate(String recodeDate) {
        this.recodeDate = recodeDate;
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
}
