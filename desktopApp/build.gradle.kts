import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    //kotlinx.serialization
    kotlin("plugin.serialization") version "2.4.10"
}

dependencies {
    implementation(project(":shared"))

    implementation(compose.desktop.currentOs)
    implementation(libs.kotlinx.coroutinesSwing)

    implementation(libs.compose.uiToolingPreview)
    implementation(libs.androidx.lifecycle.viewmodel.desktop)

    // ktor connection
    val ktorVersion = "3.5.1"
    implementation("io.ktor:ktor-client-core:${ktorVersion}")
    implementation("io.ktor:ktor-client-cio:${ktorVersion}")
    // kotlinx.serialization
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.11.0")
}

compose.desktop {
    application {
        mainClass = "com.joaoat.library_frontend_compose_kt.MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "com.joaoat.library_frontend_compose_kt"
            packageVersion = "1.0.0"
        }
    }
}