node('linux')
{
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/ZOSOpenTools/getoptport.git'), string(name: 'PORT_DESCRIPTION', value: 'An options parser' )]
  }
}
