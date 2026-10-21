def call(String url, String branch, String credsId){
  checkout scmGit(branches: [[name: "${branch}"]], extensions: [], 
                  userRemoteConfigs: [[credentialsId: "{credsId}", url:"${url}"]])
}
