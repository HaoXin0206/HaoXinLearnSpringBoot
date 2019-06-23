package Spark.SQL

import org.apache.spark.sql.{SaveMode, SparkSession}


object SparkSQLDemo {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder()
      .appName("Test")
      .config("spark.sql.parquet.writeLegacyFormat", true)
     /* hive集成是添加以下代码
     * .enableHiveSupport()
     * .config("hive.metastore.uris", "thrift://10.18.2.3:9083")
     * */
      .enableHiveSupport()
      .getOrCreate()


    /*数据读取*/
    val df = spark.table("...")
    spark.read.table("")
//    spark.read.jdbc("")
    spark.read.json("")
    spark.read.format("csv")


    /*注册临时表改为临时视图,当前会话视图*/
    df.createOrReplaceGlobalTempView("tempView")
    spark.sql("select * from tempView").show()

    /*注册全局试图==>创建的视图在程序结束前都是有效的，在不同的会话中都可以访问*/
    df.where("xxxx").createOrReplaceGlobalTempView("people")
    spark.sql("").show()

    /*新建一个会话*/
    spark.newSession().sql("")

    /*结果输出*/
    spark.sql("").write.mode(SaveMode.Append).csv("")
    spark.sql("").write.mode(SaveMode.Append).parquet("")
    spark.sql("").write.mode(SaveMode.Append).json("")
//    spark.sql("").write.mode(SaveMode.Append).jdbc("")
    spark.sql("").write.format("csv").mode(SaveMode.Append).save("")
    spark.sql("").write.format("parquet").mode(SaveMode.Append).save("")
    spark.sql("").write.format("json").mode(SaveMode.Append).save("")


    /*转RDD*/
    spark.read.table("").rdd



  }

}
