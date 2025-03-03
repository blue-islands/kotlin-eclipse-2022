Enhanced Kotlin for Eclipse
==============

This plugin based on [JetBrains Kotlin plugin](https://github.com/JetBrains/kotlin-eclipse) and contains small enhancements. These enhancements mostly related to adaptations for latest versions of Java, Eclipse and so on.

Update sites description

Update-site URL | Description
----------------|------------
https://s3.eu-central-1.amazonaws.com/github.bvfalcon/kotlin-eclipse-repo/ | **Kotlin for Eclipse 2020-09 and later**
&nbsp; | &nbsp;
https://s3.eu-central-1.amazonaws.com/github.bvfalcon/kotlin-eclipse/eclipse-releases/2023-03/ | Last version Kotlin for Eclipse 2023-03
https://s3.eu-central-1.amazonaws.com/github.bvfalcon/kotlin-eclipse/eclipse-releases/2022-12/ | Last version Kotlin for Eclipse 2022-12
https://s3.eu-central-1.amazonaws.com/github.bvfalcon/kotlin-eclipse/eclipse-releases/2022-09/ | Last version Kotlin for Eclipse 2022-09
https://s3.eu-central-1.amazonaws.com/github.bvfalcon/kotlin-eclipse/eclipse-releases/2022-06/ | Last version Kotlin for Eclipse 2022-06
https://s3.eu-central-1.amazonaws.com/github.bvfalcon/kotlin-eclipse/eclipse-releases/2022-03/ | Last version Kotlin for Eclipse 2022-03
https://s3.eu-central-1.amazonaws.com/github.bvfalcon/kotlin-eclipse/eclipse-releases/2021-12/ | Last version Kotlin for Eclipse 2021-12
https://s3.eu-central-1.amazonaws.com/github.bvfalcon/kotlin-eclipse/eclipse-releases/2021-09/ | Last version Kotlin for Eclipse 2021-09
https://s3.eu-central-1.amazonaws.com/github.bvfalcon/kotlin-eclipse/eclipse-releases/2021-06/ | Last version Kotlin for Eclipse 2021-06
https://s3.eu-central-1.amazonaws.com/github.bvfalcon/kotlin-eclipse/eclipse-releases/2021-03/ | Last version Kotlin for Eclipse 2021-03
https://s3.eu-central-1.amazonaws.com/github.bvfalcon/kotlin-eclipse/eclipse-releases/2020-12/ | Last version Kotlin for Eclipse 2020-12
https://s3.eu-central-1.amazonaws.com/github.bvfalcon/kotlin-eclipse/eclipse-releases/2020-03/ | Last version Kotlin for Eclipse 2020-03
https://s3.eu-central-1.amazonaws.com/github.bvfalcon/kotlin-eclipse/versions/0.8.20/ | Version 0.8.20 Kotlin for Eclipse 2020-03

#### Build from source

To build from source run command: `mvn clean && mvn clean validate -Pwith-gradle -pl kotlin-bundled-compiler && mvn package`

After build was successfully finished update-site will be located in directory `kotlin-eclipse-p2updatesite/target/repository`
