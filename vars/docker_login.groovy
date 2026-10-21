def call(String CredId){
withCredentials([usernamePassword(
    credentialsId: "${CredId}",
    usernameVariable: 'USERNAME',
    passwordVariable: 'PASSWORD')]) 
    {
      sh 'docker login -u $USERNAME -p $PASSWORD'
    } 
}
