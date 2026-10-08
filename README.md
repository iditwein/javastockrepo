

A Java web application for Google App Engine, set up as an Eclipse project. The home page links to a math exercise, and the servlet returns the result as HTML.


The App Engine application id is `javaiditwein`, version `2`.


## What the app does


- `war/index.html` — a welcome page titled "Hello Idit" with a link to the exercise.
- `/iditex` — `IditexServlet` computes `(4 + 3) * 7` and returns the result (`49`) inside an HTML heading.


## Layout


```
src/com/myorg/javacourse/IditexServlet.java   servlet
src/META-INF/persistence.xml                 JPA settings (App Engine template)
src/META-INF/jdoconfig.xml                   JDO settings (App Engine template)
war/index.html                               home page
war/WEB-INF/web.xml                          servlet mapping
war/WEB-INF/appengine-web.xml                App Engine settings
```


The servlet is mapped in `web.xml` to `/iditex`. The JPA and JDO files come from the App Engine project template; the current servlet does not use the Datastore.


## Environment


- Java 1.7
- Servlet 2.5
- Google App Engine Java SDK 1.9.17
- Eclipse with the Google Plugin for Eclipse


Compiled classes are written to `war/WEB-INF/classes` (that directory is not kept in git).


## Run locally


1. Import the project into Eclipse (`File` → `Import` → `Existing Projects into Workspace`).
2. Make sure the Google Plugin for Eclipse and the App Engine SDK are installed.
3. Right-click the project → `Run As` → `App Engine`.
4. Open the home page in a browser, then follow **Exercise 02 - Math** (`/iditex`).


## Deploy


Deploy from Eclipse: right-click the project → `Google` → `Deploy to App Engine`. The target is set in `war/WEB-INF/appengine-web.xml` (`javaiditwein`, version `2`).


