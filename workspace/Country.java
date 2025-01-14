//Author: Hitesh Konduru
//Date Created: 1/8/25
//This file will create the constructors and methods for the country game
//
public class Country
{
  // add private instance variables for the name, capital, language, and image file.
private String name;
private String capital;
private String language;
private String image;
  // add constructors
  public Country() {}
  public Country(String name, String capital, String language, String image){
    this.name = name;
    this.capital = capital;
    this.language = language;
    this.image = image;
}

  // Write accessor/get methods for each instance variable that returns it.
public String getName(){
  return name;
}
public String getCapital(){
  return capital;
}
public String getLanguage(){
  return language;
}
public String getImage(){
  return image;
}
  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
 
public String toString(){
  return "" + name + "'s capital is " + capital + " and its primary language is " + language + "."; 
}

  
}