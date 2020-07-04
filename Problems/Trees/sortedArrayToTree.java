package Problems.Trees;
import java.util.*;

/*
    Convert Sorted Array to Binary Search Tree

Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Example:

Given the sorted array: [-10,-3,0,5,9],

One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

      0
     / \
   -3   9
   /   /
 -10  5 */

public class sortedArrayToTree {
    public TreeNode sortedArrayToBST(int[] nums){
        if(nums.length == 0) return null;
        return constructTreeFromArray(nums, 0, nums.length - 1);
    }

    public TreeNode constructTreeFromArray(int[] nums, int left, int right){
        if(left > right) return null;
        int midpoint = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[midpoint]);
        node.left = constructTreeFromArray(nums, left, midpoint - 1);
        node.right = constructTreeFromArray(nums, midpoint+1, right);
        return node;
    }
}