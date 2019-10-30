package cn.bdqn.pojo;

/**
 * 答复类
 */
public class Reply {

    private Integer id;//答复id
    private Integer comment_id;//评论id
    private String content;//回复内容
    private String replyDate;//回复日期

    @Override
    public String toString() {
        return "Reply{" +
                "id=" + id +
                ", comment_id=" + comment_id +
                ", content='" + content + '\'' +
                ", replyDate='" + replyDate + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getComment_id() {
        return comment_id;
    }

    public void setComment_id(Integer comment_id) {
        this.comment_id = comment_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(String replyDate) {
        this.replyDate = replyDate;
    }
}
