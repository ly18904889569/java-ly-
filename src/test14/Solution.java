package test14;

import java.util.LinkedList;


/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//crazy:现在编程首先想算法和数据结构。用什么数据结构存储数据比较好，用什么算法解决问题比较好
public class Solution {
//	深度优先遍历使用递归的方法
    public int run(TreeNode root) {
    	if(root == null)
    	{
    		return 0;
    	}
    	int l = run(root.left);
		int r = run(root.right);
		if(l==0||r==0)
		{
			return l+r+1;
		}
    	return Math.min(l, r);
    }
    
//    来个非递归的，思路是层序遍历，找到第一个左右结点都为null的情况，就返回
    public int run2(TreeNode root)
    {
    	if(root == null)
    	{
    		return 0;
    	}
    	if(root.left==null&&root.right==null)
    	{
    		return 1;
    	}
    	LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
    	TreeNode curNode;
    	int depth=0;
    	queue.offer(root);
    	if(!queue.isEmpty())
    	{
    		int len = queue.size();
    		depth++;
    		//每一次进这个循环就表示对一层就行遍历
    		for(int i=0;i<len;i++)
    		{
    			curNode = queue.poll();
        		if(curNode.left==null&&curNode.right==null)
        		{
        			return depth;
        		}
        		if(curNode.left!=null)
        		{
        			queue.offer(curNode.left);
        		}
        		if(curNode.right!=null)
        		{
        			queue.offer(curNode.right);
        		}
    		}

    	}
    	
    	return 0;
    }
}
