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
        // Using capital cities and very obvious iconic locations

        // Alabama - State Capitol Building in Montgomery
        locations.add(new StateLocation("Alabama", "Montgomery", 32.3767, -86.3000, 0, 0, 0));
        
        // Alaska - State Capitol Building in Juneau
        locations.add(new StateLocation("Alaska", "Juneau", 58.3019, -134.4197, 0, 270, 0));
        
        // Arizona - Arizona State Capitol in Phoenix
        locations.add(new StateLocation("Arizona", "Phoenix", 33.4484, -112.0740, 0, 0, 0));
        
        // Arkansas - Arkansas State Capitol in Little Rock
        locations.add(new StateLocation("Arkansas", "Little Rock", 34.7465, -92.2896, 0, 90, 0));
        
        // California - Golden Gate Bridge (iconic)
        locations.add(new StateLocation("California", "Sacramento", 37.8199, -122.4783, 0, 150, 0));
        
        // Colorado - Colorado State Capitol in Denver
        locations.add(new StateLocation("Colorado", "Denver", 39.7393, -104.9848, 0, 0, 0));
        
        // Connecticut - Connecticut State Capitol in Hartford
        locations.add(new StateLocation("Connecticut", "Hartford", 41.7658, -72.6734, 0, 180, 0));
        
        // Delaware - Delaware Legislative Hall in Dover
        locations.add(new StateLocation("Delaware", "Dover", 39.1572, -75.5197, 0, 270, 0));
        
        // Florida - Disney World Entrance (iconic)
        locations.add(new StateLocation("Florida", "Tallahassee", 28.4177, -81.5812, 0, 90, 0));
        
        // Georgia - Georgia State Capitol in Atlanta
        locations.add(new StateLocation("Georgia", "Atlanta", 33.7490, -84.3880, 0, 0, 0));
        
        // Hawaii - Waikiki Beach with Diamond Head visible (iconic)
        locations.add(new StateLocation("Hawaii", "Honolulu", 21.2771, -157.8325, 0, 120, 0));
        
        // Idaho - Idaho State Capitol in Boise
        locations.add(new StateLocation("Idaho", "Boise", 43.6187, -116.1996, 0, 0, 0));
        
        // Illinois - Willis Tower (Sears Tower) in Chicago (iconic)
        locations.add(new StateLocation("Illinois", "Springfield", 41.8789, -87.6359, 0, 0, 10));
        
        // Indiana - Indianapolis Motor Speedway (iconic)
        locations.add(new StateLocation("Indiana", "Indianapolis", 39.7930, -86.2383, 0, 180, 0));
        
        // Iowa - Iowa State Capitol in Des Moines
        locations.add(new StateLocation("Iowa", "Des Moines", 41.5912, -93.6039, 0, 270, 0));
        
        // Kansas - Kansas State Capitol in Topeka
        locations.add(new StateLocation("Kansas", "Topeka", 39.0490, -95.6781, 0, 0, 0));
        
        // Kentucky - Churchill Downs (iconic)
        locations.add(new StateLocation("Kentucky", "Frankfort", 38.2045, -85.7705, 0, 180, 0));
        
        // Louisiana - French Quarter with "New Orleans" signs (iconic)
        locations.add(new StateLocation("Louisiana", "Baton Rouge", 29.9584, -90.0644, 0, 0, 0));
        
        // Maine - Maine State House in Augusta
        locations.add(new StateLocation("Maine", "Augusta", 44.3071, -69.7817, 0, 90, 0));
        
        // Maryland - Maryland State House in Annapolis
        locations.add(new StateLocation("Maryland", "Annapolis", 38.9784, -76.4900, 0, 0, 0));
        
        // Massachusetts - Fenway Park in Boston (iconic)
        locations.add(new StateLocation("Massachusetts", "Boston", 42.3467, -71.0972, 0, 270, 0));
        
        // Michigan - Michigan State Capitol in Lansing
        locations.add(new StateLocation("Michigan", "Lansing", 42.7336, -84.5553, 0, 0, 0));
        
        // Minnesota - Mall of America (iconic)
        locations.add(new StateLocation("Minnesota", "St. Paul", 44.8549, -93.2422, 0, 90, 0));
        
        // Mississippi - Mississippi State Capitol in Jackson
        locations.add(new StateLocation("Mississippi", "Jackson", 32.3038, -90.1820, 0, 180, 0));
        
        // Missouri - Gateway Arch in St. Louis (iconic)
        locations.add(new StateLocation("Missouri", "Jefferson City", 38.6245, -90.1847, 0, 270, 0));
        
        // Montana - Montana State Capitol in Helena
        locations.add(new StateLocation("Montana", "Helena", 46.5855, -112.0178, 0, 0, 0));
        
        // Nebraska - Nebraska State Capitol in Lincoln
        locations.add(new StateLocation("Nebraska", "Lincoln", 40.8080, -96.6996, 0, 90, 0));
        
        // Nevada - Welcome to Las Vegas sign (iconic)
        locations.add(new StateLocation("Nevada", "Carson City", 36.0800, -115.1722, 0, 0, 0));
        
        // New Hampshire - New Hampshire State House in Concord
        locations.add(new StateLocation("New Hampshire", "Concord", 43.2067, -71.5371, 0, 270, 0));
        
        // New Jersey - New Jersey State House in Trenton
        locations.add(new StateLocation("New Jersey", "Trenton", 40.2206, -74.7701, 0, 0, 0));
        
        // New Mexico - New Mexico State Capitol in Santa Fe
        locations.add(new StateLocation("New Mexico", "Santa Fe", 35.6869, -105.9378, 0, 90, 0));
        
        // New York - Statue of Liberty (iconic)
        locations.add(new StateLocation("New York", "Albany", 40.6892, -74.0445, 0, 0, 10));
        
        // North Carolina - North Carolina State Capitol in Raleigh
        locations.add(new StateLocation("North Carolina", "Raleigh", 35.7804, -78.6391, 0, 270, 0));
        
        // North Dakota - North Dakota State Capitol in Bismarck
        locations.add(new StateLocation("North Dakota", "Bismarck", 46.8208, -100.7833, 0, 0, 0));
        
        // Ohio - Rock and Roll Hall of Fame (iconic)
        locations.add(new StateLocation("Ohio", "Columbus", 41.5085, -81.6954, 0, 90, 0));
        
        // Oklahoma - Oklahoma State Capitol in Oklahoma City
        locations.add(new StateLocation("Oklahoma", "Oklahoma City", 35.4922, -97.5033, 0, 180, 0));
        
        // Oregon - Oregon State Capitol in Salem
        locations.add(new StateLocation("Oregon", "Salem", 44.9383, -123.0300, 0, 270, 0));
        
        // Pennsylvania - Liberty Bell in Philadelphia (iconic)
        locations.add(new StateLocation("Pennsylvania", "Harrisburg", 39.9496, -75.1503, 0, 0, 0));
        
        // Rhode Island - Rhode Island State House in Providence
        locations.add(new StateLocation("Rhode Island", "Providence", 41.8309, -71.4150, 0, 90, 0));
        
        // South Carolina - South Carolina State House in Columbia
        locations.add(new StateLocation("South Carolina", "Columbia", 34.0003, -81.0332, 0, 180, 0));
        
        // South Dakota - Mount Rushmore (iconic)
        locations.add(new StateLocation("South Dakota", "Pierre", 43.8804, -103.4588, 0, 0, 0));
        
        // Tennessee - Grand Ole Opry in Nashville (iconic)
        locations.add(new StateLocation("Tennessee", "Nashville", 36.2048, -86.6920, 0, 270, 0));
        
        // Texas - The Alamo in San Antonio (iconic)
        locations.add(new StateLocation("Texas", "Austin", 29.4260, -98.4862, 0, 0, 0));
        
        // Utah - Utah State Capitol in Salt Lake City
        locations.add(new StateLocation("Utah", "Salt Lake City", 40.7774, -111.8882, 0, 90, 0));
        
        // Vermont - Vermont State House in Montpelier
        locations.add(new StateLocation("Vermont", "Montpelier", 44.2624, -72.5805, 0, 180, 0));
        
        // Virginia - Virginia State Capitol in Richmond
        locations.add(new StateLocation("Virginia", "Richmond", 37.5388, -77.4336, 0, 270, 0));
        
        // Washington - Space Needle in Seattle (iconic)
        locations.add(new StateLocation("Washington", "Olympia", 47.6205, -122.3493, 0, 0, 0));
        
        // West Virginia - West Virginia State Capitol in Charleston
        locations.add(new StateLocation("West Virginia", "Charleston", 38.3362, -81.6123, 0, 90, 0));
        
        // Wisconsin - Wisconsin State Capitol in Madison
        locations.add(new StateLocation("Wisconsin", "Madison", 43.0747, -89.3844, 0, 180, 0));
        
        // Wyoming - Wyoming State Capitol in Cheyenne
        locations.add(new StateLocation("Wyoming", "Cheyenne", 41.1403, -104.8202, 0, 270, 0));
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
    
    // No longer needed with our button-based approach for state selection
}