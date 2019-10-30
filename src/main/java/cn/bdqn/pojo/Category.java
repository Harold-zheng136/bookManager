package cn.bdqn.pojo;

/**
 * 种类类
 */
public class Category {

    private Integer id;
    private Integer manager_id;
    private String catName;
    private Integer parent_id;
    private Boolean isParent;
    private String createDate;

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", manager_id=" + manager_id +
                ", catName='" + catName + '\'' +
                ", parent_id=" + parent_id +
                ", isParent=" + isParent +
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

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public Boolean getParent() {
        return isParent;
    }

    public void setParent(Boolean parent) {
        isParent = parent;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
