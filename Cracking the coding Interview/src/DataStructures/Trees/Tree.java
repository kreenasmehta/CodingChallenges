package DataStructures.Trees;

import java.util.ArrayList;

/**
 * Created by kreenamehta on 7/17/16.
 *
 */
public class Tree{

    static int preIndex = 0;

    public static TreeNode buildTree(int[] inOrder, int[] preOrder, int start, int end){

        if (start>end){
            return null;
        }

        TreeNode tNode = new TreeNode(preOrder[preIndex++]);

        if(start==end){
            return tNode;
        }

        int inOrderIndex = getInOrderIndex(inOrder,tNode.getData(),start,end);

        tNode.setLeft(buildTree(inOrder,preOrder,start,inOrderIndex-1));
        tNode.setRight(buildTree(inOrder,preOrder,inOrderIndex+1,end));

        return tNode;
    }



    private static int getInOrderIndex(int[] inOrder, int data, int start, int end){
        int i;
        for(i=start;i<end;i++){
            if(inOrder[i] == data){
                return i;
            }
        }
        return i;
    }

    public static boolean isBST(TreeNode node){
        ArrayList<Integer> inOrderList = new ArrayList();
        inOrderList = getInOrder(node,inOrderList);
        for(int i=0;i<inOrderList.size()-2;i++){
            if(inOrderList.get(i)>inOrderList.get(i+1)){
                return false;
            }
        }
        return true;

    }

    static int minData = Integer.MIN_VALUE;
    public static boolean isBST1(TreeNode node){
        if(node==null){
            return true;
        }
        if(node.getLeft()!=null){
            if(!isBST1(node.getLeft())){
                return false;
            }
        }
        if(node.getData()<minData){
            return false;
        }
        minData=node.getData();
        if(node.getRight()!=null){
            if(!isBST1(node.getRight())){
                return false;
            }
        }

        return true;
    }

    public static ArrayList getInOrder(TreeNode node, ArrayList inOrderList){
        if(node.getLeft()!=null){
            getInOrder(node.getLeft(),inOrderList);
        }
        inOrderList.add(node.getData());
        if(node.getRight()!=null){
            getInOrder(node.getRight(),inOrderList);
        }
        return inOrderList;
    }



    public static class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data=data;
            left=null;
            right=null;
        }

        public void setData(int data){
            this.data=data;
        }

        public int getData(){
            return data;
        }

        public void setLeft(TreeNode left){
            this.left=left;
        }

        public TreeNode getLeft(){
            return left;
        }

        public void setRight(TreeNode right){
            this.right=right;
        }

        public TreeNode getRight(){
            return right;
        }


    }
}

class TreeTest{

    public static void main(String args[]){
        int[] inOrder = {2,3,4,5,6,7,8,10,11,12,15,16,17,1};
        int[] preOrder = {10,5,4,2,3,7,6,8,15,11,12,17,16,1};
        int start = 0;
        int end = inOrder.length-1;
        Tree.TreeNode tree = Tree.buildTree(inOrder,preOrder,start,end);
        boolean temp = Tree.isBST1(tree);
    }
}


