package vanigam.net.form;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by vyn on 07/04/2020
 */
public @Data @NoArgsConstructor class ProductForm {
	private String id;
	private String description;
	private BigDecimal price;
	private String imageUrl;

}
