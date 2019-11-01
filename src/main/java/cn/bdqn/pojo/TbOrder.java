package cn.bdqn.pojo;

/**
 * 预定类
 */
public class TbOrder {
    private Integer id;//预定id
    private Integer user_id;//用户id
    private Integer book_id;//图书id
    private String orderDate;//预定日期
    private String deadline;//截止日期

    @Override
    public String toString() {
        return "TbOrder{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", book_id=" + book_id +
                ", orderDate='" + orderDate + '\'' +
                ", deadline='" + deadline + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}