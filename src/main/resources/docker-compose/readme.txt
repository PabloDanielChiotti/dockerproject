La idea es si alguien lo solicita, pasarle los archivos:
docker-compose.yml
Dockerfile
dockerproject.jar

Una vez tengan los 3 archivos en su máquina deben navegar por la terminal hasta la carpeta y ejecutar el sig comando:
docker-compose up -d

Desde allí ya pueden hacer uso de los dos endpoints disponibles:

curl --location --request POST 'http://localhost:8080/docker-project/employee' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "daniel"
}'

curl --location --request GET 'http://localhost:8080/docker-project/employeeList'

Obviamente por medio de un workbench pueden acceder a la bd y ver allí la información.
