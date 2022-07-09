# LibraryManagement

This simple project demonstrates the use of the following technologies.
1. Java
2. MongoDB
3. Integration with MongoDB using MongoRepository
4. Integration with Sonarqube and Jacoco plugin.

Follow the following steps for local integration with Sonaplugin and Jacoco:
1. Download Sonarqube from here: https://www.sonarqube.org/downloads/
2. Go to the downloaded Sonarqube folder -> bin -> Start Sonar
3. Test whether you're able to connect to localhost's running Sonar : https://localhost:9000
4. Put the sonarqube and jacoco plugins as mentioned in pom.xml
5. To install jacoco plugin in java project run: mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install
6. To install sonar plugin in hava project run: mvn sonar:sonar
7. If you face authentication issues in Step-6, disable it by going to the sonar localhost dashboard -> Administration -> Security -> Force User Authentication
