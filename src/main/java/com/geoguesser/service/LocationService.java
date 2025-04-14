package com.geoguesser.service;

import com.geoguesser.model.StateLocation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class LocationService {
    private final List<StateLocation> locations;
    private final Random random = new Random();

    public LocationService() {
        locations = new ArrayList<>();
        
        // Initialize with state locations (state, capital, lat, lng, zoom, heading, pitch)
        locations.add(new StateLocation("Alabama", "Montgomery", 32.377716, -86.300568, 1, 0, 0));
        locations.add(new StateLocation("Alaska", "Juneau", 58.301598, -134.420212, 1, 0, 0));
        locations.add(new StateLocation("Arizona", "Phoenix", 33.448143, -112.096962, 1, 0, 0));
        locations.add(new StateLocation("Arkansas", "Little Rock", 34.746613, -92.288986, 1, 0, 0));
        locations.add(new StateLocation("California", "Sacramento", 38.576668, -121.493629, 1, 0, 0));
        locations.add(new StateLocation("Colorado", "Denver", 39.739227, -104.984856, 1, 0, 0));
        locations.add(new StateLocation("Connecticut", "Hartford", 41.764046, -72.682198, 1, 0, 0));
        locations.add(new StateLocation("Delaware", "Dover", 39.157307, -75.519722, 1, 0, 0));
        locations.add(new StateLocation("Florida", "Tallahassee", 30.438118, -84.281296, 1, 0, 0));
        locations.add(new StateLocation("Georgia", "Atlanta", 33.749027, -84.388229, 1, 0, 0));
        locations.add(new StateLocation("Hawaii", "Honolulu", 21.307442, -157.857376, 1, 0, 0));
        locations.add(new StateLocation("Idaho", "Boise", 43.617775, -116.199722, 1, 0, 0));
        locations.add(new StateLocation("Illinois", "Springfield", 39.798363, -89.654961, 1, 0, 0));
        locations.add(new StateLocation("Indiana", "Indianapolis", 39.768623, -86.162643, 1, 0, 0));
        locations.add(new StateLocation("Iowa", "Des Moines", 41.591087, -93.603729, 1, 0, 0));
        locations.add(new StateLocation("Kansas", "Topeka", 39.048191, -95.677956, 1, 0, 0));
        locations.add(new StateLocation("Kentucky", "Frankfort", 38.186722, -84.875374, 1, 0, 0));
        locations.add(new StateLocation("Louisiana", "Baton Rouge", 30.457069, -91.187393, 1, 0, 0));
        locations.add(new StateLocation("Maine", "Augusta", 44.307167, -69.781693, 1, 0, 0));
        locations.add(new StateLocation("Maryland", "Annapolis", 38.978764, -76.490936, 1, 0, 0));
        locations.add(new StateLocation("Massachusetts", "Boston", 42.358162, -71.063698, 1, 0, 0));
        locations.add(new StateLocation("Michigan", "Lansing", 42.733635, -84.555328, 1, 0, 0));
        locations.add(new StateLocation("Minnesota", "St. Paul", 44.955097, -93.102211, 1, 0, 0));
        locations.add(new StateLocation("Mississippi", "Jackson", 32.303848, -90.182106, 1, 0, 0));
        locations.add(new StateLocation("Missouri", "Jefferson City", 38.579201, -92.172935, 1, 0, 0));
        locations.add(new StateLocation("Montana", "Helena", 46.585709, -112.018417, 1, 0, 0));
        locations.add(new StateLocation("Nebraska", "Lincoln", 40.808075, -96.699654, 1, 0, 0));
        locations.add(new StateLocation("Nevada", "Carson City", 39.163914, -119.766121, 1, 0, 0));
        locations.add(new StateLocation("New Hampshire", "Concord", 43.206898, -71.537994, 1, 0, 0));
        locations.add(new StateLocation("New Jersey", "Trenton", 40.220596, -74.770116, 1, 0, 0));
        locations.add(new StateLocation("New Mexico", "Santa Fe", 35.686975, -105.937799, 1, 0, 0));
        locations.add(new StateLocation("New York", "Albany", 42.652843, -73.757874, 1, 0, 0));
        locations.add(new StateLocation("North Carolina", "Raleigh", 35.78043, -78.639099, 1, 0, 0));
        locations.add(new StateLocation("North Dakota", "Bismarck", 46.82085, -100.783318, 1, 0, 0));
        locations.add(new StateLocation("Ohio", "Columbus", 39.961346, -82.999069, 1, 0, 0));
        locations.add(new StateLocation("Oklahoma", "Oklahoma City", 35.492207, -97.503342, 1, 0, 0));
        locations.add(new StateLocation("Oregon", "Salem", 44.938461, -123.030403, 1, 0, 0));
        locations.add(new StateLocation("Pennsylvania", "Harrisburg", 40.264378, -76.883598, 1, 0, 0));
        locations.add(new StateLocation("Rhode Island", "Providence", 41.830914, -71.414963, 1, 0, 0));
        locations.add(new StateLocation("South Carolina", "Columbia", 34.000343, -81.033211, 1, 0, 0));
        locations.add(new StateLocation("South Dakota", "Pierre", 44.367031, -100.346405, 1, 0, 0));
        locations.add(new StateLocation("Tennessee", "Nashville", 36.16581, -86.784241, 1, 0, 0));
        locations.add(new StateLocation("Texas", "Austin", 30.27467, -97.740349, 1, 0, 0));
        locations.add(new StateLocation("Utah", "Salt Lake City", 40.777477, -111.888237, 1, 0, 0));
        locations.add(new StateLocation("Vermont", "Montpelier", 44.262436, -72.580536, 1, 0, 0));
        locations.add(new StateLocation("Virginia", "Richmond", 37.538857, -77.43364, 1, 0, 0));
        locations.add(new StateLocation("Washington", "Olympia", 47.035805, -122.905014, 1, 0, 0));
        locations.add(new StateLocation("West Virginia", "Charleston", 38.336246, -81.612328, 1, 0, 0));
        locations.add(new StateLocation("Wisconsin", "Madison", 43.074684, -89.384445, 1, 0, 0));
        locations.add(new StateLocation("Wyoming", "Cheyenne", 41.140259, -104.820236, 1, 0, 0));
    }

    public StateLocation getRandomLocation() {
        return locations.get(random.nextInt(locations.size()));
    }
    
    public List<String> getAllStateNames() {
        List<String> stateNames = new ArrayList<>();
        for (StateLocation location : locations) {
            stateNames.add(location.getState());
        }
        return stateNames;
    }
}