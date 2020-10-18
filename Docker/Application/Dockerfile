FROM centos:7

RUN yum update -y
RUN yum install epel-release java-11-openjdk-devel maven -y

ENV JAVA_HOME /usr/lib/jvm/java-11/
ENV PATH "$JAVA_HOME/bin:$PATH"

RUN mkdir -p /usr/local/Application/release

WORKDIR /usr/local/Application/release
