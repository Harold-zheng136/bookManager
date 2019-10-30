package cn.bdqn.pojo;

/**
 * 用户类
 */
public class User {

    private Integer id;//用户id
    private String userName;//用户名
    private String password;//密码
    private String registerDate;//注册日期
    private String afterDate;//
    private String realName;//真实姓名
    private Integer age;//年龄
    private String sex;//性别
    private String telNum;//电话号码
    private String email;//电子邮箱
    private String headImg;//头像
    private Boolean isOnline;//是否在线
    private Integer grade;//等级

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", registerDate='" + registerDate + '\'' +
                ", afterDate='" + afterDate + '\'' +
                ", realName='" + realName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", telNum='" + telNum + '\'' +
                ", email='" + email + '\'' +
                ", headImg='" + headImg + '\'' +
                ", isOnline=" + isOnline +
                ", grade=" + grade +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getAfterDate() {
        return afterDate;
    }

    public void setAfterDate(String afterDate) {
        this.afterDate = afterDate;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public Boolean getOnline() {
        return isOnline;
    }

    public void setOnline(Boolean online) {
        isOnline = online;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
