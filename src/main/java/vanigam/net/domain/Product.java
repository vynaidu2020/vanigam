package vanigam.net.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Created by vyn on 07/04/2020
 */
@Document
public @Data @NoArgsConstructor class Product {
    @Id
    private ObjectId id;
    private String description;
    private BigDecimal price;
    private String imageUrl;

   
}
