# Sorting-Algorithms

## Contents

- #### Selection Sort

    File - SelectionSort.java    
    Method - SelectionSortSimple()  
    Runtime - **O(n^2)**  
    Space Complexity - **O(n)**
    
- #### Insertion Sort

    File - InsertionSort.java  
    Method - InsertionSortSimple()  
    Runtime - **O(n^2)**  
    Space Complexity - **O(n)** 
    
- #### Shell Sort

    File - CoolSort.java  
    Shell Sort Implementation.
    Though unintuitive, it can be shown that the above algorithm has a runtime of **O(N^3/2)**.
    An example run of Shell Sort with gaps 5, 3 and 1 is shown below.     
    
    Input 62 83 18 53 07 17 95 86 47 69 25 28   
    H = 5 17 28 18 47 07 25 83 86 53 69 62 95   
    H = 3 17 07 18 47 28 25 69 62 53 83 86 95   
    H = 1 07 17 18 25 28 47 53 62 69 83 86 95   
    Output - 1 07 17 18 25 28 47 53 62 69 83 86 95

    The first pass, 5-sorting, performs insertion sort on separate subarrays (a1, a6, a11), (a2, a7, a12),
(a3, a8), (a4, a9), (a5, a10). For instance, it changes the subarray (a1, a6, a11) from (62, 17, 25) to
(17, 25, 62). The next pass, 3-sorting, performs insertion sort on the subarrays (a1, a4, a7, a10),
(a2, a5, a8, a11), (a3, a6, a9, a12). The last pass, 1-sorting, is an ordinary insertion sort of the entire
array (a1,..., a12).
    
- #### Selection Sort For k Elements

    File - SelectionSort.java   
    Method - selectionSortWithKElemt()  
    Sorting only k elements of the array using selection sort.      
    Runtime **O(nk)**, where k = number of elements to be sorted in array of n elements.
    **Input:** 4, 6, 8, 15, 20, 22, 10, 3, 9, 2 and **k** = 4     
    **Output:** 2, 3, 4, 6
    
- #### Median By Sorting

    Finding Median of given array by using selection sort.
      
- #### Index Search

    File - FindMatchIndex.java  
    Search for index in sorted array such that its value is equal to element at that particular index.    
    Finds out whether there is an index i for which A[i] = i  
    Runtime **O(log n)**
    
    
 ## Content of the folder.
1.	CPQ1A.java – java class which contains the input and gives the appropriate output for Selection Sort.
2.	CPQ1B.java – java class which contains the input and gives the appropriate output for Selection Sort Bounded.
3.	CPQ1C.java – java class which contains the input and gives the appropriate output for Median by sorting.
4.	CPQ2.java – java class which contains the input and gives the appropriate output for Shell Sort.
5.	CPQ3.java – java class which contains the input and gives the appropriate output for Index Search.
6.	SelectionSort.java – this class implements the selection sort for whole array as well as for k elements. Files CPQ1A, CPQ1B and CPQ1C use the function implemented in this class to get the desired output.
7.	InsertionSort.java – this class implements the insertion sort and cool sort (with iterative as well as recursive method) implementation. CPQ2 uses method in this class to get the desired output.
8.	FindMatchIndex.java – this class contains implementation for finding the index i such that A[i]=i. CPQ3 uses method in this class to get the desired output.

    
