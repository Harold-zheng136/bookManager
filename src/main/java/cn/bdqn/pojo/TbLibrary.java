package cn.bdqn.pojo;

/**
 * 图书类
 */
public class TbLibrary {
    private Integer id;//图书id
    private Integer cate_id;//种类id
    private Integer manager_id;//管理员id
    private String bookName;//图书名称
    private String description;//图书描述
    private String author;//图书作者
    private String press;//出版社
    private String img;//图书图片
    private Double price;//图书价格
    private String publishDate;//出版日期
    private String createDate;//创建时间
    private Integer bookNum;//图书号码
    private String barCode;//条形码

    @Override
    public String toString() {
        return "TbLibrary{" +
                "id=" + id +
                ", cate_id=" + cate_id +
                ", manager_id=" + manager_id +
                ", bookName='" + bookName + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", press='" + press + '\'' +
                ", img='" + img + '\'' +
                ", price=" + price +
                ", publishDate='" + publishDate + '\'' +
                ", createDate='" + createDate + '\'' +
                ", bookNum=" + bookNum +
                ", barCode='" + barCode + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCate_id() {
        return cate_id;
    }

    public void setCate_id(Integer cate_id) {
        this.cate_id = cate_id;
    }

    public Integer getManager_id() {
        return manager_id;
    }

    public void setManager_id(Integer manager_id) {
        this.manager_id = manager_id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Integer getBookNum() {
        return bookNum;
    }

    public void setBookNum(Integer bookNum) {
        this.bookNum = bookNum;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }
}