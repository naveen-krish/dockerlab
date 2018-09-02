FROM alpine:latest
MAINTAINER Naveen

RUN apk update && apk add nginx 
COPY  nginx.conf /etc/nginx/conf.d/default.conf
RUN mkdir -p /run/nginx
EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]


