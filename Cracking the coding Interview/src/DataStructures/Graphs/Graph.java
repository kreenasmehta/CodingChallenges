package DataStructures.Graphs;

import DataStructures.StacksAndQueues.SimpleQueue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by kreenamehta on 7/13/16.
 *
 * Graph using adjacency list.
 *
 */
public class Graph {

    HashMap<Node,ArrayList<Node>> graph;

    public Graph(){
        graph = new HashMap<>();
    }

    public void addNode(int value){
        Node newNode = new Node(value);
        if(!graph.containsKey(newNode)){
            graph.put(newNode,newNode.getChildren());
        } else{
            System.out.println("Given node already exists.");
        }
    }

    public void createEdge(Node source, Node destination){
        if(!graph.containsKey(source)){
            System.out.println("Source node does not exist in the graph.");
            return;
        }
        if(!graph.containsKey(destination)){
            System.out.println("Destination node does not exist in the graph.");
            return;
        }
        source.addChild(destination);
    }

    public void printGraph(){
        for(Node node:graph.keySet()){
            System.out.print(node.getValue()+"->");
            ArrayList<Node> children = node.getChildren();
            if(children.size()<1){
                System.out.print("Node destination");
            } else{
                for(Node child:children){
                    System.out.print(child.getValue()+" ");
                }
            }
            System.out.println();
        }
    }

    public Node getNode(int value){
        for(Node node : graph.keySet()){
            if(node.getValue()==value){
                return node;
            }
        }
        return null;
    }

    public boolean hasNode(Node node){
        return graph.containsKey(node);
    }

    public void depthFirstSearch(Node node){
        if(hasNode(node)){
            if(!node.isVisited()){
                visit(node);
                ArrayList<Node> children = node.getChildren();
                for(Node child: children){
                    depthFirstSearch(child);
                }
            }

        }
    }

    public void breadthFirstSearch(Node node){
        if(hasNode(node)){
            SimpleQueue queue = new SimpleQueue();
            queue.enqueue(node.getValue());
            while(!queue.isEmpty()){
                int value = queue.dequeue();
                Node n = getNode(value);
                if(n.isVisited()){
                    continue;
                }
                visit(n);
                ArrayList<Node> children = n.getChildren();
                for(Node child : children){
                    if(!child.isVisited()){
                        queue.enqueue(child.getValue());
                    }
                }
            }
        }
    }

    public boolean doesPathExist(Node source, Node destination){
        SimpleQueue queue=new SimpleQueue();
        queue.enqueue(source.getValue());{
            while (!queue.isEmpty()){
                int value=queue.dequeue();
                Node n = getNode(value);
                if(n.equals(destination)){
                    return true;
                }
                visit(n);
                ArrayList<Node> children = n.getChildren();
                for(Node child : children){
                    if(!child.isVisited()){
                        queue.enqueue(child.getValue());
                    }
                }
            }
        }
        return false;
    }

    public void visit(Node node){
        System.out.print(node.getValue()+" ");
        node.setVisited(true);
    }
}

class Node{

    private int value;
    private ArrayList<Node> children;
    private boolean isVisited;

    public Node(int value){
        this.value = value;
        children=new ArrayList<>();
        isVisited=false;
    }

    public void setValue(int value){
        this.value=value;
    }

    public int getValue(){
        return value;
    }

    public void addChild(Node child){
        children.add(child);
    }

    public ArrayList<Node> getChildren(){
        return children;
    }

    public void setVisited(boolean isVisited){
        this.isVisited=isVisited;
    }

    public boolean isVisited(){
        return isVisited;
    }
}

class GraphTest{
    public static void main(String args[]){
        Graph graph=new Graph();
        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addNode(4);
        graph.addNode(5);
        graph.addNode(6);
        graph.createEdge(graph.getNode(1),graph.getNode(2));
        graph.createEdge(graph.getNode(2),graph.getNode(3));
        graph.createEdge(graph.getNode(3),graph.getNode(4));
        graph.createEdge(graph.getNode(4),graph.getNode(6));
        graph.createEdge(graph.getNode(1),graph.getNode(4));
        graph.createEdge(graph.getNode(1),graph.getNode(5));
        graph.createEdge(graph.getNode(5),graph.getNode(6));
        //graph.printGraph();
        //System.out.println("--- DFS ---");
        //graph.depthFirstSearch(graph.getNode(1));
        //graph.breadthFirstSearch(graph.getNode(1));
        System.out.println(graph.doesPathExist(graph.getNode(1),graph.getNode(6)));
    }
}
