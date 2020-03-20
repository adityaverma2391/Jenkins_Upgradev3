job('First-Maven-Project-Via-DSL') {
    description("First Maven Job generated by DSL on ${new Date()}, the project is small projected hosted on github")
    scm {
        git("https://github.com/adityaverma2391/Jenkins_Upgradev3.git", master)
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('clean package', 'maven-samples/single-module/pom.xml')
    }
    publishers {
        archiveArtifacts '**/*.jar'
    }
}