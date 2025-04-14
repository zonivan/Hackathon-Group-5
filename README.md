# US State GeoGuesser

A simple educational game that helps students learn US geography by guessing states and their capitals using Google Street View.

## Features

- Displays random Google Street View locations from across the United States
- Players guess which state they're in and what the capital is
- Provides immediate feedback on guesses
- Educational tool for learning US geography

## Technologies Used

- Java + Spring Boot for backend
- Thymeleaf for templating
- HTML and CSS for frontend
- Google Maps JavaScript API with Street View

## Setup Instructions

1. Clone this repository
2. Get a Google Maps API key from [Google Cloud Platform](https://console.cloud.google.com/)
3. Replace `YOUR_API_KEY` in `src/main/resources/templates/game.html` with your actual API key
4. Build the project with Maven: `mvn clean install`
5. Run the application: `mvn spring-boot:run`
6. Open your browser and navigate to `http://localhost:8080`

## API Key Requirements

You'll need to enable the following API services in your Google Cloud project:
- Maps JavaScript API
- Street View API

Make sure your API key has appropriate restrictions (HTTP referrers, IP addresses) for security.

## License

This project is created for educational purposes.

## Note for Educators

Feel free to modify the state locations or add more educational content to enhance the learning experience for students.