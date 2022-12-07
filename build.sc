import mill._, scalalib._

val spinalVersion = "1.8.0"

object projectname extends SbtModule {
  def scalaVersion = "2.12.16"
  override def millSourcePath = os.pwd / "hw" / "spinal"
  
  def ivyDeps = Agg(
    ivy"com.github.spinalhdl::spinalhdl-core:$spinalVersion",
    ivy"com.github.spinalhdl::spinalhdl-lib:$spinalVersion"
  )
  def scalacPluginIvyDeps = Agg(ivy"com.github.spinalhdl::spinalhdl-idsl-plugin:$spinalVersion")

  object test extends Tests with TestModule.ScalaTest {
    def ivyDeps = Agg(ivy"com.github.spinalhdl::spinalhdl-tester:$spinalVersion")
  }
}
