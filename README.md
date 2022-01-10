# sort-o-BPB

#### Blue Pizza Bagles - Andrew Piatetsky, Ben Belotser, Kosta Dubovskiy

## Hypothesis

Our hypothises is that all of the sorting algorithms we are testing have the same worst and best cases. The worst case scenario is that the list is in descending order (greatest to least), this is because the algorithm must use the maximum number ofloops to place since each item is on the other extreme. The best case is if the list is sorted, since there are no swaps to be done and only checks to do. 

**TLDR: Best case for all - array is already sorted, Worst case for all - array is in descending order**


## Analysis

We modified our sorting algorithms to count how many loops it does in total (not just passes because in each pass there are many loops being made). Then in driver we summarized the data to make it easier to analyze. *We will have to further refactor our code to prove our hypothesis*

## Results

  
Line of best fit equation for worst case scenario for InsertSort and BubbleSort: O(n)= 760.8 * 1.01^n.

Line of best fit equation for worst case scenario for SelectionSort: O(n): n+1
 

