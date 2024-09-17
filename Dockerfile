docker pull mysql
docker run --name mysql-container -p 3307:3307 -e MYSQL_ROOT_PASSWORD=root -d mysql:latest