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

// pipeline {
//     agent any
//     stages {
//         stage('Build') {
//             steps {
//                 // Get some code from a GitHub repository
//               //  git 'git@github.com:Yuvashree10/JenkinsBuild.git'

//                 // Run Maven on a Unix agent.
//                // sh "mvn -Dmaven.test.failure.ignore=true clean package"

//                 // To run Maven on a Windows agent, use
//                  //bat "mvn clean"
//                  echo 'Build complete'
//             }

//             // post {
//             //     // If Maven was able to run the tests, even if some of the test
//             //     // failed, record the test results and archive the jar file.
//             //     success {
//             //         junit '**/target/surefire-reports/TEST-*.xml'
//             //         archiveArtifacts 'target/*.jar'
//             //     }
//             // }
//         }
//     }
// }
