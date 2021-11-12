FROM ubuntu:20.04
RUN sed -i s@/archive.ubuntu.com/@/mirrors.aliyun.com/@g /etc/apt/sources.list
RUN apt-get update
RUN apt-get --no-install-recommends install -y openjdk-8-jre-headless
RUN rm -rfv /var/lib/apt/lists/*