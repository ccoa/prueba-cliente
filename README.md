sudo yum update <br />
sudo yum install git <br />
sudo yum install maven <br />
git clone "https://github.com/ccoa/prueba-cliente" <br />
mvn clean install <br />
mvn package spring-boot:repackage <br />
java -jar target\
