package Beginner;

public class MaximumEdgeOfATriangle {
    public static int nextEdge(int side1, int side2){
        return (side1+side2)-1;
    }
    public static void main(String[] args) {
        System.out.println(nextEdge(8,10));
    }
}
