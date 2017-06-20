# README #

This README would normally document whatever steps are necessary to get your application up and running.

### What is this repository for? ###

* Quick summary
* Version
* [Learn Markdown](https://bitbucket.org/tutorials/markdowndemo)

### How do I get set up? ###

* Summary of set up
* Configuration
* Dependencies
* Database configuration
* How to run tests
* Deployment instructions

### Contribution guidelines ###

* Writing tests
* Code review
* Other guidelines

### Who do I talk to? ###

* Repo owner or admin
* Other community or team contact

How to run:
    -run Docker
    -execute: gradle build distDocker --refresh-dependencies
    -execute next to create containers on docker: docker run --expose 1111 -p 1111:1111 -it com.area/registration-service:1.0
    -execute next to start applications: docker docker run --expose 1111 -p 1111:1111 -it com.area/registration-service:1.0
                     docker run --expose 2222 -p 2222:2222 -it com.area/location-service:1.0