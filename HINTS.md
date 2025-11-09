# Binary Search Implementation Hints

## General Approach
- Binary search only works on **sorted arrays**
- The key idea: eliminate half the search space with each comparison
- Time complexity: O(log n)

## Sub-Challenge 1: Empty Array
**Hint:** What should you return when the array has no elements?
**Think about:** Handle this edge case first!

## Sub-Challenge 2: Found Index
**Hint:** Use two pointers (left and right) to track the search boundaries.
**Algorithm:**
  1. Find the middle element
  2. If it matches target, return the index
  3. If target is smaller, search the left half
  4. If target is larger, search the right half
  5. Repeat until found or boundaries cross

## Sub-Challenge 3: Not Found
**Hint:** What happens when left > right?
**Return value:** -1 indicates "not found"

## Sub-Challenge 4: Bounds
**Hint:** Make sure your algorithm handles:
  - Single element arrays
  - Large arrays
  - Target at the beginning/end
**Watch out for:** Integer overflow when calculating middle index (use `left + (right - left) / 2`)

## Common Pitfalls
- Off-by-one errors in loop conditions
- Infinite loops (make sure boundaries actually move)
- Integer overflow: `(left + right) / 2` can overflow with large integers, use `left + (right - left) / 2`
- Forgetting to update left/right pointers

