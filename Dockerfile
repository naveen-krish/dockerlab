FROM ubuntu:latest
MAINTAINER Naveen

RUN apt-get update
RUN apt-get install -y nginx

RUN rm -v /etc/nginx/nginx.conf

ADD nginx.conf /etc/nginx

ADD web /usr/share/nginx/html

ADD web /var/www/html 

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]


