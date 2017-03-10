Runtimes of QuickSort.java
<br>
upper = upper bound of the partition
<br>
lower = lower bound of the partition
<br>
mid = midpoint of the partition (upper + lower) / 2
<br>
#EVERYTHING MUST FOLLOW THIS FORMAT; remove heading when done


Randomly generated array

| Pivot | 1 | 10 | 100 | 1000 | 10000 | 100000 |
|-------|---|----|-----|------|-------|--------|
| upper | 3262.0 | 5652.0 | 10811.0 | 63069.0 | 763928.0 |14000340 |
| lower | 3371.0 | 5756.0 | 10765.0 | 59256.0 | 724566.0 |14565032 | 
| mid   | 547.0 | 8516.0 | 19308.0 | 68562.0 | 836691.0 |8817493.0 | 

Ascending array

| Pivot | 1 | 10 | 100 | 1000 | 10000 |
|-------|---|----|-----|------|-------|
| upper | 690.0 | 1189.0 | 5350.0 | 209280.0 | 20172876.0 |
| lower | 703.0 | 955.0 | 5439.0 | 213033.0 | 202608552.0 |
| mid   | 741.0 | 781.0 | 4137.0 | 13590.0 | 132605.0 |

Descending array

| Pivot | 1 | 10 | 100 | 1000 | 10000 |
|-------|---|----|-----|------|-------|
| upper | 732.0 | 1099.0 | 8682.0 | 404935.0 | 38861520.0 |
| lower | 741.0 | 1074.0 | 8137.0 | 420708.0 | 40476741.0 |
| mid   | 685.0 | 857.0 | 3125.0 | 15028.0 | 172836.0 |

Test times for partitions starting from the beginning and the end of the array (partition moved one space to the left/right).

Test times for partitions being in the center of the array. As the array is broken down by the partitions, new partitions are placed in the middle of the sub arrays to the left and right.

For randomly generated arrays, the two sets of data are similar initially, but when they reach a much larger number, the partition being placed in the middle is much faster than the other two. 

For ascending arrays, the extreme pivots don't differ by much, and though they start off quicker than randomly generated arrays, the ascending arrays take much longer for large arrays. However, starting at the midpoint, QuickSort sorted the ascending array extremely quickly, beating both the extreme pivots for ascending arrays and all pivots for randomly generated arrays.

This is also similar in descending arrays, though descending arrays took longer overall to sort than ascending arrays. Though the extreme pivots start off quick but took much longer for large arrays than the other data arrangements. In addition, the pivot placed at the midpoint for descending arrays also was much faster than pivots placed at the extremes, at about the same speed as mid-pivots for ascending arrays. 

| n | nlogn | n^2 |
|-------|---|----|
|1|0|1|
|10|10|100|
|100|200|10000|
|1000|3000|1000000|
|10000|40000|100000000|
|100000|500000| 10000000000 |


The rate at which the first two grows is similar to that of n^2, especially from array of size 10000 to that of 100000. ON the contrary, the one that partitions in the middle has one that is similar to nlogn. So worst case scenarios are one in which the partitions have to cut the array one by one, while the best is when the array can be continually cut in half.
