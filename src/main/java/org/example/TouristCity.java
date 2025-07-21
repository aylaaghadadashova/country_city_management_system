package org.example;
import java.util.Objects;

public class TouristCity extends City{
   public int annualVisitors;
   public String mainAttraction;
   public double annualTourismRevenue;


    public TouristCity(int id, String name, long population, boolean isCapital, double area, Country country){
        super(id, name, population, isCapital, area, country);
    }


    public TouristCity(int id, String name, long population, boolean isCapital, double area, Country country, int annualVisitors, String mainAttraction, double annualTourismRevenue) {
        super(id, name, population, isCapital, area, country);
        this.annualVisitors = annualVisitors;
        this.mainAttraction = mainAttraction;
        this.annualTourismRevenue = annualTourismRevenue;
    }


    public int getAnnualVisitors() {
        return annualVisitors;
    }

    public void setAnnualVisitors(int annualVisitors) {
        this.annualVisitors = annualVisitors;
    }

    public String getMainAttraction() {
        return mainAttraction;
    }

    public void setMainAttraction(String mainAttraction) {
        this.mainAttraction = mainAttraction;
    }

    public double getAnnualTourismRevenue() {
        return annualTourismRevenue;
    }

    public void setAnnualTourismRevenue(double annualTourismRevenue) {
        this.annualTourismRevenue = annualTourismRevenue;
    }


    public double calculateGrowthRate(double prevRevenue, int years) {
        if (years == 0) return 0;
        return ((this.annualTourismRevenue - prevRevenue) / prevRevenue) * 100 / years;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false; // City class-ında olan sahələr eyni olmalıdır

        TouristCity that = (TouristCity) object;
        return
                annualVisitors == that.annualVisitors &&
                        Double.compare(annualTourismRevenue, that.annualTourismRevenue) == 0 &&
                        Objects.equals(mainAttraction, that.mainAttraction);
    }

    @Override
    public String toString() {
        return "TouristCity{" +
                "annualVisitors=" + annualVisitors +
                ", mainAttraction='" + mainAttraction + '\'' +
                ", annualTourismRevenue=" + annualTourismRevenue +
                ", id=" + id +
                ", cityName='" + cityName + '\'' +
                ", population=" + population +
                ", isCapital=" + isCapital +
                ", area=" + area +
                ", country=" + country +
                '}';
    }
}
