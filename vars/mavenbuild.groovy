def call(String MavenCommand) {
def MavenCommand = tool name: 'Maven-3.9.5', type: 'maven'
  if ("${MavenCommand}" == "Clean" ) {
    sh "${MavenCommand}/bin/mvn clean"
  }
  else if ("${MavenCommand}" == "Validate") {
    sh "${MavenCommand}/bin/mvn clean validate"
  }
  else if ("${MavenCommand}" == "Package") {
    sh "${MavenCommand}/bin/mvn clean package"
  }
  else if ("${MavenCommand}" == "Install") {
    sh "${MavenCommand}/bin/mvn clean install"
  }
  else if ("${MavenCommand}" == "Sonar") {
    sh "${MavenCommand}/bin/mvn clean package sonar:sonar"
  }
}
