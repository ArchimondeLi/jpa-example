package cn.merryyou.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * @Author: lifan
 * @Date: 2020-07-27 22:58
 */
@Embeddable
public class UserBookKey implements Serializable {

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "book_name")
    private String bookName;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
