FROM b2b.gomerepo.io:5000/oversea/java8
MAINTAINER xnew
ADD @project.build.finalName@.jar @project.build.finalName@.jar
#RUN sh -c 'touch /@project.build.finalName@.jar'
ENV JAVA_OPTS=""
CMD exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=docker -jar /@project.build.finalName@.jar