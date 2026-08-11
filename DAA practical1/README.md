# Sorting Algorithms in Java

This repository contains Java implementations of five commonly used sorting algorithms. Each program takes user input using `Scanner`, sorts the elements in ascending order, displays the sorted array, and shows the time and space complexity along with the actual execution time.

## Algorithms Covered

### 1. Bubble Sort

Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order.

* Best Case: **O(n)**
* Average Case: **O(n²)**
* Worst Case: **O(n²)**
* Space: **O(1)**

### 2. Selection Sort

Selection Sort finds the smallest element from the unsorted portion and places it in its correct position.

* Best Case: **O(n²)**
* Average Case: **O(n²)**
* Worst Case: **O(n²)**
* Space: **O(1)**

### 3. Insertion Sort

Insertion Sort builds the sorted array one element at a time by inserting each element into its correct position.

* Best Case: **O(n)**
* Average Case: **O(n²)**
* Worst Case: **O(n²)**
* Space: **O(1)**

### 4. Merge Sort

Merge Sort uses the divide-and-conquer technique. It divides the array into smaller parts, sorts them, and then merges them.

* Best Case: **O(n log n)**
* Average Case: **O(n log n)**
* Worst Case: **O(n log n)**
* Space: **O(n)**

### 5. Quick Sort

Quick Sort uses the divide-and-conquer approach. It selects a pivot, partitions the array around the pivot, and recursively sorts the partitions.

* Best Case: **O(n log n)**
* Average Case: **O(n log n)**
* Worst Case: **O(n²)**
* Space: **O(log n)** average

## Features

* Java implementations
* User input using `Scanner`
* Ascending-order sorting
* Execution time measurement using `System.nanoTime()`
* Time and space complexity displayed
* Beginner-friendly code
* Suitable for DSA practicals and learning

## Comparison

| Algorithm      | Best       | Average    | Worst      | Space     |
| -------------- | ---------- | ---------- | ---------- | --------- |
| Bubble Sort    | O(n)       | O(n²)      | O(n²)      | O(1)      |
| Selection Sort | O(n²)      | O(n²)      | O(n²)      | O(1)      |
| Insertion Sort | O(n)       | O(n²)      | O(n²)      | O(1)      |
| Merge Sort     | O(n log n) | O(n log n) | O(n log n) | O(n)      |
| Quick Sort     | O(n log n) | O(n log n) | O(n²)      | O(log n)* |

* Average auxiliary stack space for Quick Sort; it can become **O(n)** in the worst case.

## Purpose

The main purpose of this repository is to understand the working, implementation, execution time, and complexity of different sorting algorithms in Java.
