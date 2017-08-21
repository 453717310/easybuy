package cn.bdqn.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by dll on 2017/8/16.
 * 新闻类
 */
public class Easybuy_news implements Serializable{
    private Integer id;//新闻编号
    private String title;//新闻标题
    private String content;//新闻内容
    private Date createTime;//创建时间

    public Easybuy_news() {
    }

    public Easybuy_news(Integer id, String title, String content, Date createTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Easybuy_news{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
