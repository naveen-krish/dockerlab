# dockerlab


This example runs a postgresql with named volume and multiple Springboot crud applications connect to this db container for persistency.
----------------------------------------------------------------------------------------------------------------------------------------

# Start a postgresql container with a user defined virutal network with net-alias. 
# It is required for the containers running in the same network to speak to the postgresql db for persistency. 
# CMD

docker container run  -p 5432:5432  --name postgres--net mylabnetwork -d  --net-alias postgres -v psql-data:/var/lib/postgres
ql/data postgres # It fetchtes the latest postgresql

# Build the Springboot image
docker image build  -f SpringBootPostgresDockerfile -t naveenkrishiv/spbootpostgres .

# Start the Springboot container in the same subnet virtual network
# This Springboot app talks to the postgres container through net-alias name in the Spring postgresql configuration
docker container run --name spbootpostgres --net mylabnetwork -p 8080:36000 naveenkrishiv/spbootpostgres:latest
