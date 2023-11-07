def call(String MavenCommand) {
def Maven = tool name: 'Maven-3.9.5', type: 'maven'
  if ("${MavenCommand}" == "Clean" ) {
    sh "${Maven}/bin/mvn clean"
  }
  else if ("${MavenCommand}" == "Validate") {
    sh "${Maven}/bin/mvn clean validate"
  }
  else if ("${MavenCommand}" == "Package") {
    sh "${Maven}/bin/mvn clean package"
  }
  else if ("${MavenCommand}" == "Install") {
    sh "${Maven}/bin/mvn clean install"
  }
  else if ("${MavenCommand}" == "Sonar") {
    sh "${Maven}/bin/mvn clean package sonar:sonar"
  }
}
