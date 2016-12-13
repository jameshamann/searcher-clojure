FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/searcher-clojure.jar /searcher-clojure/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/searcher-clojure/app.jar"]
