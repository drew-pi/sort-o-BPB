# sort-o-BPB

#### Blue Pizza Bagles - Andrew Piatetsky, Ben Belotser, Kosta Dubovskiy

SOTW: Bulls On Parade- Rage Against The Machine

## Hypothesis

Our hypothises is that all of the sorting algorithms we are testing have the same worst and best cases. The worst case scenario is that the list is in descending order (greatest to least), this is because the algorithm must use the maximum number ofloops to place since each item is on the other extreme. The best case is if the list is sorted, since there are no swaps to be done and only checks to do. 

**TLDR: Best case for all - array is already sorted, Worst case for all - array is in descending order**


## Analysis

We modified our sorting algorithms to count how many loops it does in total (not just passes because in each pass there are many loops being made). Then in driver we summarized the data to make it easier to analyze. *We will have to further refactor our code to prove our hypothesis*

## Results

All three sorting methods have the same best and worst case, as we predicted in our hypothesis.

### BubbleSort:

* BubbleSort starts from the rightmost value and compares it to the value immediately to the left of it. if the left value is greater, it swaps the two. It then compares the left element from the previous comparison and the element one space to the left of it, traversing the array until it reaches the first element. It then makes a pass of the array to check that the array's elements are in descending order from right to left.

* Line of best fit equation for worst case scenario for BubbleSort: O(n)= 760.8 * 1.01^n.

### SelectionSort:

* SelectionSort makes a pass of the array to find the maximum value, then places that value at the leftmost slot in the array. It then scans from the element right adjacent of the one just sorted to the end of the array, and repeats this process until all elements in the array are sorted in increasing value from left to right.

* Line of best fit equation for worst case scenario of SelectionSort: O(n): n+1.

### InsertionSort:

* InsertionSort compares the first two elements in the array and swaps them if element n is greater than element n+1. It then makes another pass and compares element n+2 against the previous two and swaps if necessary. It repeats this pattern until it reaches the end of the array.

* Line of best fit equation for worst case scenario for BubbleSort: O(n)= 760.8 * 1.01^n.
 
 

