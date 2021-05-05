# JavaSpringRestApiAlgorithms
REST api in Java Spring.

## To build app
1. Go to main directory
2. Execute command 'mvnw clean package'

## To start app locally
1. Go to main directory
2. Execute command 'mvnw spring-boot:run'

## To start app in docker container
1. Go to main directory
2. Execute command 'docker compose up'

## List of all endpoints in app
### API returns JSON in given format: { "result": "" }
1. localhost:8080/api/task1/{int}
App converts the given integer to binary system and returns it as a string.
2. localhost:8080/api/task2/{int}
App converts the given integer to binary system, swithces the digits (0 to 1 and 1 to 0) and returns it in octal system as a string.
3. localhost:8080/api/task3/{int}
App converts the given integer to binary system, reverses the digits (e.g. 100 to 001) and returns it in hexadecimal system as a string.
4. localhost:8080/api/task4/{int}\n
App converts the given integer to binary system, moves all 1s to the left and all 0s to the right and returns it in decimal system as a string.
