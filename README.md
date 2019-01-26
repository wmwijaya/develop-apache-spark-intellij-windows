# develop-apache-spark-intellij-windows
Develop Apache Spark application using Intellij IDEA on Windows OS.

Tutorial ini dimuat di http://www.teknologi-bigdata.com/ website tentang teori dan contoh implementasi teknologi Big Data.

Tutorial ini menggunakan Windows 10 dan Software berikut:
1. Java JDK-1.8; cara install ada di http://www.teknologi-bigdata.com/2019/01/install-hadoop-2-standalone-windows.html
2. Apache Hadoop-2.7.7; cara install ada di http://www.teknologi-bigdata.com/2019/01/install-hadoop-2-standalone-windows.html
3. IDE Intellij IDEA; download dari https://www.jetbrains.com/idea/

Sebelum mulai install Spark, jalankan Hadoop yang sudah diinstall. Buat direktori di Hadoop yang akan digunakan untuk menyimpan file teks yang akan diproses menggunakan Apache Spark.
hdfs dfs -mkdir /tmp/input
Kemudian, copy file teks dari drive lokal ke Hadoop dan pastikan file tersebut sudah benar-benar dikopi ke direktori Hadoop yang telah dibuat.
hdfs dfs -copyFromLocal C:\tmp\intellij-projects\TextSearch\input\borobudur.txt /tmp/input/borobudur.txt
hdfs dfs -ls /tmp/input

Langkah-langkah Install Apache Spark pada OS Windows
1. Download Spark dari http://spark.apache.org/downloads.html dan pastikan untuk mengunduh Spark yang kompatibel dengan versi Hadoop yang digunakan. Pada tutorial ini digunakan Apache Spark-2.3.1 (jadi kita unduh file spark-2.3.1-bin-hadoop2.7.tgz ) dari laman download Apache Spark.
2. Ekstrak file tersebut ke C:\spark-2.3.1-bin-hadoop2.7
3. Unduh file winutils.exe dari https://github.com/wmwijaya/hadoop2-standalone-windows7-windows10/tree/master/bin dan taruh file tersebut di direktori C:\spark-2.3.1-bin-hadoop2.7\bin
4. Pada Environtment Variables > System Variables OS Windows, buat System Variables SPARK_HOME dengan value C:\spark-2.3.1-bin-hadoop2.7
5. Edit System Variable > Path dan tambahkan C:\spark-2.3.1-bin-hadoop2.7\bin
6. Test Apache Spark: buka Command Prompt Windows, kemudian eksekusi perintah spark-shell.cmd
Catatan: cara edit Environment Variables > System Variables OS Windows ada di http://www.teknologi-bigdata.com/2019/01/install-hadoop-2-standalone-windows.html

Langkah-langkah membuat dan menjalankan aplikasi Spark dengan Intellij IDEA pada OS Windows
1. Start Intellij IDEA as Administrator
2. Buat Maven Project dari menu File > New > Project > Maven ( silakan ikuti sesuai gambar, kemudian terakhir klik Finish ):
3. Muat Spark Library dari menu File > Project Structure > Modules > Dependencies > + > 1 JARs or directories…
4. Buat Java Package "textsearch" dengan klik kanan TextSearch > src > main > java > New > Package
5. Buat Java Class "TextSearch.java" dengan klik kanan TextSearch > src > main > java > textsearch > New > Java Class
6. Buka TextSearch.java, kemudian copy-paste source code TextSearch.java dari Github
7. Edit konfigurasi untuk menjalankan program TextSearch dari menu Run > Edit Configuration… > + > Application
8. Jalankan aplikasi dari menu Run > Run 'TextSearch'

Demikian, selamat mencoba!
