 pipeline {
    
 
    agent any

		stages 
		{
 	
			stage('SCM Checkout') 
			{
				steps 
				{
               
                bat 'mvn clean'
				git "https://github.com/TanumayDhar/MRScucumberfrmaework.git"
                
				}
			}
			stage('Static Analysis') 
			{
				steps 
				{
             
          
       			echo 'Scanning project with SonarQube analyser'
				//bat 'mvn clean package sonar:sonar'
				bat 'mvn sonar:sonar'
                
                
				}
			}
			stage('Testing with Cucumber framework') 
			{
				steps 
				{
            
				echo 'Test and Deploying in server...'
				//bat 'mvn test -Dtest=TestRunner test'
				bat 'mvn test'
            
				}
			}
			 
		}
		post {
				emailext (
    subject: "Job '${env.JOB_NAME} ${env.BUILD_NUMBER}'",
    body: """<p>Check console output at <a href="${env.BUILD_URL}">${env.JOB_NAME}</a></p>""",
    to: "dhartanumay@gmail.com",
    from: "dhartanumay@gmail.com"
)
}
