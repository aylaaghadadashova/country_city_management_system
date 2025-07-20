package country_city_management_system;

import java.util.Scanner;

public class CountryCityApp {
    static Scanner scanner = new Scanner(System.in);
    static Country[] countries = new Country[100];
    static City[] cities = new City[500];
    static int countryCount = 0;
    static int cityCount = 0;

    public static void main(String[] args) { //Ayla

        Scanner scanner = new Scanner(System.in);
        Country[] countries = new Country[100];
        City[] cities = new City[500];
        int countryCount = 0;
        int cityCount = 0;

        while (true){
            showMenu();
            System.out.print("\nEnter your option: ");
            int option = scanner.nextInt();

            switch (option){
                case 1: addCity(); break;
                case 2: addCountry();break;
                case 3: removeCity(); break;
                case 4: removeCountry(); break;
                case 5: updateCity(); break;
                case 6: updateCountry(); break;
                case 7: displayAll(); break;
                case 8: showRates(); break;
                case 9: System.exit(0);
                default:
                    System.out.println("Wrong input! Try again.\n");
            }

        }
    }

    public static void showMenu(){ //Ayla
        System.out.println("---MENU---\n" +
                "1. Add City \n" +
                "2. Add Country \n" +
                "3. Remove City \n" +
                "4. Remove Country \n" +
                "5. Update City \n" +
                "6. Update Country \n" +
                "7. Display Full List of Countries and Cities \n" +
                "8. Calculate Growth Rate \n" +
                "9. Exit");
    }

    public static int indexOfCountry(String countryName){//Ayla
        for(int i = 0; i<countryCount; i++){
            if(countryName.equals(countries[i].getName())) return i;
        }
        return -1;
    }

    public static int indexOfCity(String cityName){//Ayla
        for(int i = 0; i<cityCount; i++){
            if(cityName.equals(cities[i].getName())) return i;
        }
        return -1;
    }

    public static void addCity(){//Saleh

    };

    public static void addCountry(){//Ayla

    };

    public static void removeCity(){//Sevinc

    };

    public static void removeCountry(){//Saleh

    };

    public static void updateCity(){//Ayla
    };

    public static void updateCountry(){//Sevinc

    };

    public static void displayAll(){//Ayla
    };

    public static void showRates(){//Ayla

    };
}

