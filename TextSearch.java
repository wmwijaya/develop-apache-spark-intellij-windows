package textsearch;

import org.apache.spark.sql.*;

public class TextSearch {

    public final SparkSession spark;
    public static String hdfs = "hdfs://localhost:9000/tmp/input/borobudur.txt";

    public TextSearch(){
        super();
        spark = SparkSession
                .builder()
                .appName("TextSearch").master("local[1]").getOrCreate();
    }

    public static void main(String[] args){
        TextSearch ts = new TextSearch();
        //Membaca file text dari HDFS, text akan ditampung dalam Dataframe sebagai tabel dengan satu kolom bernama "value".
        Dataset<String> df = ts.spark.read().textFile(hdfs);
        df.show(100);

        //Pilih setiap baris/row dari kolom "value" yang mengandung kata 'candi';
        Dataset<Row> rama = df.select("value").filter("value like '%candi%'");
        rama.show(10);
        System.out.println("Hasil pencarian kata kunci 'candi'");
    }
}
