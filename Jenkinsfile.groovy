pipeline{
    agent any
    stages{
        stage('Init'){
                setps{
                    echo "Testing...."
                }
        }

        stage('Build'){
            setps{
                    echo "Building...."
                }
        }

        stage('Deploy'){
            setps{
                    echo "Code Deployed...."
                }
        }
    }
}