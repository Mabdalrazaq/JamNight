# JamNight
JamNight is a command-line application where you have multiple bands, each with its own set of musicians.
These bands lose one musician every night and assign another.

## Getting Started
This project is not deployed, but you can easily set it on your local device following these steps:
1. clone this project on your local device
1. download and install java jdk 14 from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
1. download and install maven from [here](https://maven.apache.org/)
1. mark jdk 14 as the project sdk
1. build the project with maven
1. Compile and run the Starter class
1. Have Fun!

## How to run
The application starts with a toy database already defined, and you can execute the following commands:

- **play**: to make some random transforming between bands, each band loses a member and assign a new one.
    
- **list**: to see the current structure of bands and musicians.

- **exit**: to exit the application
            
## How to define your own database of bands and musicians
In the folder called "json", in the root directory, there are 2 files: "bands.json" and "bandless.json".
These 2 files define the structure of the bands in the database, and the structure of the musicians without bands (bandless).
You can change the files based on your needs to have your own unique database.

## Authors
Mohammad Abdallah