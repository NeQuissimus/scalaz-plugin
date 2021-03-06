import scalaz.plugin.test._

object Test extends AsmpTest {
  override def extraSettings: String = super.extraSettings ++ " -P:scalaz-plugin:+polyopt"

  override def code = """
    |class Foo[A]()
    |
    |object FooBar {
    |  val boo: Int = 1
    |
    |  def get[A]: Foo[A] = new Foo()
    |
    |  def get1[A](a: A): List[A] = List(a)
    |}
  """.stripMargin

  override def classes = List("FooBar$")
}
