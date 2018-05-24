pipeline{
    tools{
        maven 'M3'
    }
    agent any
    stages{
        stage('Test'){
            steps{
                sh "https://github.com/Jose12JC/tic-tac-toe-enunciado; mvn test -l out.log "
            }
        }
    }
    post{
        always{
            archive "https://github.com/Jose12JC/tic-tac-toe-enunciado/out.log"
        }
    }
}
