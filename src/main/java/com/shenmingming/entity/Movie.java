package com.shenmingming.entity;

/**
 * 
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:胡正林(823865618@qq.com)
 * <br>Date:2019年6月11日
 */
public class Movie {
  private int id;

  private String name;

  private String author;

  private double price;

  private String sdate;

  private int ltime;

  private String lei;

  private String nyear;

  private String area;

  private int status;

  public Movie(int id, String name, String author, double price, String sdate, int ltime, String lei,
    String nyear, String area, int status) {
    super();
    this.id = id;
    this.name = name;
    this.author = author;
    this.price = price;
    this.sdate = sdate;
    this.ltime = ltime;
    this.lei = lei;
    this.nyear = nyear;
    this.area = area;
    this.status = status;
  }

  public Movie() {
    super();
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getSdate() {
    return sdate;
  }

  public void setSdate(String sdate) {
    this.sdate = sdate;
  }

  public int getLtime() {
    return ltime;
  }

  public void setLtime(int ltime) {
    this.ltime = ltime;
  }

  public String getLei() {
    return lei;
  }

  public void setLei(String lei) {
    this.lei = lei;
  }

  public String getNyear() {
    return nyear;
  }

  public void setNyear(String nyear) {
    this.nyear = nyear;
  }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "Movie [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + ", sdate="
      + sdate + ", ltime=" + ltime + ", lei=" + lei + ", nyear=" + nyear + ", area=" + area + ", status="
      + status + "]";
  }

}
