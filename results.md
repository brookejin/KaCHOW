Runtimes of QuickSort.java
<br>
upper = upper bound of the partition
<br>
lower = lower bound of the partition
<br>
#EVERYTHING MUST FOLLOW THIS FORMAT; remove heading when done


| Pivot | 1 | 10 | 100 | 1000 | 10000 | 100000 |
|-------|---|----|-----|------|-------|--------|
| upper | 3262.0 | 5652.0 | 10811.0 | 63069.0 | 763928.0 |14000340 |
| lower | 3371.0 | 5756.0 | 10765.0 | 59256.0 | 724566.0 |14565032 | 
| mid   | 547.0 | 8516.0 | 19308.0 | 68562.0 | 836691.0 |8817493.0 | 


Test times for partitions starting from the beginning and the end of the array (partition moved one space to the left/right).

Test times for partitions being in the center of the array. As the array is broken down by the partitions, new partitions are placed in the middle of the sub arrays to the left and right

The two sets of data are similar initially, but when they reach a much larger number, the partition being placed in the middle is much faster than the other two. 


|-------|---|----|-----|------|-------|--------|
| n | 1 | 10 | 100 | 1000 | 10000 | 100000 |
| nlogn | 0 | 10 | 200 | 3000 | 40000 |500000 |
| n^2 | 1 | 100 | 10000 | 100000 | 100000000 | | 
