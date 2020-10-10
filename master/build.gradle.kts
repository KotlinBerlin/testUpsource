group = "org.example"
version = "1.0-SNAPSHOT"

subprojects {
    val repoUrl: String by project
    repositories {
        maven(repoUrl)
    }
}
