package pack
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.storage._
import org.apache.spark.sql.functions._
trait Context{
  lazy val sparkConf = new SparkConf()
    .setAppName("Learn Spark")
    .setMaster("local[*]")
    .set("spark.cores.max","2")

  lazy val sparkSession = SparkSession
    .builder()
    .config(sparkConf)
    .getOrCreate()
}
object first extends App with Context{
  // Create a DataFrame from reading a CSV file
  val dfTags = sparkSession
    .read
    .option("header", "true")
    .option("inferSchema", "true")
    .csv("src/main/resources/question_tags_10K.csv")
    .toDF("id", "tag")

  dfTags.show(10)
  /*val df = sparkSession
    .read.format("csv")
    .load("file:///home/raj/data/txns")
  df.show()*/

  dfTags.filter("tag='php'").show()
  println(s"Number of php tags =  ${dfTags.filter("tag = 'php'").count()}")
  println(s"Number of tags strart from s = ${dfTags.filter("tag like 's%'").count()}")

  dfTags.filter("tag like 's%'")
    .filter("id ==25 or id ==108")
    .show(10)

  //DataFrame Query: SQL IN clause
  dfTags.filter("id in (25, 108)").show()

  //DataFrame Query : AQL Group By
  println("Group by tag value")
  dfTags.groupBy("tag").count().show(10)

  // DataFrame Query: SQL Group By with filter
  dfTags.groupBy("tag").count().filter("count > 5").show(10)

  //DataFrame Query: SQL order by
  dfTags.groupBy("tag").count().filter("count>5").orderBy("tag").show(10)





}
