package guru.springframework.controllers;

import guru.springframework.Entitys.Consumer;
import guru.springframework.Entitys.Product;
import guru.springframework.repositories.ConsumeRepository;
import guru.springframework.repositories.ProductRepository;
import guru.springframework.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jt on 1/10/17.
 */
@RestController
public class ProductController {
    private ProductService productService;



    @Autowired
    ProductRepository productRepository;

    @Autowired
    ConsumeRepository consumeRepository;


    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/")
    public String redirToList() {
        return "ok";
    }

    @GetMapping(value = "/check")
    public Product check() {

        return productRepository.save(Product.builder()
                        .description("dfdfa")
                        .imageUrl("dfsdaf")
                         .build());
    }

    @GetMapping(value = "/cns")
    public Consumer cns() {

        return consumeRepository.save(Consumer.builder()
                .description("dfdfa")
                .imageUrl("dfsdaf")
                .build());
    }

}
