# sort-o-BPB

#### Blue Pizza Bagles - Andrew Piatetsky, Ben Belotser, Kosta Dubovskiy

SOTW: Bulls On Parade- Rage Against The Machine

## Hypothesis

Our hypothises is that all of the sorting algorithms we are testing have the same worst and best cases. The worst case scenario is that the list is in descending order (greatest to least), this is because the algorithm must use the maximum number ofloops to place since each item is on the other extreme. The best case is if the list is sorted, since there are no swaps to be done and only checks to do. 

**TLDR: Best case for all - array is already sorted, Worst case for all - array is in descending order**


## Analysis

We modified our sorting algorithms to count how many loops it does in total (not just passes because in each pass there are many loops being made). Then in driver we summarized the data to make it easier to analyze. 

## Results

All three sorting methods have the same best and worst case, as we predicted in our hypothesis.

### BubbleSort:

* BubbleSort starts from the rightmost value and compares it to the value immediately to the left of it. If the left value is greater, it swaps the two. It then compares the left element from the previous comparison and the element one space to the left of it, traversing the array until it reaches the first element. It does this until no more swaps are done, or the array is sorted.
* Best Case Scenario - The array is already sorted, so no swaps needed. 
  * O(0)
* Worst Case Scenario - The array is backward (descending order)
  * big O notation: O(760.8 * 1.01<sup>n</sup>)

### SelectionSort:

* SelectionSort makes a pass of the array to find the maximum value, then places that value at the leftmost slot in the array. It then scans from the element right adjacent of the one just sorted to the end of the array, and repeats this process until all elements in the array are sorted in increasing value from left to right.
* Best Case Scenario - The array is already sorted, so no swaps needed. 
  * O(0)
* Worst Case Scenario - The array is backward (descending order)
  * big O notation: O(n + 1)

### InsertionSort:

* InsertionSort creates two virtual patition in the array. One already sorted and the other unsorted. First it sorts the sorted partition, and continues adding values to the sorted partition to make it unsorted and then sorts the sorted partition. It does this until the sorted partition encompasses the entire array. 
* Best Case Scenario - The array is already sorted, so no swaps needed. 
  * O(0)
* Worst Case Scenario - The array is backward (descending order)
  * big O notation: O(760.8 * 1.01<sup>n</sup>)
 
 

