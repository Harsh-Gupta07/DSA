# Move Zeroes

- Practice day: 02
- Language: Java
- Difficulty: Easy
- Problem: [LeetCode 283 — Move Zeroes](https://leetcode.com/problems/move-zeroes/)
- Solution: [Solution.java](Solution.java)

## Task

Move every zero to the end of the original array while preserving the relative order of all non-zero elements. Do not allocate another array.

Example: `[0, 1, 0, 3, 12]` becomes `[1, 3, 12, 0, 0]`.

## Approach

1. Use `zero` as the next position for a non-zero value.
2. Scan the array from left to right, copying each non-zero value into that position and advancing it.
3. Fill all remaining positions with zeros.

The write position never passes the read position, so unread values are preserved. Non-zero values are copied in their original order.

## Complexity

- Time: O(n). The two loops run sequentially and perform at most two traversals in total.
- Extra space: O(1).

## Edge cases

Check a single element, all zeros, no zeros, and zeros at the beginning or end.
