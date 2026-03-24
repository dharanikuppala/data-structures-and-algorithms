# data-structures-and-algorithms
Daily DSA practice - Problems everyday with explanations and complexity analysis  
All solutions are written in Java


## Arrays
### Easy
1. Two sum - [Problem Link](https://leetcode.com/problems/two-sum/) , [Solution](01-arrays/01_two_sum.java) , Pattern: HashTable 
2. Concatenation of Array - [Problem Link](https://leetcode.com/problems/concatenation-of-array/) , [Solution](01-arrays/02_concatenation_of_array.java) , Pattern: Direct Index Mapping    
3. Build Array from Permutation - [Problem Link](https://leetcode.com/problems/build-array-from-permutation/) , [Solution](01-arrays/03_build_array_from_permutation.java) , Pattern: Direct Index Mapping    
4. Richest Customer Wealth - [Problem Link](https://leetcode.com/problems/richest-customer-wealth/) , [Solution](01-arrays/05_richest_customer_wealth.java) , Pattern: Matrix Traversal
5. Shuffle the Array - [Problem Link](https://leetcode.com/problems/shuffle-the-array/) , [Solution](01-arrays/06_shuffle_the_array.java) , Pattern: Direct Index Mapping  
6. Find Numbers with Even Number of Digits - [Problem Link](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/) , [Solution](01-arrays/07_find_numbers_with_even_number_of_digits.java) , Pattern: Digit Counting
7. Move Zeroes - [Problem Link](https://leetcode.com/problems/move-zeroes/) , [Solution](01-arrays/12_move_zeroes.java) , Pattern: Two Pointer
8. Flipping an Image - [Problem Link](https://leetcode.com/problems/flipping-an-image/) , [Solution](01-arrays/14_flipping_an_image.java) , Pattern: Two Pointer + Bit Manipulation
9. Best Time to Buy and Sell Stock - [Problem Link](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) , [Java Solution](01-arrays/17_best_time_to_buy_sell_stock.java) , Pattern: Greedy (Running Minimum)
10. Majority Element - [Problem Link](https://leetcode.com/problems/majority-element/) , [Solution](01-arrays/18_majority_element.java) , Pattern: Frequency Counting
11. Running sum of 1D array - [Problem Link](https://leetcode.com/problems/running-sum-of-1d-array/) , [Solution](01-arrays/19_running_sum_of_1d_array.java) , Pattern: Traverse the array  
   
### Medium
1. Two Sum II - Input Array Is Sorted - [Problem Link](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) , [Solution](01-arrays/04_two_sum_ii.java) , Pattern: Two Pointer
2. Find the Duplicate Number - [Problem Link](https://leetcode.com/problems/find-the-duplicate-number/) , [Solution](01-arrays/07_find_duplicate.java) , Pattern: Floyd's Cycle Detection
3. Find All Duplicates in an Array - [Problem Link](https://leetcode.com/problems/find-all-duplicates-in-an-array/) , [Solution](01-arrays/08_find_all_duplicates.java) , Pattern: Cyclic Sort
4. Search a 2D Matrix II - [Problem Link](https://leetcode.com/problems/search-a-2d-matrix-ii/) , [Solution](01-arrays/11_search_2d_matrix_ii.java) , Pattern: Staircase Search
5. Search a 2D Matrix - [Problem Link](https://leetcode.com/problems/search-a-2d-matrix/) , [Solution](01-arrays/13_search_matrix_binary.java) , Pattern: Binary Search
6. Count Primes - [Problem Link](https://leetcode.com/problems/count-primes/) , [Solution](01-arrays/15_count_primes.java) , Pattern: Sieve of Eratosthenes
7. Maximum Subarray - [Problem Link](https://leetcode.com/problems/maximum-subarray/) , [Solution](01-arrays/16_maximum_subarray.java) , Pattern: Kadane’s Algorithm     

### Hard
1. First Missing Positive - [Problem Link](https://leetcode.com/problems/first-missing-positive/) , [Solution](01-arrays/09_first_missing_positive.java) , Pattern: Cyclic Sort


---
## Searching
### Easy 
1. Find Smallest Letter Greater Than Target - [Problem Link](https://leetcode.com/problems/find-smallest-letter-greater-than-target/) , [Solution](02-searching/01_next_greatest_letter.java) , Pattern: Binary Search (Upper Bound)

### Medium 
1. Find First and Last Position of Element in Sorted Array - [Problem Link](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) , [Solution](02-searching/02_search_range.java) , Pattern: Binary Search (Lower & Upper Bound)
2. Search in Rotated Sorted Array - [Problem Link](https://leetcode.com/problems/search-in-rotated-sorted-array/) , [Solution](02-searching/03_search_rotated_array.java) , Pattern: Modified Binary Search
3. Search in Rotated Sorted Array - [Problem Link](https://leetcode.com/problems/search-in-rotated-sorted-array/) , [Solution](02-searching/05_search_rotated_sorted_array.java) , Pattern: Modified Binary Search (Rotated Array Logic) 

### Hard
1. Split Array Largest Sum - [Problem Link](https://leetcode.com/problems/split-array-largest-sum/) , [Solution](02-searching/04_split_array_largest_sum.java) , Pattern: Binary Search on Answer

---
## Sorting  
### Easy  
1. Missing Number - [Problem Link](https://leetcode.com/problems/missing-number/) , [Solution](03-sorting/01_missing_number.java) , Pattern: Cyclic Sort
### Medium  
1. Merge Intervals - [Problem Link](https://leetcode.com/problems/merge-intervals/) , [Solution](03-sorting/02_merge_intervals.java) , Pattern: Sorting / Greedy
### Hard
---
## Strings
### Easy
1. Valid Palindrome - [Problem Link](https://leetcode.com/problems/valid-palindrome/) , [Solution](04-strings/01_valid_palindrome.java) , Pattern: Two Pointer (String)
2. Valid Anagram - [Problem Link](https://leetcode.com/problems/valid-anagram/) , [Solution](04-strings/02_valid_anagram.java) , Pattern: Frequency Counting
3. Reverse String - [Problem Link](https://leetcode.com/problems/reverse-string/) , [Solution](04-strings/04_reverse_string.java) , Pattern: Two Pointers
4. First Unique Character in a String - [Problem Link](https://leetcode.com/problems/first-unique-character-in-a-string/) , [Solution](04-strings/05_first_unique_character_in_a_string.java) , Pattern: Frequency Counting
5. To Lower Case - [Problem Link](https://leetcode.com/problems/to-lower-case/) , [Solution](04-strings/07_to_lower_case.java) , Pattern: String Manipulation / ASCII
6. Robot Return to Origin - [Problem Link](https://leetcode.com/problems/robot-return-to-origin/) , [Solution](04-strings/08_robot_return_to_origin.java) , Pattern: Simulation / Coordinate Tracking

### Medium  
1. Group Anagrams - [Problem Link](https://leetcode.com/problems/group-anagrams/) , [Solution](04-strings/03_group_anagrams.java) , Pattern: Hash Table / Character Frequency
2. Longest Substring Without Repeating Characters - [Problem Link](https://leetcode.com/problems/longest-substring-without-repeating-characters/) , [Solution](04-strings/06_longest_substring_without_repeating_characters.java) , Pattern: Sliding Window / Two Pointers

### Hard


---
## Recursion  
### Easy   
1. Number of Steps to Reduce a Number to Zero - [Problem Link](https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/) , [Solution](01-arrays/15_number_of_steps.java) , Pattern: Recursion / Bit Manipulation
2. Happy Number - [Problem Link](https://leetcode.com/problems/happy-number/) , [Solution](05-recursion/02_happy_number.java) , Pattern: Floyd’s Cycle Detection

### Medium
### Hard
---
## LinkedList
### Easy 
1. Remove Duplicates from Sorted List - [Problem Link](https://leetcode.com/problems/remove-duplicates-from-sorted-list/) , [Solution](06-linkedlist/01_remove_duplicates_sorted_list.java) , Pattern: Linked List Traversal
2. Merge Two Sorted Lists - [Problem Link](https://leetcode.com/problems/merge-two-sorted-lists/) , [Solution](06-linkedlist/02_merge_two_sorted_lists.java) , Pattern: Two Pointer (Linked List Merge)
3. Middle of the Linked List - [Problem Link](https://leetcode.com/problems/middle-of-the-linked-list/) , [Solution](06-linkedlist/03_middle_of_linked_list.java) , Pattern: Fast & Slow Pointer
4. Linked List Cycle - [Problem Link](https://leetcode.com/problems/linked-list-cycle/) , [Solution](06-linkedlist/04_linked_list_cycle.java) , Pattern: Fast & Slow Pointer
5. Reverse Linked List - [Problem Link](https://leetcode.com/problems/reverse-linked-list/) , [Solution](06-linkedlist/05_reverse_linked_list.java) , Pattern: Linked List Reversal
6. Palindrome Linked List - [Problem Link](https://leetcode.com/problems/palindrome-linked-list/) , [Solution](06-linkedlist/08_palindrome_linked_list.java) ,Pattern: Fast & Slow + Reverse List
7. Intersection of Two Linked Lists - [Problem Link](https://leetcode.com/problems/intersection-of-two-linked-lists/) , [Solution](06-linkedlist/10_intersection_of_two_linked_lists.java) , Pattern: Two Pointer Alignment  

### Medium  
1. Odd Even Linked List - [Problem Link](https://leetcode.com/problems/odd-even-linked-list/) , [Solution](06-linkedlist/06_odd_even_linked_list.java) , Pattern: Linked List Reordering
2. Sort List - [Problem Link](https://leetcode.com/problems/sort-list/) , [Solution](06-linkedlist/07_sort_list.java) , Pattern: Merge Sort (Linked List)
3. Linked List Cycle II - [Problem Link](https://leetcode.com/problems/linked-list-cycle-ii/) , [Solution](06-linkedlist/09_linked_list_cycle_ii.java) , Pattern: Floyd’s Cycle Detection
4. Swap Nodes in Pairs - [Problem Link](https://leetcode.com/problems/swap-nodes-in-pairs/) , [Solution](06-linkedlist/11_swap_nodes_in_pairs.java) , Pattern: Linked List / Pointer Manipulation

### Hard
---
## Stack
### Easy 
1. Valid Parentheses - [Problem Link](https://leetcode.com/problems/valid-parentheses/) , [Solution](07-stack/01_valid_parentheses.java) , Pattern: Stack
2. Next Greater Element I - [Problem Link](https://leetcode.com/problems/next-greater-element-i/) , [Solution](07-stack/02_next_greater_element.java) , Pattern: Monotonic Stack

### Medium

### Hard

---
## Queues  
### Easy  
1. Implement Queue using Stacks - [Problem Link](https://leetcode.com/problems/implement-queue-using-stacks/) , [Solution](08-queues/01_queue_using_stacks.java) , Pattern: Stack Simulation  
---
## Trees
### Easy
1. Average of Levels in Binary Tree - [Problem Link](https://leetcode.com/problems/average-of-levels-in-binary-tree/) , [Solution](09-trees/01_average_of_levels_in_binary_tree.java) , Pattern: BFS (Level Order Traversal)
2. Cousins in Binary Tree - [Problem Link](https://leetcode.com/problems/cousins-in-binary-tree/) , [Solution](09-trees/06_cousins_in_binary_tree.java) , Pattern: DFS (Depth + Parent Check)
3. Symmetric Tree - [Problem Link](https://leetcode.com/problems/symmetric-tree/) , [Solution](09-trees/07_symmetric_tree.java) , Pattern: DFS (Mirror Comparison)
4. Same Tree - [Problem Link](https://leetcode.com/problems/same-tree/) , [Solution](09-trees/08_same_tree.java) , Pattern: DFS (Tree Comparison)
5. Diameter of Binary Tree - [Problem Link](https://leetcode.com/problems/diameter-of-binary-tree/) , [Solution](09-trees/09_diameter_of_binary_tree.java) , Pattern: DFS (Tree DP)
6. Invert Binary Tree - [Problem Link](https://leetcode.com/problems/invert-binary-tree/) , [Solution](09-trees/10_invert_binary_tree.java) , Pattern: DFS (Tree Transformation)
7. Maximum Depth of Binary Tree - [Problem Link](https://leetcode.com/problems/maximum-depth-of-binary-tree/) , [Solution](09-trees/11_maximum_depth_of_binary_tree.java) , Pattern: DFS (Tree Height Calculation)
8. Convert Sorted Array to Binary Search Tree - [Problem Link](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/) , [Solution](09-trees/12_convert_sorted_array_to_bst.java) , Pattern: Divide & Conquer (Balanced BST Construction)
9. Binary Tree Inorder Traversal - [Problem Link](https://leetcode.com/problems/binary-tree-inorder-traversal/) , [Solution](09-trees/16_binary_tree_inorder_traversal.java) , Pattern: DFS / Inorder Traversal
10. Search in a Binary Search Tree - [Problem Link](https://leetcode.com/problems/search-in-a-binary-search-tree/) , [Solution](09-trees/18_search_in_bst.java) , Pattern: Binary Search Tree / Recursion

### Medium
1. Binary Tree Level Order Traversal - [Problem Link](https://leetcode.com/problems/binary-tree-level-order-traversal/) , [Solution](09-trees/02_binary_tree_level_order.java) , Pattern: BFS (Level Order Traversal)
2. Binary Tree Zigzag Level Order Traversal - [Problem Link](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/) , [Solution](09-trees/03_zigzag_level_order.java) , Pattern: BFS + Deque
3. Binary Tree Level Order Traversal II - [Problem Link](https://leetcode.com/problems/binary-tree-level-order-traversal-ii/) , [Solution](09-trees/04_level_order_bottom.java) , Pattern: BFS (Bottom-Up)
4. Binary Tree Right Side View - [Problem Link](https://leetcode.com/problems/binary-tree-right-side-view/) , [Solution](09-trees/05_right_side_view.java) , Pattern: BFS (Level-Based View)
5. Flatten Binary Tree to Linked List - [Problem Link](https://leetcode.com/problems/flatten-binary-tree-to-linked-list/) , [Solution](09-trees/13_flatten_binary_tree.java) , Pattern: DFS (Tree Rewiring)
6. Lowest Common Ancestor of a Binary Tree - [Problem Link](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/) , [Solution](09-trees/14_lowest_common_ancestor.java) , Pattern: DFS (Post-order)
7. Construct Binary Tree from Preorder and Inorder Traversal - [Problem Link](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) , [Solution](09-trees/15_construct_tree_preorder_inorder.java) , Pattern: Divide & Conquer (Tree Construction)
8. Find Bottom Left Tree Value - [Problem Link](https://leetcode.com/problems/find-bottom-left-tree-value/) , [Solution](09-trees/17_find_bottom_left_tree_value.java) , Pattern: BFS / Level Order Traversal

---
## Heaps

---
## Dynamic Programming

### Easy
1. Climbing Stairs - [Problem Link](https://leetcode.com/problems/climbing-stairs/) , [Solution](11-dynamic-programming/1_climbing_stairs.java) , Pattern: Dynamic Programming / Fibonacci

### Medium

### Hard

   
---------------------
 *** STATS ***
- Total Problems Solved: 68        
- Easy: 41  
- Medium: 25   
- Hard: 2 
