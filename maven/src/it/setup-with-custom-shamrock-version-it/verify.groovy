import org.jboss.shamrock.maven.it.SetupVerifier

String base = basedir
File pomFile = new File(base, "pom.xml")

SetupVerifier.verifySetupWithVersion(pomFile)