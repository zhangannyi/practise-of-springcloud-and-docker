package fun.liwudi.springboot.Mapper;

import fun.liwudi.springboot.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 李武第
 */
public interface GirlMapper extends JpaRepository<Girl,Integer> {
}
