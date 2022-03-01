# java ./test.java $1 $2

java -XX:+UseCompressedOops -XX:+UseCompressedClassPointers -XX:+UnlockExperimentalVMOptions -XX:+UseShenandoahGC -Xlog:gc*,gc+ref*,gc+ergo*,gc+heap*,gc+stats*,gc+compaction*,gc+age*:file=gc.log -Xint -Xms2m -Xmx16m -XX:+ShenandoahCSCollectAll test.java $1 $2 