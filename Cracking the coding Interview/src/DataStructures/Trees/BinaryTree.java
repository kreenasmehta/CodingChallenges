package DataStructures.Trees;

/**
 * Created by kreenamehta on 7/12/16.
 */
public class BinaryTree {

    Node root;

    public BinaryTree(int value){
        root= new Node(value);
    }


    public void inOrder(){
        inOrder(root);
    }
    // in order traversal
    private void inOrder(Node root){
        Node current = root;
        if(current.getLeft()!=null){
            inOrder(current.getLeft());
        }
        System.out.print(root.getValue()+" ");
        if(current.getRight()!=null){
            inOrder(current.getRight());
        }
    }

    public Node getNode(int value){
        return getNode(root, value);
    }

    // get a node given a value
    // if there are duplicate values in a given tree, then it returns the node which is leftmost
    private Node getNode(Node root, int value){
        if(root!=null){
            if(root.getValue() == value){
                return root;
            } else if(root.getValue()>=value){
                return getNode(root.getLeft(),value);
            } else {
                return getNode(root.getRight(),value);
            }
        }
        return null;
    }


    // true if the given node has the right child
    public boolean hasLeftChild(Node node){
        if(node.getLeft()!=null){
            return true;
        }
        return false;
    }

    // true if the given node has the left child
    public boolean hasRightchild(Node node){
        if(node.getRight()!=null){
            return true;
        }
        return false;
    }

    public void add(int value){
        Node child = new Node(value);
        add(root, child);
    }

    private void add(Node root, Node child){
        while (root!=null){
            if(child.getValue() <= root.getValue()){
                if(!hasLeftChild(root)){
                    root.setLeft(child);
                    break;
                } else{
                    add(root.getLeft(),child);
                    break;
                }
            } else{
                if(!hasRightchild(root)){
                    root.setRight(child);
                    break;
                } else{
                    add(root.getRight(), child);
                    break;
                }

            }
        }
    }

    private int getMin(Node root){
        if(root!=null){
            if(root.getLeft()!=null){
                return getMin(root.getLeft());
            }
            return root.getValue();
        }
        return '\0';
    }

    public Node remove(int value){
        return remove(root,value);
    }

    private Node remove(Node root, int value){
        if(root==null){
            return root;
        }
        if(value<root.getValue()){
            root.setLeft(remove(root.getLeft(),value));
        } else if (value>root.getValue()){
            root.setRight(remove(root.getRight(),value));
        } else{
            if(root.getLeft()==null){
                return root.getRight();
            }
            if(root.getRight()==null){
                return root.getLeft();
            }
            root.setValue(getMin(root.getRight()));
            root.setRight(remove(root.getRight(),root.getValue()));
        }
        return root;
    }

    // returns the maximum height of the tree
    public int getHeight(){
        return getHeight(root);
    }

    private int getHeight(Node node){
       if(node==null){
           return 0;
       } else{
           int leftHeight=getHeight(node.getLeft());
           int rightHeight = getHeight(node.getRight());

           if(leftHeight>rightHeight){
               return leftHeight+1;
           } else{
               return rightHeight+1;
           }
       }
    }

    public boolean isBalancedTree(){
        return isBalancedTree(root);
    }

    private boolean isBalancedTree(Node node){
        if(node==null){
            return false;
        } else{
            int leftHeight=getHeight(node.getLeft());
            int rightHeight = getHeight(node.getRight());

            if(leftHeight==rightHeight){
                return true;
            }
            if(leftHeight>rightHeight){
                if(leftHeight-rightHeight==1){
                    return true;
                }
            }
            if(rightHeight>leftHeight){
                if(rightHeight-leftHeight==1){
                    return true;
                }
            }
        }
        return false;
    }





}

class Node{
    private int value;
    private Node left;
    private Node right;

    public Node(int value){
        this.value=value;
        left=null;
        right=null;
    }

    public void setValue(int value){
        this.value=value;
    }

    public int getValue(){
        return value;
    }

    public void setLeft(Node left){
        this.left=left;
    }

    public Node getLeft(){
        return left;
    }

    public void setRight(Node right){
        this.right=right;
    }

    public Node getRight(){
        return right;
    }
}

class BinaryTreeTest{
    public static void main(String args[]){
//        BinaryTree binaryTree = new BinaryTree(10);
//        binaryTree.add(5);
//        binaryTree.add(11);
//        binaryTree.add(7);
//        binaryTree.add(20);
//        binaryTree.add(9);
//        binaryTree.add(6);
//        binaryTree.add(3);
//        binaryTree.add(4);
//        binaryTree.add(19);
//        binaryTree.add(21);
//        binaryTree.inOrder();
//        System.out.println();
//        //binaryTree.remove(10);
//        binaryTree.inOrder();
//        System.out.print(binaryTree.getHeight());
//        int[] arr = {1,2,3,4,5};

        BinaryTree binaryTree1 = new BinaryTree(5);
        binaryTree1.add(3);
        binaryTree1.add(6);
        binaryTree1.add(7);
        binaryTree1.add(8);
        binaryTree1.add(1);
        System.out.println(binaryTree1.isBalancedTree());
    }
}
