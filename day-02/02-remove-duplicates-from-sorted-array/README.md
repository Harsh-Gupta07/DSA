# Remove Duplicates from Sorted Array

- Practice day: 02
- Language: Java
- Difficulty: Easy
- Problem: [LeetCode 26 — Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
- Solution: [Solution.java](Solution.java)

## Task

Given a sorted integer array, keep each distinct value once at the beginning of the original array and return the number of unique values, k. The first k positions must contain those values in sorted order; later positions are ignored. The array length does not change.

Example: [1, 1, 2, 2, 3] has k = 3 and the first three positions become [1, 2, 3].

## Approach

1. Return 0 for an empty array.
2. Keep i at the last unique value already stored and scan the remaining positions with j.
3. When nums[j] differs from nums[i], advance i and copy the new unique value into nums[i].
4. Return i + 1, the number of values in the unique prefix.

Sorted input places duplicates together. The unique prefix contains one copy of each value seen so far. The write position never passes the read position, so unread values are preserved.

## Complexity

- Time: O(n), from one scan.
- Extra space: O(1), using two indices and the original array.

## Edge cases

Check a single element, all equal values, all distinct values, negative values, and repeated values at either end. The solution also handles an empty array.
