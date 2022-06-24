// https://leetcode.com/problems/binary-tree-maximum-path-sum/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
//public class maxpathsum {
//    public int maxPathSum(TreeNode root) {
//        int[] currMax = new int[]{Integer.MIN_VALUE,Integer.MIN_VALUE};
//        maxPathSum(root, currMax);
//        return currMax[1];
//    }
//
//    public void maxPathSum(TreeNode root, int[] currMax) {
//        if (root == null) return;
//
//        int curr = currMax[0];
//        maxPathSum(root.left, currMax);
//        int leftCurr = currMax[0];
//
//        currMax[0] = curr;
//        maxPathSum(root.right, currMax);
//        int rightCurr = currMax[0];
//
//        int max = root.val;
//        max += leftCurr > 0 ? leftCurr : 0;
//        max += rightCurr > 0 ? rightCurr : 0;
//        int currSide = leftCurr > currMax[0] ? leftCurr : currMax[0];
//
//        currMax[0] = root.val + (currSide > 0 ? currSide : 0);
//        currMax[1] = max > currMax[1] ? max : currMax[1];
//    }
//
//}
