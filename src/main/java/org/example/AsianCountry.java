package org.example;

public class AsianCountry extends Country{
     public double gdpPerCapita;
     public boolean hasNuclearPower;
     public String mainReligion;



//     public AsianCountry(int id, String name, String continent, long population, String code, City[] cities, int cityCount){
//         super(id, name, continent, population, code, cities, cityCount);
//     }


     public AsianCountry(int id, String name, String continent, long population, String code, City[] cities, int cityCount, double gdpPerCapita, boolean hasNuclearPower, String mainReligion){
         super(id, name, continent, population, code, cities, cityCount);
         this.gdpPerCapita=gdpPerCapita;
         this.hasNuclearPower=hasNuclearPower;
         this.mainReligion=mainReligion;
     }


    public double getGdpPerCapita() {
        return gdpPerCapita;
    }

    public void setGdpPerCapita(double gdpPerCapita) {
        this.gdpPerCapita = gdpPerCapita;
    }

    public boolean isHasNuclearPower() {
        return hasNuclearPower;
    }

    public void setHasNuclearPower(boolean hasNuclearPower) {
        this.hasNuclearPower = hasNuclearPower;
    }

    public String getMainReligion() {
        return mainReligion;
    }

    public void setMainReligion(String mainReligion) {
        this.mainReligion = mainReligion;
    }
    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        AsianCountry that = (AsianCountry) object;

        return this.gdpPerCapita == that.gdpPerCapita &&
                this.hasNuclearPower == that.hasNuclearPower &&
                (this.mainReligion != null && this.mainReligion.equals(that.mainReligion));
    }

}
