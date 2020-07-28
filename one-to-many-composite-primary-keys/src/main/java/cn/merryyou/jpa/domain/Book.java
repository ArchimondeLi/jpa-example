package cn.merryyou.jpa.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author: lifan
 * @CreateTime: 2020-07-27 15:58
 */
@Entity
public class Book implements Serializable {

    @EmbeddedId
    private UserBookKey key;

    @Column(name = "book_price")
    private Integer bookPrice;

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;

    public UserBookKey getKey() {
        return key;
    }

    public void setKey(UserBookKey key) {
        this.key = key;
    }

    public Integer getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Integer bookPrice) {
        this.bookPrice = bookPrice;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
