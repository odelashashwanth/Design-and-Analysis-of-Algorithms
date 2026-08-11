# Searching Algorithms in Java

This repository contains Java implementations of two fundamental searching algorithms: **Linear Search** and **Binary Search**. Both programs take user input using `Scanner`, search for a given element, display the result, measure the actual execution time, and show the time and space complexity.

## Algorithms Covered

### 1. Linear Search

Linear Search checks each element one by one from the beginning of the array until the required element is found or the array ends.

* Best Case: **O(1)**
* Average Case: **O(n)**
* Worst Case: **O(n)**
* Space: **O(1)**
* Array Requirement: **No sorting required**

### 2. Binary Search

Binary Search is an efficient searching algorithm that repeatedly divides a **sorted array** into two halves and eliminates the half that cannot contain the target element.

* Best Case: **O(1)**
* Average Case: **O(log n)**
* Worst Case: **O(log n)**
* Space: **O(1)**
* Array Requirement: **Array must be sorted**

## Features

* Java implementations
* User input using `Scanner`
* Search result display
* Execution time measurement using `System.nanoTime()`
* Time and space complexity analysis
* Beginner-friendly code
* Suitable for DSA practicals and learning

## Comparison

| Algorithm     | Best | Average  | Worst    | Space | Sorted Array Required |
| ------------- | ---- | -------- | -------- | ----- | --------------------- |
| Linear Search | O(1) | O(n)     | O(n)     | O(1)  | No                    |
| Binary Search | O(1) | O(log n) | O(log n) | O(1)  | Yes                   |

## Purpose

The purpose of this repository is to understand the implementation, working, execution time, and complexity of **Linear Search and Binary Search** in Java and to understand when each searching technique is most suitable.
