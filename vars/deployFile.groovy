def call(String BUILD_NUMBER, String IP_ADDRESS) {
sh 'curl -L -u "${ARTIFACTORY_CREDENTIALS_USR}:${ARTIFACTORY_CREDENTIALS_PSW}" -O "http://IP_ADDRESS:8082/artifactory/hello-world-war-libs-release/com/efsavage/hello-world-war/${BUILD_NUMBER}/hello-world-war-${BUILD_NUMBER}.war"'
      sh 'sudo cp hello-world-war-${BUILD_NUMBER}.war /opt/tomcat/apache-tomcat-10.1.34/webapps/'
     sh 'sudo bash /opt/tomcat/apache-tomcat-10.1.34/bin/shutdown.sh'
     sh 'sudo bash /opt/tomcat/apache-tomcat-10.1.34/bin/startup.sh'
}
