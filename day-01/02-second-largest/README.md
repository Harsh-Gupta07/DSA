# Second Largest

- Practice day: 01
- Language: Java
- Difficulty: Easy
- Problem: [GeeksforGeeks — Second Largest](https://www.geeksforgeeks.org/problems/second-largest3735/1)
- Solution: [Solution.java](Solution.java)

## Task

Return the second-largest distinct value in an array of positive integers. Return `-1` when it does not exist.

Examples: `[9, 4, 9, 7]` returns `7`; `[6, 6]` returns `-1`.

## Approach

1. Track the largest and second-largest distinct values while scanning the array.
2. When a new largest value appears, move the old largest into second place.
3. Otherwise, update the second largest only if the value is smaller than the largest and larger than the current second largest.
4. Return `-1` if no second distinct value was found.

The null and short-array guard returns `-1` before scanning. The condition `num != largest` excludes duplicate maximums.

## Complexity

- Time: O(n), one traversal.
- Extra space: O(1).

## Input note

`Integer.MIN_VALUE` is a safe sentinel for this positive-integer problem. Supporting every Java `int` value would require tracking whether a second-largest value was found separately.
