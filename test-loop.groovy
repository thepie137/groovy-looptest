pipeline {
    agent any

    stages {
        stage('Loop Example') {
            steps {
                script {
                    def colors = ['red', 'green', 'blue']

                    // For loop example
                    for (color in colors) {
                        echo "Color: $color"
                    }

                    // For each loop example
                    colors.each { c ->
                        echo "Color (each): $c"
                    }

                    // While loop example
                    def count = 0
                    while (count < 3) {
                        echo "Count: $count"
                        count++
                    }
                }
            }
        }
        stage('Call Shellscript') {
            steps {
                // Set execute permission for the shell script
                script {
                    sh 'chmod +x ./pieshell.sh' // Replace with the name of your shell script
                }
                // Execute the shell script and capture its output
                script {
                    def scriptOutput = sh(script: './pieshell.sh', returnStdout: true).trim()
                    echo "Output from shell script: $scriptOutput"
                }
            }
        }
    }
}
