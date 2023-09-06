pipeline {
    agent any
    triggers {
        pollSCM('* * * * *') // Poll the SCM (Git) every minut
    }
    tools{
     maven 'Maven2'
    }

    stages {
      
                        
        stage('Stage') {
             
            steps {
                
             bat "mvn clean"
                echo 'Build start'
           
        }
        }
     stage('Build') {
            steps {
             bat "mvn install"
                echo 'Build complete'
            }
            post{
                success{
                    echo "Archieve";
                    archiveArtifacts artifacts: '**/target/*.war'
                }
            }
        }
        stage('Deploy'){
            steps{
                deploy adapters: [tomcat9(credentialsId: 'tomcat', path: '', url: 'http://localhost:9090/')], contextPath: null, war: '**/*.war'
            }
            
        }
    }
                  
    
     post{
            success{
                echo "success $BUILD_URL"
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
