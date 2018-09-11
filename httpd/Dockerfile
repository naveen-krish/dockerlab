FROM httpd:2.4.27-alpine
RUN apk update && apk add mc apache2 apache2-proxy
COPY $PWD/src/httpd.conf /usr/local/apache2/conf/httpd.conf
COPY $PWD/src/httpd-vhosts.conf  $PWD/src/proxy-html.conf $PWD/src/lbproxy1.conf $PWD/src/lbproxy2.conf /usr/local/apache2/conf/extra/
