package com.geoguesser.model;

public class StateLocation {
    private String state;
    private String capital;
    private double latitude;
    private double longitude;
    private double zoom;
    private double heading;
    private double pitch;
    private String locationName;
    private String stateFact;
    private String stateHint;

    public StateLocation(String state, String capital, double latitude, double longitude, double zoom, double heading, double pitch) {
        this.state = state;
        this.capital = capital;
        this.latitude = latitude;
        this.longitude = longitude;
        this.zoom = zoom;
        this.heading = heading;
        this.pitch = pitch;
        this.locationName = getLocationNameByCoordinates();
        this.stateFact = getStateFactByState();
        this.stateHint = getStateHintByState();
    }

    public String getState() {
        return state;
    }

    public String getCapital() {
        return capital;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getZoom() {
        return zoom;
    }

    public double getHeading() {
        return heading;
    }

    public double getPitch() {
        return pitch;
    }
    
    public String getLocationName() {
        return locationName;
    }
    
    public String getStateFact() {
        return stateFact;
    }
    
    public String getStateHint() {
        return stateHint;
    }
    
    private String getLocationNameByCoordinates() {
        // This method maps the coordinates to landmark names based on the LocationService
        
        if (state.equals("Alabama")) return "Alabama State Capitol Building in Montgomery";
        if (state.equals("Alaska")) return "Alaska State Capitol Building in Juneau";
        if (state.equals("Arizona")) return "Arizona State Capitol in Phoenix";
        if (state.equals("Arkansas")) return "Arkansas State Capitol in Little Rock";
        if (state.equals("California")) return "Golden Gate Bridge in San Francisco";
        if (state.equals("Colorado")) return "Colorado State Capitol in Denver";
        if (state.equals("Connecticut")) return "Connecticut State Capitol in Hartford";
        if (state.equals("Delaware")) return "Delaware Legislative Hall in Dover";
        if (state.equals("Florida")) return "Disney World Entrance in Orlando";
        if (state.equals("Georgia")) return "Georgia State Capitol in Atlanta";
        if (state.equals("Hawaii")) return "Waikiki Beach with Diamond Head in Honolulu";
        if (state.equals("Idaho")) return "Idaho State Capitol in Boise";
        if (state.equals("Illinois")) return "Willis Tower (Sears Tower) in Chicago";
        if (state.equals("Indiana")) return "Indianapolis Motor Speedway";
        if (state.equals("Iowa")) return "Iowa State Capitol in Des Moines";
        if (state.equals("Kansas")) return "Kansas State Capitol in Topeka";
        if (state.equals("Kentucky")) return "Churchill Downs in Louisville";
        if (state.equals("Louisiana")) return "French Quarter in New Orleans";
        if (state.equals("Maine")) return "Maine State House in Augusta";
        if (state.equals("Maryland")) return "Maryland State House in Annapolis";
        if (state.equals("Massachusetts")) return "Fenway Park in Boston";
        if (state.equals("Michigan")) return "Michigan State Capitol in Lansing";
        if (state.equals("Minnesota")) return "Mall of America in Bloomington";
        if (state.equals("Mississippi")) return "Mississippi State Capitol in Jackson";
        if (state.equals("Missouri")) return "Gateway Arch in St. Louis";
        if (state.equals("Montana")) return "Montana State Capitol in Helena";
        if (state.equals("Nebraska")) return "Nebraska State Capitol in Lincoln";
        if (state.equals("Nevada")) return "Welcome to Las Vegas Sign";
        if (state.equals("New Hampshire")) return "New Hampshire State House in Concord";
        if (state.equals("New Jersey")) return "New Jersey State House in Trenton";
        if (state.equals("New Mexico")) return "New Mexico State Capitol in Santa Fe";
        if (state.equals("New York")) return "Statue of Liberty in New York City";
        if (state.equals("North Carolina")) return "North Carolina State Capitol in Raleigh";
        if (state.equals("North Dakota")) return "North Dakota State Capitol in Bismarck";
        if (state.equals("Ohio")) return "Rock and Roll Hall of Fame in Cleveland";
        if (state.equals("Oklahoma")) return "Oklahoma State Capitol in Oklahoma City";
        if (state.equals("Oregon")) return "Oregon State Capitol in Salem";
        if (state.equals("Pennsylvania")) return "Liberty Bell in Philadelphia";
        if (state.equals("Rhode Island")) return "Rhode Island State House in Providence";
        if (state.equals("South Carolina")) return "South Carolina State House in Columbia";
        if (state.equals("South Dakota")) return "Mount Rushmore National Memorial";
        if (state.equals("Tennessee")) return "Grand Ole Opry in Nashville";
        if (state.equals("Texas")) return "The Alamo in San Antonio";
        if (state.equals("Utah")) return "Utah State Capitol in Salt Lake City";
        if (state.equals("Vermont")) return "Vermont State House in Montpelier";
        if (state.equals("Virginia")) return "Virginia State Capitol in Richmond";
        if (state.equals("Washington")) return "Space Needle in Seattle";
        if (state.equals("West Virginia")) return "West Virginia State Capitol in Charleston";
        if (state.equals("Wisconsin")) return "Wisconsin State Capitol in Madison";
        if (state.equals("Wyoming")) return "Wyoming State Capitol in Cheyenne";
        
        return "Unknown Location";
    }
    
    private String getStateFactByState() {
        if (state.equals("Alabama")) return "Alabama was the first state to declare Christmas a legal holiday in 1836.";
        if (state.equals("Alaska")) return "Alaska has over 3 million lakes and more coastline than the rest of the United States combined.";
        if (state.equals("Arizona")) return "Arizona is home to the Grand Canyon, one of the Seven Natural Wonders of the World.";
        if (state.equals("Arkansas")) return "Arkansas is home to the only active diamond mine in the United States.";
        if (state.equals("California")) return "California produces over 80% of the world's almonds and is home to Silicon Valley.";
        if (state.equals("Colorado")) return "Colorado contains 75% of the land area of the U.S. with an altitude over 10,000 feet.";
        if (state.equals("Connecticut")) return "Connecticut is home to the first hamburger, Polaroid camera, color television, and helicopter.";
        if (state.equals("Delaware")) return "Delaware was the first state to ratify the United States Constitution in 1787.";
        if (state.equals("Florida")) return "Florida has the longest coastline in the contiguous United States at 1,350 miles.";
        if (state.equals("Georgia")) return "Georgia was named after King George II of England and was established in 1732.";
        if (state.equals("Hawaii")) return "Hawaii is the only U.S. state made up entirely of islands and it grows 10 million pineapples each year.";
        if (state.equals("Idaho")) return "Idaho produces about one-third of the potatoes grown in the United States.";
        if (state.equals("Illinois")) return "Illinois is known as the 'Land of Lincoln' and Chicago's O'Hare Airport is one of the world's busiest.";
        if (state.equals("Indiana")) return "Indiana is famous for the Indianapolis 500, the world's oldest auto race, first held in 1911.";
        if (state.equals("Iowa")) return "Iowa produces more corn than any other state in the country.";
        if (state.equals("Kansas")) return "Kansas grows more wheat than any other state in the United States.";
        if (state.equals("Kentucky")) return "Kentucky is home to the world-famous Kentucky Derby horse race, held annually since 1875.";
        if (state.equals("Louisiana")) return "Louisiana is the only state with parishes instead of counties and has a legal system based on French and Spanish codes.";
        if (state.equals("Maine")) return "Maine produces 99% of all wild blueberries in the United States.";
        if (state.equals("Maryland")) return "Maryland is home to the United States Naval Academy in Annapolis.";
        if (state.equals("Massachusetts")) return "Massachusetts is home to the first public beach, public park, and public library in the United States.";
        if (state.equals("Michigan")) return "Michigan has the longest freshwater coastline in the world and is surrounded by four of the five Great Lakes.";
        if (state.equals("Minnesota")) return "Minnesota has more than 10,000 lakes and is the northernmost state in the contiguous United States.";
        if (state.equals("Mississippi")) return "Mississippi is the birthplace of blues music and Elvis Presley.";
        if (state.equals("Missouri")) return "Missouri is known as the 'Show Me State' and is home to the Gateway Arch, the tallest arch in the world.";
        if (state.equals("Montana")) return "Montana has more grizzly bears than any other state in the contiguous United States.";
        if (state.equals("Nebraska")) return "Nebraska is home to the largest indoor rainforest in the United States, the Lied Jungle.";
        if (state.equals("Nevada")) return "Nevada is the largest gold-producing state in the United States.";
        if (state.equals("New Hampshire")) return "New Hampshire was the first state to have its own state constitution, adopted in 1776.";
        if (state.equals("New Jersey")) return "New Jersey has the highest population density of any U.S. state.";
        if (state.equals("New Mexico")) return "New Mexico has more PhDs per capita than any other state due to the many research facilities and government labs.";
        if (state.equals("New York")) return "New York City is home to over 8 million people, making it the most populous city in the United States.";
        if (state.equals("North Carolina")) return "North Carolina was the site of the Wright brothers' first successful airplane flight in 1903.";
        if (state.equals("North Dakota")) return "North Dakota produces more honey than any other state in the nation.";
        if (state.equals("Ohio")) return "Ohio is known as the 'Birthplace of Aviation' as the Wright brothers were from Dayton.";
        if (state.equals("Oklahoma")) return "Oklahoma has more man-made lakes than any other state, with over 200.";
        if (state.equals("Oregon")) return "Oregon has more ghost towns than any other state in the country.";
        if (state.equals("Pennsylvania")) return "Pennsylvania is where the Declaration of Independence and U.S. Constitution were signed.";
        if (state.equals("Rhode Island")) return "Rhode Island is the smallest state in the United States, but has the longest official name: 'State of Rhode Island and Providence Plantations'.";
        if (state.equals("South Carolina")) return "South Carolina is home to the oldest landscaped gardens in America, Middleton Place, established in 1741.";
        if (state.equals("South Dakota")) return "South Dakota is home to Mount Rushmore, which features the faces of four U.S. presidents.";
        if (state.equals("Tennessee")) return "Tennessee is known as the 'Volunteer State' and is famous for its country music scene in Nashville.";
        if (state.equals("Texas")) return "Texas was an independent republic before joining the United States and is the second largest state by area.";
        if (state.equals("Utah")) return "Utah has the highest literacy rate in the United States.";
        if (state.equals("Vermont")) return "Vermont was the first state admitted to the Union after the original 13 colonies.";
        if (state.equals("Virginia")) return "Virginia is known as the 'Mother of Presidents' as eight U.S. presidents were born there.";
        if (state.equals("Washington")) return "Washington produces more apples than any other state in the country.";
        if (state.equals("West Virginia")) return "West Virginia formed during the Civil War when it separated from Virginia due to opposing views on secession.";
        if (state.equals("Wisconsin")) return "Wisconsin is known as 'America's Dairyland' and is the top producer of cheese in the United States.";
        if (state.equals("Wyoming")) return "Wyoming was the first state to grant women the right to vote in 1869.";
        
        return "No fact available for this state.";
    }
    
    private String getStateHintByState() {
        if (state.equals("Alabama")) return "This southern state is known for cotton production and civil rights history.";
        if (state.equals("Alaska")) return "This is the largest U.S. state by area and is separated from the mainland.";
        if (state.equals("Arizona")) return "This southwestern state contains the Grand Canyon and desert landscapes.";
        if (state.equals("Arkansas")) return "This state contains Hot Springs National Park and the Ozark Mountains.";
        if (state.equals("California")) return "This state has Hollywood, Silicon Valley, and is known for its beaches.";
        if (state.equals("Colorado")) return "This state has the Rocky Mountains and is known for skiing and outdoor activities.";
        if (state.equals("Connecticut")) return "This small New England state is known for Yale University and insurance companies.";
        if (state.equals("Delaware")) return "This is the second smallest state and was the first to ratify the Constitution.";
        if (state.equals("Florida")) return "This southeastern state has theme parks, beaches, and the Everglades.";
        if (state.equals("Georgia")) return "This southern state is known for peaches and has Atlanta as its capital.";
        if (state.equals("Hawaii")) return "This state consists entirely of islands and is known for tourism and volcanoes.";
        if (state.equals("Idaho")) return "This northwestern state is famous for potatoes and has mountainous terrain.";
        if (state.equals("Illinois")) return "This midwestern state has Chicago as its largest city and is known as the 'Land of Lincoln'.";
        if (state.equals("Indiana")) return "This midwestern state hosts the Indianapolis 500 auto race.";
        if (state.equals("Iowa")) return "This midwestern state is known for corn production and the first presidential caucuses.";
        if (state.equals("Kansas")) return "This midwestern state is known for wheat production and is mostly flat prairie land.";
        if (state.equals("Kentucky")) return "This state is famous for horse racing, bourbon, and fried chicken.";
        if (state.equals("Louisiana")) return "This southern state is known for Mardi Gras, jazz music, and Cajun culture.";
        if (state.equals("Maine")) return "This northeastern state is known for lobsters and has a rocky coastline.";
        if (state.equals("Maryland")) return "This mid-Atlantic state surrounds much of the Chesapeake Bay.";
        if (state.equals("Massachusetts")) return "This New England state is home to Harvard, MIT, and Cape Cod.";
        if (state.equals("Michigan")) return "This state is shaped like a mitten and is surrounded by the Great Lakes.";
        if (state.equals("Minnesota")) return "This northern state has over 10,000 lakes and is known for cold winters.";
        if (state.equals("Mississippi")) return "This southern state shares its name with the longest river in the U.S.";
        if (state.equals("Missouri")) return "This midwestern state has the Gateway Arch in its city of St. Louis.";
        if (state.equals("Montana")) return "This northwestern state is known for its mountains and vast open spaces.";
        if (state.equals("Nebraska")) return "This midwestern state is known for agriculture and the College World Series.";
        if (state.equals("Nevada")) return "This western state contains Las Vegas and is mostly desert.";
        if (state.equals("New Hampshire")) return "This small New England state has the motto 'Live Free or Die'.";
        if (state.equals("New Jersey")) return "This densely populated state is between New York City and Philadelphia.";
        if (state.equals("New Mexico")) return "This southwestern state has a strong Native American and Hispanic heritage.";
        if (state.equals("New York")) return "This northeastern state has the largest city in the U.S.";
        if (state.equals("North Carolina")) return "This southeastern state has the Outer Banks and Research Triangle.";
        if (state.equals("North Dakota")) return "This northern plains state has booming oil production.";
        if (state.equals("Ohio")) return "This midwestern state is known as the 'Buckeye State'.";
        if (state.equals("Oklahoma")) return "This south-central state has Native American heritage and is known for oil.";
        if (state.equals("Oregon")) return "This Pacific Northwest state is known for rain, forests, and its largest city Portland.";
        if (state.equals("Pennsylvania")) return "This northeastern state is where the Declaration of Independence was signed.";
        if (state.equals("Rhode Island")) return "This is the smallest U.S. state by area.";
        if (state.equals("South Carolina")) return "This southeastern state is known for its beaches and Charleston's historic district.";
        if (state.equals("South Dakota")) return "This midwestern state has Mount Rushmore and the Badlands.";
        if (state.equals("Tennessee")) return "This southern state is known for country music and the Great Smoky Mountains.";
        if (state.equals("Texas")) return "This is the second largest state by area and was once an independent republic.";
        if (state.equals("Utah")) return "This western state has the Great Salt Lake and many national parks.";
        if (state.equals("Vermont")) return "This New England state is known for maple syrup and fall foliage.";
        if (state.equals("Virginia")) return "This state is known as the 'Mother of Presidents' and has colonial history.";
        if (state.equals("Washington")) return "This Pacific Northwest state has Mount Rainier and the city of Seattle.";
        if (state.equals("West Virginia")) return "This Appalachian state is known for coal mining and beautiful mountains.";
        if (state.equals("Wisconsin")) return "This midwestern state is known for cheese production and the Green Bay Packers.";
        if (state.equals("Wyoming")) return "This western state has Yellowstone National Park and is the least populous state.";
        
        return "No hint available for this state.";
    }
}