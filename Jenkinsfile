pipeline {
    agent any
    tools{
     maven 'Maven2'
    }

    stages {
        stage('Stage') {
            steps {
             bat "mvn clean"
                echo 'Build started'
            }
        }
     stage('Build') {
            steps {
             bat "mvn install"
                echo 'Build completed'
            }
          
        }
        stage('Test') {
            steps {
             bat "mvn test"
                echo 'Test completed'
            }
          
        }
        stage('Deploy'){
            steps{
                deploy adapters: [tomcat9(credentialsId: 'Tomcat', path: '', url: 'http://localhost:8282/')], contextPath: null, war: '**/*.war' 
                echo 'Deployment completed'
            }
             
        }
    }
      post{
                success{
                    echo "Your Application Deployed Successfully";
                    //archiveArtifacts artifacts: '**/target/*.war'
                }
            }
}
