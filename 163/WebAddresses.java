class Address {
    String street;
    String city;
    String state;
    int zip;
}

public class WebAddresses {
    public static void main(String[] args) throws Exception {

        Address disneyLand = new Address();
        disneyLand.street = "1313 Disneyland Dr";
        disneyLand.city   = "Anaheim";
        disneyLand.state  = "California";
        disneyLand.zip    = 92802;
        
        Address groceryStore = new Address();
        groceryStore.street = "82 Food St";
        groceryStore.city = "Chicago";
        groceryStore.state = "Illinois";
        groceryStore.zip = 11928;
        
        Address home = new Address();
        home.street = "00 Fake Street Dr";
        home.city = "Buffalo";
        home.state = "New York";
        home.zip = 37465;

        System.out.println(disneyLand.street + ", " + disneyLand.city + ", " + disneyLand.state + "  " + disneyLand.zip);
        System.out.println(groceryStore.street + ", " + groceryStore.city + ", " + groceryStore.state + " " + groceryStore.zip);
        System.out.println(home.street + ", " + home.city + ", " + home.state + " " + home.zip);
    }
}

