# SUREFIRE-1520
Sample projects reproducing bug, workaround and solution by using maven profiles

#####  shows the initial bug:
mvn test -P broken

##### worksaround the bug by adding surefire-logger-api as regular dependency
mvn test -P broken,workaround

##### fix by not using plugin dependencies
mvn test -P fixed
