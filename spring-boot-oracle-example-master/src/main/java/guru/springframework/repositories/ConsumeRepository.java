package guru.springframework.repositories;

import guru.springframework.Entitys.Consumer;
import guru.springframework.Entitys.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * Created by jt on 1/10/17.
 */
public interface ConsumeRepository extends JpaRepository<Consumer, UUID> {
}
