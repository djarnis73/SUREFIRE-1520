# SUREFIRE-1520
Sample project reproducing bug, workaround and solution by using maven profiles

#####  shows the initial bug is still there with 2.22.0:
mvn test -P broken

##### work around the bug by adding surefire-logger-api as regular dependency:
mvn test -P broken,workaround

##### fix by not using plugin dependencies as described in 2.22.0 surefire documentation:
mvn test -P fixed
