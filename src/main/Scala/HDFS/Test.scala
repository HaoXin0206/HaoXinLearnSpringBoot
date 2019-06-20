package HDFS


object Test {
  def main(args: Array[String]): Unit = {
    val data=Seq(Seq(Seq(1,1,1,1),Seq(1,1,1,1)),Seq(Seq(11,11,11,11),Seq(11,11,11,11)),Seq(Seq(1,1,1,1),Seq(1,1,1,1)))

    data.flatMap(a=>a)
      .foreach(println)

    println("===>")

    data.map(a=>a)
      .foreach(println)
  }

}
