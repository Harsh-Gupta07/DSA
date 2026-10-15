# Reverse Array

- Practice day: 01
- Language: Java
- Difficulty: Easy
- Problem: [GeeksforGeeks — Reverse Array](https://www.geeksforgeeks.org/problems/reverse-an-array/1)
- Solution: [Solution.java](Solution.java)

## Task

Reverse the order of the elements in the original array without allocating another array.

Example: `[10, 20, 30, 40]` becomes `[40, 30, 20, 10]`.

## Approach

1. Place one pointer at the first element and the other at the last element.
2. Swap the values at the two pointers.
3. Move the left pointer forward and the right pointer backward.
4. Stop when the pointers meet or cross.

The variable `mid` temporarily stores a value during each swap.

## Complexity

- Time: O(n), with approximately n/2 swaps.
- Extra space: O(1).
