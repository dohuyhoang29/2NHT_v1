package com.helper;

import com.model.Product;

public class ProductManager {
  private static ProductManager productManager;
  private static Product product = new Product();

  private ProductManager() {}

  public static ProductManager getInstance() {
    if (productManager == null) {
      productManager = new ProductManager();
    }
    return productManager;
  }

  public ProductManager getProductManager() {
    return productManager;
  }

  public void setProductManager(ProductManager productManager) {
    ProductManager.productManager = productManager;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product phone) {
    ProductManager.product = phone;
  }


}
