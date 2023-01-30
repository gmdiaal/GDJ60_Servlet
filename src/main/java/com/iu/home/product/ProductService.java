package com.iu.home.product;

public class ProductService {

	public static void main(String[] args) {
		ProductDTO productDTO = new ProductDTO();
		ProductDAO dao = new ProductDAO();
		
		productDTO.setProduct_name("test1");
		productDTO.setProduct_detail("test1");
		productDTO.setProduct_score( 0.0 );
		
		ProductOptionDTO optionDTO = new ProductOptionDTO();
		optionDTO.setName("test1");
		optionDTO.setPrice(100L);
		optionDTO.setStock(10L);
		optionDTO.setProduct_num(null);
		
		ProductOptionDTO optionDTO2 = new ProductOptionDTO();
		optionDTO2.setName("test1");
		optionDTO2.setPrice(100L);
		optionDTO2.setStock(10L);
		optionDTO2.setProduct_num(null);
		
		try {
			Long num = dao.getMax(); 
			productDTO.setProduct_num(num);
			
			int result = dao.setProduct(productDTO); 
			
			optionDTO.setOption_num(num); 
			
			if(result >=0) { //상품이 하나 이상이면
				dao.setProductOption(optionDTO); //상품에 옵션주임
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
