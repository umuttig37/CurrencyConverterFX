public class Currency {
    private String abbreviation;
    private String name;
    private double conversionRateToUSD;

    public Currency(String abbreviation, String name, double conversionRateToUSD){
        this.abbreviation = abbreviation;
        this.name = name;
        this.conversionRateToUSD = conversionRateToUSD;
    }
    public String getAbbreviation(){
        return abbreviation;
    }

    public String getName(){
        return name;
    }

    public double getConversionRateToUSD() {
        return conversionRateToUSD;
    }

}
