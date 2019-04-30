sudo yum update
sudo yum install git 
sudo yum install maven 
git clone "https://github.com/ccoa/prueba-cliente" 
mvn clean install 
mvn package spring-boot:repackage 
java -jar target\
