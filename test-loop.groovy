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
    }
}