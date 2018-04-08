package com.sainsburys.serverside_test;

/**
 * This class store a Product information.
 */
public class ProductDetails {
  private String _title;
  private double _unit_price;
  private Double _kcal_per_100g;
  private String _description;

  public String getTitle() {
    return _title;
  }

  public void setTitle(String title) {
    _title = title;
  }

  public double getUnitPrice() {
    return _unit_price;
  }

  public void setUnitPrice(double unit_price) {
    _unit_price = unit_price;
  }

  public Double getKcalPer100g() {
    return _kcal_per_100g;
  }

  public void setKcalPer100g(double kcal_per_100g) {
    _kcal_per_100g = kcal_per_100g;
  }

  public String getDescription() {
    return _description;
  }

  public void setDescription(String description) {
    _description = description;
  }

  public ProductDetails(String title, double unit_price, Double kcal_per_100g, String description){
    _title = title;
    _unit_price = unit_price;
    _kcal_per_100g = kcal_per_100g;
    _description = description;
  }

}
