plugins {
    java
    kotlin("jvm")
    application
}

application {
    mainClassName = "com.github.qiuzhanghua.learn.ExtensionsKt"
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
    testCompile("junit", "junit", "${Deps.junitVersion}")
}
