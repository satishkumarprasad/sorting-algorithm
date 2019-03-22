# InsertionSort
Insertion sort is one of the sorting algorithms that sorts the given list of elements either in ascending or descending order. This algorithm falls in the category of **inplace algorithm** where the sorting operation is performed in the original list only instead of creating a different list with the given elements. 

## Algorithm:
```java
// To sort in ascending order
  insertion_sort(array) {
    for i = 1 to array.length
      key = array[i]
      j = i - 1
      while( j >= 0 && array[j] > key) { //'>' is for ascending order & '<' is for descending order, rest is same
        array[j + 1] = array[j]
        j--
      }
      array[j + 1] = key
  }
  
  // To sort in descending order
  insertion_sort(array) {
    for i = 1 to array.length
      key = array[i]
      j = i - 1
      while( j >= 0 && array[j] < key) {
        array[j + 1] = array[j]
        j--
      }
      array[j + 1] = key
  }
 ```
## Example and explanation:
Lets consider an array A to be sorted in **ascending** order.
```java 
    A : [8, 2, 5, 0, 7, 3, 9, 6, 1, 4]
index -  0  1  2  3  4  5  6  7  8  9

As per the algorithm mentioned above, 
the for loop runs from index 1 to 9
in the first iteration when i = 1, 
  key contains A[i] i.e A[1] which is 2 and j = i - 1 i.e. j = 1 - 1 = 0
  since (j == 0 && array[0] > 2) so while loop evaluates true
    then the element at index 0 i.e. 8 is copied to the next index i.e. j + 1 // A : [8, 8, 5, 0, 7, 3, 9, 6, 1, 4]
    and j is decremented to be 0 - 1 i.e. -1
  now the while loop evaluates to false
  and at index j + 1 = -1 + 1 = 0, the key i.e. 2 is copied.// A : [2, 8, 5, 0, 7, 3, 9, 6, 1, 4]
  
  So, by the first iteration of i i.e. for index 1, the sub array [2, 8] of index 0 and 1 gets sorted and likewise in all successive iterations all elements get sorted. 
```
This way **at any time in insertion-sort, all the elemets(sub array) to the left of the element to be sorted (or to be placed at its right position in the given array) are already sorted.**

## Analysis of algorithm
#### Time complexity:

#### Space complexity:
