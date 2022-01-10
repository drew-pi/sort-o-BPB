# sort-o-BPB

#### Blue Pizza Bagles - Andrew Piatetsky, Ben Belotser, Kosta Dubovskiy

## Hypothesis

Our hypothises is that all of the sorting algorithms we are testing have the same worst and best cases. The worst case scenario is that the list is in descending order (greatest to least), this is because the algorithm must use the maximum number ofloops to place since each item is on the other extreme. The best case is if the list is sorted, since there are no swaps to be done and only checks to do. 

**TLDR: Best case for all - array is already sorted, Worst case for all - array is in descending order**


## Analysis

We modified our sorting algorithms to count how many loops it does in total (not just passes because in each pass there are many loops being made). Then in driver we summarized the data to make it easier to analyze. *We will have to further refactor our code to prove our hypothesis*

## Results

  
### Array Length 10:
  |Sorting method|Best case swaps # |Worst case swaps #|  
  |--------------|---------|----------|
 |SelectionSort|11|11|
 |BubbleSort|0|55|
 |InsertionSort|0|55|
 
 ### Array Length 20:
  |Sorting method|Best case swaps # |Worst case swaps #|  
  |--------------|---------|----------|
 |SelectionSort|21|21|
 |BubbleSort|0|210|
 |InsertionSort|0|210|
 
 ### Array Length 40:
  |Sorting method|Best case swaps # |Worst case swaps #|  
  |--------------|---------|----------|
 |SelectionSort|41|41|
 |BubbleSort|0|820|
 |InsertionSort|0|820|
 
 ### Array Length 80:
  |Sorting method|Best case Swaps |Worst case swaps #|  
  |--------------|---------|----------|
 |SelectionSort|81|81|
 |BubbleSort|0|3240|
 InsertionSort|0|3240|
 
 ### Array Length 160:
  |Sorting method|Best case swaps  |Worst case swaps #|  
  |--------------|---------|----------|
 |SelectionSort|161|161|
 |BubbleSort|0|12880|
 InsertionSort|0|12880|
 
 

