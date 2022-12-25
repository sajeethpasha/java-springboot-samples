package guru.springframework.Entitys;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

/**
 * Created by jt on 1/10/17.
 */
@Entity
@Table(name = "consumer")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Consumer {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", columnDefinition = "VARCHAR(255)")
    private UUID id;


    private String description;
    //private BigDecimal price;
    private String imageUrl;
}
