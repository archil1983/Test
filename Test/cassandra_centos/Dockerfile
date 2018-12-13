FROM centos/cassandra-311-centos7
USER root
RUN echo -e 'ls -l' > /usr/bin/ll && chmod +x /usr/bin/ll
RUN sed -i '$ d' /usr/bin/run-cassandra
RUN echo 'exec cassandra -R' >> /usr/bin/run-cassandra
ENV CASSANDRA_ADMIN_PASSWORD cassandra
RUN yum install -y wget && yum install -y htop && yum install -y mc && yum install -y less && yum install -y vim
ENTRYPOINT run-cassandra && /bin/bash

