# Java Stock Repo (iditex)

A Java Servlet web app that runs on Google App Engine. It includes a home page and a servlet that evaluates a simple math expression and returns the result as HTML.

## What’s in the project

- Home page: `war/index.html` — greeting and a link to the exercise
- Servlet: `IditexServlet` — computes `(4 + 3) * 7` and writes the result as HTML
- App Engine config: application `javaiditwein`, version `2`

## Folder structure

```
src/com/myorg/javacourse/   Java source (servlets)
src/META-INF/               JPA / JDO configuration
war/                        Web app content
war/WEB-INF/                web.xml, appengine-web.xml, libraries
```

## Run locally

This is an Eclipse project that uses the Google Plugin for Eclipse / App Engine SDK.

1. Open the project in Eclipse.
2. Make sure the Google App Engine Java SDK is installed and configured.
3. Run as a Web Application.
4. In the browser:
   - Home page: `http://localhost:8888/`
   - Exercise: `http://localhost:8888/iditex`

## Endpoints

| Path      | Description                         |
|-----------|-------------------------------------|
| `/`       | Home page (`index.html`)            |
| `/iditex` | `IditexServlet` — math exercise     |

## Tech stack

- Java Servlets (Java EE 2.5)
- Google App Engine Java SDK 1.9.17
- Eclipse (GAE / GDT natures)
- JPA / DataNucleus (configured, not used in application code yet)

## License

Course / practice project.
