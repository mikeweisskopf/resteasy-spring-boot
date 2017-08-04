# This app exists to demonstrate performance chagnes between Spring Boot 1.3.3 and 1.5.3

To run a test do the following:

1. build the project locally with "mvn -Pdockerize clean package"
1. tag your new docker image
1. modify the .env file (update the name of the test, your new docker image tag, and the duration)
1. start docker (docker-compose up -d)
1. wait till the test finishes (based on the duration you set)
1. stop docker (docker-compose down)
1. analyize the jmeter test results (there will be a "testdata" directory containing a jtl file with the name you set for the test)
