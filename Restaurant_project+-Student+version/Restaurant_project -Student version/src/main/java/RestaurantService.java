
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    private static List<Restaurant> restaurants = new ArrayList<Restaurant>();


    //public RestaurantService(){
    //restaurants.add(addRestaurant("Pardise","Secunderabad", LocalTime.parse("10:15:00"),LocalTime.parse("23:59:59")));
    //restaurants.add(addRestaurant("Bawarchi","RTC Cross Roads", LocalTime.parse("11:15:00"),LocalTime.parse("22:59:59")));
    //restaurants.add(addRestaurant("Pumpkin Tales","Chennai",LocalTime.parse("12:00:00"),LocalTime.parse("23:00:00")));
    //restaurants.add(addRestaurant("Amelie's cafe","Chennai",LocalTime.parse("10:00:00"), LocalTime.parse("21:59:05")));
    //}

    public Restaurant findRestaurantByName(String restaurantName) throws restaurantNotFoundException {
                for (Restaurant restaurant : restaurants) {
                    if (restaurant.getName().equals(restaurantName)) {
                        return restaurant;
                    }
                }
                throw new restaurantNotFoundException(restaurantName);
            }

        //DELETE ABOVE STATEMENT AND WRITE CODE HERE

    public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public Restaurant removeRestaurant(String restaurantName) throws restaurantNotFoundException {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName);
        if(restaurantToBeRemoved == null)
        throw new restaurantNotFoundException(restaurantName);

        restaurants.remove(restaurantToBeRemoved);

        return restaurantToBeRemoved;
    }


    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

}
