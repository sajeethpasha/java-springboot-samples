package guru.springframework.Entitys;

import lombok.*;

import javax.persistence.*;

/**
 * Created by jt on 1/10/17.
 */
@Entity
@Table(name = "product")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String description;
    //private BigDecimal price;
    private String imageUrl;
}
