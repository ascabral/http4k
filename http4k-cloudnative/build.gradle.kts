description = "Machinery for running Http4k apps in cloud-native environments"

dependencies {
    api(project(":http4k-core"))
    implementation(project(":http4k-format-jackson-yaml"))
    testImplementation(project(path = ":http4k-core", configuration ="testArtifacts"))
    testImplementation(project(":http4k-testing-hamkrest"))
    testImplementation(project(":http4k-format-argo"))
}
