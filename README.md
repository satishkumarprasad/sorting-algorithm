# InsertionSort
Insertion sort is one of the sorting algorithms that sorts the given list of elements in either ascending or descending order. This algorithm falls in the category of inplace algorithm where the sorting operation is performed in the original list only instead of creating a different list with the given elements. 

Algorithm:

  insertion_sort(array) {
    for i = 1 to array.length
      key = array[i]
      j = i - 1
      while( j >= 0 && array[j] > key) {
        array[j + 1] = array[j]
        j--
      }
      array[j + 1] = key
  }
