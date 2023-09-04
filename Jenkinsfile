 pipeline { 

    agent any 

    stages { 

        stage('git repo & clean') { 

            steps { 

                script { 

                    // Check if directory exists before removing it 

                    if (fileExists('Teamazure')) { 

                        bat "rmdir /s /q Teamazure" 

                    } 

                     

                    bat "git clone https://github.com/Mahajayanthi/Teamazure.git" 

                    bat "mvn clean -f Teamazure" 

                } 

            } 

        } 

        stage('install') { 

            steps { 

                bat "mvn install -f Teamazure" 

            } 

        } 

        stage('test') { 

            steps { 

                bat "mvn test -f Teamazure" 

            } 

        } 

        stage('package') { 

            steps { 

                bat "mvn package -f Teamazure" 

            } 

        } 

    } 

} 

 

def fileExists(String path) { 

    try { 

        fileExists = new File(path).isDirectory() 

    } catch (Exception e) { 

        fileExists = false 

    } 

    return fileExists 

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
