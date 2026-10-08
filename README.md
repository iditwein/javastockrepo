# Java Stock Repository

A Java web application project built with Google App Engine, featuring servlet-based HTTP request handling and data persistence.

## Project Overview

This is a Java-based web application designed to demonstrate basic web servlet functionality and Java web development concepts. The project is configured for deployment on Google App Engine.

## Project Structure

```
javastockrepo/
├── src/
│   ├── com/myorg/javacourse/
│   │   └── IditexServlet.java       # Main servlet handling HTTP requests
│   ├── log4j.properties              # Logging configuration
│   └── META-INF/
│       ├── jdoconfig.xml             # JDO configuration
│       └── persistence.xml           # JPA persistence configuration
├── war/
│   ├── WEB-INF/
│   │   ├── web.xml                   # Web application deployment descriptor
│   │   ├── appengine-web.xml         # App Engine specific configuration
│   │   ├── logging.properties        # Logging properties
│   │   └── lib/                      # External dependencies
│   ├── index.html                    # Main HTML entry point
│   └── favicon.ico                   # Website favicon
└── .settings/                        # Eclipse IDE settings

```

## Technologies & Dependencies

### Core Technologies
- **Java Servlet API** - Web request handling
- **Google App Engine SDK** (v1.9.17) - Cloud deployment platform
- **DataNucleus** (v3.1.3) - Object-relational mapping with JDO/JPA support
- **Java Persistence API (JPA)** - ORM framework
- **Java Data Objects (JDO)** - Object persistence layer

### Key Libraries
- `appengine-api-1.0-sdk-1.9.17.jar` - App Engine API
- `appengine-endpoints.jar` - API endpoint support
- `datanucleus-core-3.1.3.jar` - DataNucleus core engine
- `datanucleus-appengine-2.1.2.jar` - App Engine integration
- `asm-4.0.jar` - Bytecode manipulation framework
- `jdo-api-3.0.1.jar` - JDO specification
- `geronimo-jpa_2.0_spec-1.0.jar` - JPA specification

## Main Components

### IditexServlet
The primary servlet that handles GET requests. It demonstrates basic HTTP response generation by calculating a mathematical expression and returning the result as HTML.

**Functionality:**
- Performs a simple calculation: `(4 + 3) * 7 = 77`
- Returns the result as formatted HTML

## Setup & Configuration

### Prerequisites
- Java Development Kit (JDK) 7 or higher
- Google App Engine Java SDK 1.9.17
- Eclipse IDE with Google Plugin for Eclipse (optional)

### Configuration Files

**appengine-web.xml** - Configures App Engine deployment settings
**web.xml** - Defines servlet mappings and application structure
**persistence.xml** - JPA provider configuration
**jdoconfig.xml** - JDO configuration for data persistence
**log4j.properties** - Logging framework settings

## Building & Deployment

### Build
The project uses Eclipse with the Google App Engine plugin. Build artifacts are generated in the `war` directory.

### Deployment
To deploy to Google App Engine:
1. Ensure you have the Google App Engine SDK installed
2. Configure your App Engine application ID in `appengine-web.xml`
3. Use the App Engine deployment tools or the `appcfg.py` command

## Logging

The project uses Log4j for logging configuration. See `src/log4j.properties` for logging settings.

## Development Notes

- The project follows the standard Java web application structure with source files in `src/` and web resources in `war/`
- Uses DataNucleus for object persistence with support for both JDO and JPA
- Designed for App Engine's scalable cloud infrastructure

## License

This is an educational project for Java course materials.

## Author

Created as part of the MyOrg Java Course project.
