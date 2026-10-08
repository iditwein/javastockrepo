# javastockrepo (iditex)

אפליקציית Java ל־Google App Engine מקורס Java. הפרויקט כולל דף בית ו־Servlet שמחשב ביטוי מתמטי ומציג את התוצאה בדפדפן.

## מה הפרויקט עושה

- דף פתיחה ב־`/` עם קישור לתרגיל.
- Servlet בכתובת `/iditex` שמחשב `(4 + 3) * 7` ומחזיר HTML עם התוצאה.

## טכנולוגיות

- Java Servlet (`javax.servlet`)
- Google App Engine (Java)
- Eclipse Web Tools / Google Plugin for Eclipse
- JPA / JDO (הגדרות persistence קיימות, עדיין לא בשימוש בלוגיקה)

מזהה האפליקציה ב־App Engine: `javaiditwein` (גרסה 2).

## מבנה הפרויקט

```
src/
  com/myorg/javacourse/IditexServlet.java   # Servlet התרגיל
  META-INF/persistence.xml                  # JPA
  META-INF/jdoconfig.xml                    # JDO
  log4j.properties
war/
  index.html                                # דף הבית
  WEB-INF/
    web.xml                                 # מיפוי Servlet
    appengine-web.xml                       # הגדרות App Engine
    logging.properties
```

## הרצה מקומית

הפרויקט בנוי כפרויקט Eclipse + App Engine.

1. התקינו Eclipse עם Google Plugin for Eclipse ו־App Engine SDK.
2. ייבאו את התיקייה כפרויקט קיים (`File → Import → Existing Projects into Workspace`).
3. הריצו את האפליקציה כ־Web Application.
4. בדפדפן:
   - דף הבית: `http://localhost:8888/`
   - התרגיל: `http://localhost:8888/iditex`

## Endpoints

| נתיב     | תיאור                                      |
|----------|---------------------------------------------|
| `/`      | דף הבית (`index.html`)                      |
| `/iditex`| `IditexServlet` — תרגיל 02 (חישוב מתמטי)   |

## קוד רלוונטי

ה־Servlet ממופה ב־`war/WEB-INF/web.xml` למחלקה `com.myorg.javacourse.IditexServlet`.
