package shop2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@AllArgsConstructor @NoArgsConstructor
//@Getter @Setter @ToString

@Data @AllArgsConstructor @NoArgsConstructor
public class ProductDTO {
	private int productId;
	private String pname;
	private int price;
	private String content;
}
