plugins {
    id("net.minecraftforge.gitpatcher") version "0.10.+"
    id("net.minecraftforge.gradleutils") version "2.+"
}

group = "org.hypejet"
version = gradleutils.tagOffsetVersion

patches {
    submodule = "Velocity"
    patches = File("Velocity-Patches")
    target = File("Rocket")
}