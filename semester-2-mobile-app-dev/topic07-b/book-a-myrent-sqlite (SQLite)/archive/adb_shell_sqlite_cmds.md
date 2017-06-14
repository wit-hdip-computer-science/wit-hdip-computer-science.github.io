$ adb shell
root@generic:/ # 

root@generic:/ # cd /data/data/com.marakana.yamba/databases


ls -al
-rw-rw---- u0_a40   u0_a40      20480 2014-01-25 10:39 timeline.db
-rw------- u0_a40   u0_a40      12824 2014-01-25 10:39 timeline.db-journal


sqlite3 timeline.db

SQLite version 3.7.11 2012-03-20 11:35:50
Enter ".help" for instructions
Enter SQL statements terminated with a ";"

select * from timeline;
550|1390664011000|Marakana Student|Hello Emsi
549|1390663894000|Marakana Student|tttt
548|1390663136000|Marakana Student|klj
...

.exit 
root@generic:/data/data/com.marakana.yamba/databases # 