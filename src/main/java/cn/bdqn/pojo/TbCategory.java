package cn.bdqn.pojo;

public class TbCategory {

    private Integer id;//种类id
    private Integer manager_id;//管理员id
    private String catName;//种类名称
    private String createDate;//创建时间


    @Override
    public String toString() {
        return "TbCategory{" +
                "id=" + id +
                ", manager_id=" + manager_id +
                ", catName='" + catName + '\'' +
                ", createDate='" + createDate + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getManager_id() {
        return manager_id;
    }

    public void setManager_id(Integer manager_id) {
        this.manager_id = manager_id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }


}