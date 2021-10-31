# Schwingen

## How to run db & api

Run the command in root Project directory

    docker-compose up -d

## Release

### Maven release plugin

    mvnw release:update-versions

## Docker

### Build & Push docker images
Build docker images:

    mvnw spring-boot:build-image --projects ./admin,./javadoc -DdockerHub.username=YourDockerHubUsername -DdockerHub.password=YourDockerHubPassword

### Scan docker files

    docker scan YourDockerHubUsername/DockerHubRepository:TagName --dependency-tree

### How to run db & api

Run the command in root Project directory

    docker-compose up -d
