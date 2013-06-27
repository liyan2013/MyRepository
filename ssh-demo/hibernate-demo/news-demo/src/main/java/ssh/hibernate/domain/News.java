package ssh.hibernate.domain;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/24/13
 * Time: 11:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class News {


    private Integer id;
    private String title;
    private String content;
    private String fullContent;

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

    public String getFullContent() {
        return fullContent;
    }

    public void setFullContent(String fullContent) {
        this.fullContent = fullContent;
    }
}
