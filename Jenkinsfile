 
   pipeline {
    agent any
    tools{
     maven 'Maven 3.5.0'
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
