package Spark.Streaming

import org.apache.spark.sql.SparkSession

object SparkStreamingDemo {
  def main(args: Array[String]): Unit = {
    val spark=SparkSession
      .builder()
      .appName("")
      .master("local[3]")
      .getOrCreate()

    import spark.implicits._

    val line=spark.readStream
      .format("sock")
      .option("","")
      .option("","")
      .load()



  }

}
