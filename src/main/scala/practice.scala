import org.apache.spark.sql._


object practice {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("local")
      .master("local")
      .getOrCreate()

    val rdd1 = Array(1, 2, 3, 4, 5)
    val rdd2 = spark.sparkContext.parallelize(rdd1)
    val rdd3 = rdd2.reduce((a, b) => a + b)
    println(rdd3)

 }
}
