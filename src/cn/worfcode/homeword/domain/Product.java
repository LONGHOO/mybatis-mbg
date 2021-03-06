package cn.worfcode.homeword.domain;

import java.math.BigDecimal;

public class Product {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.id
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.productName
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    private String productname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.dir_id
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    private Long dirId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.salePrice
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    private BigDecimal saleprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.supplier
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    private String supplier;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.brand
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    private String brand;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.cutoff
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    private BigDecimal cutoff;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.costPrice
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    private BigDecimal costprice;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.id
     *
     * @return the value of product.id
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.id
     *
     * @param id the value for product.id
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.productName
     *
     * @return the value of product.productName
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public String getProductname() {
        return productname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.productName
     *
     * @param productname the value for product.productName
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.dir_id
     *
     * @return the value of product.dir_id
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public Long getDirId() {
        return dirId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.dir_id
     *
     * @param dirId the value for product.dir_id
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public void setDirId(Long dirId) {
        this.dirId = dirId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.salePrice
     *
     * @return the value of product.salePrice
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public BigDecimal getSaleprice() {
        return saleprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.salePrice
     *
     * @param saleprice the value for product.salePrice
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public void setSaleprice(BigDecimal saleprice) {
        this.saleprice = saleprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.supplier
     *
     * @return the value of product.supplier
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public String getSupplier() {
        return supplier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.supplier
     *
     * @param supplier the value for product.supplier
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.brand
     *
     * @return the value of product.brand
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public String getBrand() {
        return brand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.brand
     *
     * @param brand the value for product.brand
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.cutoff
     *
     * @return the value of product.cutoff
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public BigDecimal getCutoff() {
        return cutoff;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.cutoff
     *
     * @param cutoff the value for product.cutoff
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public void setCutoff(BigDecimal cutoff) {
        this.cutoff = cutoff;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.costPrice
     *
     * @return the value of product.costPrice
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public BigDecimal getCostprice() {
        return costprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.costPrice
     *
     * @param costprice the value for product.costPrice
     *
     * @mbggenerated Sat Mar 30 16:05:08 CST 2019
     */
    public void setCostprice(BigDecimal costprice) {
        this.costprice = costprice;
    }
}