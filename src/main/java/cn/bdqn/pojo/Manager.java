package cn.bdqn.pojo;

/**
 * 管理员类
 */
public class Manager {

    private Integer id;//管理员id
    private String managerName;//管理员用户名
    private String password;//密码

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", managerName='" + managerName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
