package models;

public class Movie {

  private int year;
  private String name;

  public int getYear() {
    return year;
  }

  public String getName() {
    return name;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Movie(String name, int year) {
    this.year = year;
    this.name = name;
  }

}
