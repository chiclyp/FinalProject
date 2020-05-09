package forecast;

import java.util.Scanner;

/**
 *
 * @author 15142
 */
public class Forecast {

    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Weather content = new Weather(70, "sunny");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a temperature in Fahrenheit");
        double aa = scan.nextDouble();
        
        if (aa < -50) {
            System.out.println("Invalid Number");
            aa = 70;
        }
        if (aa > 150) {
            System.out.println("Invalid Number");
            aa = 70;
        }
            
            
        
        
        content.setTemp(aa);
        System.out.println("The temperature is " + content.getTemp());
        System.out.println("Please enter a sky condition");
        String bb = scan.next();
        
        content.setSkyCond(bb);
        System.out.println("The temperature is " + content.getSkyCond());
        
        System.out.println("Answer: " + content.consistent());
        System.out.println("The temperature in Celsius is " + content.toCelsius());
        
        

    }
}

    class Weather {

        private double temperatureFah;
        private double temperatureCel;
        private String skyCond;

        String snowy = "snowy";
        String sunny = "sunny";
        String cloudy = "cloudy";
        String rainy = "rainy";

        Weather(double t, String s) {
            temperatureFah = t;
            skyCond = s;
        }

        public void setTemp(double temperature) {
            this.temperatureFah = temperature;
        }

        public void setSkyCond(String skyCond) {
            this.skyCond = skyCond;
        }

        public  double getTemp() {
            return temperatureFah;
        }

        public String getSkyCond() {
            return skyCond;
        }

        @Override
        public String toString() {
            return "The temperature in Fahrenheit is " + temperatureFah
                    + "The sky condition is " + skyCond;
        }

        public String toCelsius() {
            temperatureCel = (temperatureFah - 32) * 5 / 9;
            return "The temperature in Celsius is " + temperatureCel;
        }

        public String consistent() {
            if (temperatureFah > 32 && skyCond.equals(snowy)) {
                return "These weather attributes are not consistent";
            } else if (temperatureFah < 32 && skyCond.equals(rainy)) {
                return "These weater attributes are not consistent";
            } else {
                return "These weather attributes are consitent";
            }
        }
    }


