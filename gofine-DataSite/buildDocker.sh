#!/bin/sh
echo "----------------mvn-------install---------"
mvn clean install -Ptest

echo "------------docker-----------install---------"
docker build -t cloud/datasite  server/

echo "------------docker-----------ok---------"
