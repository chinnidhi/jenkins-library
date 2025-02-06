def call() {
      sh '''
          echo "<settings>
                  <servers>
                      <server>
                        <id>hello-world-war</id>
                        <username>$ARTIFACTORY_CREDENTIALS_USR</username>
                        <password>$ARTIFACTORY_CREDENTIALS_PSW</password>
                      </server>
                      </servers>
                </settings>" > ~/.m2/settings.xml 
                '''
  sh 'mvn clean deploy'
}
