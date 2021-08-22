# This Dockerfile will deploy sample webapp in tomcat
FROM tomcat:9.0
LABEL maintainer="das_dipanjan@ymail.com"
RUN mv /usr/local/tomcat/webapps /usr/local/tomcat/webapps2
RUN mv /usr/local/tomcat/webapps.dist/ /usr/local/tomcat/webapps
ADD SpringBootDemo.war /usr/local/tomcat/webapps/SpringBootDemo.war
