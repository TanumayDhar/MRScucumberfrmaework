 pipeline {
    
 
    agent any

		stages 
		{
 	
			stage('SCM Checkout') 
			{
				steps 
				{
               
               
				git "https://github.com/TanumayDhar/MRScucumberfrmaework.git"
                
				}
			}
			stage('Static Analysis') 
			{
				steps 
				{
             
          
       			echo 'Scanning project with SonarQube analyser'
				bat 'mvn clean package sonar:sonar'
                
                
				}
			}
			stage('Testing with Cucumber framework') 
			{
				steps 
				{
            
				echo 'Test and Deploying in server...'
				bat 'mvn test -Dtest=runner test'
            
				}
			}
		}
}
 
 