BINARY SEARCH:

Binary Search is a searching algorithm that finds the position of a target element in a sorted array. It works by repeatedly dividing the search range into two halves until the element is found or the search range becomes empty.

Algorithm:
1. Start with two pointers: 
o low = 0 
o high = n - 1 
2. Calculate the middle index:
mid = (low + high) / 2
3. Compare the middle element with the target element. 
4. If they are equal, return the index. 
5. If the target is smaller than the middle element, search the left half. 
6. If the target is greater than the middle element, search the right half. 
7. Repeat the process until the element is found or low > high.

Time Complexity:
CaseTime ComplexityBest CaseO(1)Average CaseO(log n)Worst CaseO(log n)
Space Complexity:
TypeSpace ComplexityIterative Binary SearchO(1)Recursive Binary SearchO(log n)
Output:




