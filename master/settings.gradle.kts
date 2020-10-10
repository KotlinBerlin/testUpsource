rootProject.name = "TestUpsourceSubprojects"

include("prj1")
include("prj2")

buildscript {
    val repoUrl: String by settings
    repositories {
        maven(repoUrl)
    }

    dependencies {
        classpath("commons-io:commons-io:2.8.0")
    }
}

for (project in rootProject.children) {
    project.apply {
        buildFileName = "../master/projects/$name.gradle.kts"
        projectDir = file("../$name")

        println(buildFile.absolutePath)
    }
}
