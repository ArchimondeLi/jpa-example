package cn.merryyou.jpa.repository;

import cn.merryyou.jpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created on 2018/2/5.
 *
 * @author zlf
 * @since 1.0
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
