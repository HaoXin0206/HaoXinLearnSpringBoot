package Spark

import org.apache.spark.{SparkConf, SparkContext}

object SparkCore {
  def main(args: Array[String]): Unit = {
    val conf=new SparkConf()
      .setAppName("haoxin-test")
      .setMaster("local[4]")
    val sc=SparkContext.getOrCreate(conf)
    sc.parallelize(Seq(1,2,34,234,32,423,4,234,23423,423,4,234,234,2))
      .map((_,1))
      .reduceByKey(_+_)
      .map(_.swap)
      .sortByKey()
      .map(_.swap)
      .foreach(println)


  }

}
