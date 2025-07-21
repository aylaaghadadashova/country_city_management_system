package org.example;

import java.util.Objects;

public class City {
   public int id;
   public String cityName;
   public long population;
   public boolean isCapital;
   public double area;
   public Country country;


   public City(int id, String cityName, long population, boolean isCapital, double area, Country country){
       this.id = id;
       this.cityName = cityName;
       this.population = population;
       this.isCapital = isCapital;
       this.area = area;
       this.country = country;
   }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        City city = (City) object;
        return id == city.id && population == city.population && isCapital == city.isCapital && Double.compare(area, city.area) == 0 && Objects.equals(cityName, city.cityName) && Objects.equals(country, city.country);
    }

    public double calculateGrowthRate(double previousPop, int years) {
        double growthRate = ((population - previousPop) / previousPop) * 100;
        return growthRate / years;
    }

    public double calculateGrowthRate(double previousPop, int years, double migrationEffect) {
        double naturalGrowth = calculateGrowthRate(previousPop, years);
        return naturalGrowth + migrationEffect / years;
    }
}
