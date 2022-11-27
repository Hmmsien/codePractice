# codingPractice

## question 6
Given a target integer T, a non-negative integer K and an integer array A sorted in ascending order, find the K closest numbers to T in A. If there is a tie, the smaller elements are always preferred.
### Assumptions
- A is not null
- K is guranteed to be >= 0 and K is guranteed to be <= A.length
Return
- A size K integer array containing the K closest numbers(not indices) in A, sorted in ascending order by the difference between the number and T.
### Examples
- A = {1, 2, 3}, T = 2, K = 3, return {2, 1, 3} or {2, 3, 1}
- A = {1, 4, 6, 8}, T = 3, K = 3, return {4, 1, 6}


## Question 7
Evaluate a to the power of b, assuming both a and b are integers and b is non-negative.
### Examples
- power(2, 0) = 1
- power(2, 3) = 8
- power(0, 10) = 0
- power(-2, 5) = -32

### Corner Cases
- In this question, we assume 0^0 = 1.
- What if the result is overflowed? We can assume the result will not be overflowed when we solve this problem on this online judge.

## Question 8
Given an array of integers, sort the elements in the array in ascending order. The selection sort algorithm should be used to solve this problem.
### Examples
- {1} is sorted to {1}
- {1, 2, 3} is sorted to {1, 2, 3}
- {3, 2, 1} is sorted to {1, 2, 3}
- {4, 2, -3, 6, 1} is sorted to {-3, 1, 2, 4, 6}

### Corner Cases
- What if the given array is null? In this case, we do not need to do anything.
- What if the given array is of length zero? In this case, we do not need to do anything.

## Question 9
Given an array of integers, sort the elements in the array in ascending order. The merge sort algorithm should be used to solve this problem.
### Examples
- {1} is sorted to {1}
- {1, 2, 3} is sorted to {1, 2, 3}
- {3, 2, 1} is sorted to {1, 2, 3}
- {4, 2, -3, 6, 1} is sorted to {-3, 1, 2, 4, 6}

### Corner Cases
- What if the given array is null? In this case, we do not need to do anything.
- What if the given array is of length zero? In this case, we do not need to do anything.

## Question 10
Given an array of integers, sort the elements in the array in ascending order. The quick sort algorithm should be used to solve this problem.
### Examples
- {1} is sorted to {1}
- {1, 2, 3} is sorted to {1, 2, 3}
- {3, 2, 1} is sorted to {1, 2, 3}
- {4, 2, -3, 6, 1} is sorted to {-3, 1, 2, 4, 6}
### Corner Cases
- What if the given array is null? In this case, we do not need to do anything.
- What if the given array is of length zero? In this case, we do not need to do anything.

## Question 11
Reverse a singly-linked list iteratively.
### Examples
- L = null, return null
- L = 1 -> null, return 1 -> null
- L = 1 -> 2 -> 3 -> null, return 3 -> 2 -> 1 -> null
```java
class ListNode {
    public int value;
    public ListNode next;
    public ListNode(int value) {
        this.value = value;
        next = null; 
    }
}
```

## Question 12
Merge two sorted lists into one large sorted list.
### Examples
- L1 = 1 -> 4 -> 6 -> null, L2 = 2 -> 5 -> null, merge L1 and L2 to 1 -> 2 -> 4 -> 5 -> 6 -> null
- L1 = null, L2 = 1 -> 2 -> null, merge L1 and L2 to 1 -> 2 -> null
- L1 = null, L2 = null, merge L1 and L2 to null


## Question 13
Given an array that is initially stored in one stack, sort it with one additional stacks (total 2 stacks).
<br>After sorting the original stack should contain the sorted integers and from top to bottom the integers are sorted in ascending order.
### Assumptions:
- The given stack is not null.
- There can be duplicated numbers in the give stack.
### Requirements:
- No additional memory, time complexity = O(n ^ 2).
- Implement a recursive, pre-order traversal of a given binary tree, return the list of keys of each node in the tree as it is pre-order traversed.
### Examples
<pre>
                 5
               /  \
              3    8
             / \    \
            1   4    11
</pre>

Pre-order traversal is [5, 3, 1, 4, 8, 11]

### Corner Cases
- What if the given binary tree is null? Return an empty list in this case.
- How is the binary tree represented?
- We use the level order traversal sequence with a special symbol "#" denoting the null node.
### Example:
The sequence [1, 2, 3, #, #, 4] represents the following binary tree:
<pre>
                 1
                / \
               2   3
              /
             4
</pre>

  
  
## Question 14
Implement a recursive, post-order traversal of a given binary tree, return the list of keys of each node in the tree as it is post-order traversed.
### Examples
<pre>
            5
          /  \
         3    8
        / \    \
       1   4    11
</pre>
Post-order traversal is [1, 4, 3, 11, 8, 5]
### Corner Cases
- What if the given binary tree is null? Return an empty list in this case.
- How is the binary tree represented?
- We use the level order traversal sequence with a special symbol "#" denoting the null node.
### Example:
The sequence [1, 2, 3, #, #, 4] represents the following binary tree:
<pre>
             1
            / \
           2   3
              /
             4
</pre>

## Question 15
Find the height of binary tree.
### Examples:
<pre>
            5
          /  \
         3    8
        / \    \
       1   4    11
</pre>
The height of above binary tree is 3.
### How is the binary tree represented?
We use the level order traversal sequence with a special symbol "#" denoting the null node.
### Example:
The sequence [1, 2, 3, #, #, 4] represents the following binary tree:
<pre>
         1
        / \
       2   3
          /
         4
</pre>
