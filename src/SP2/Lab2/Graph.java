package SP2.Lab2;

public class Graph {
    private static int result;
    private static int A[];
    private static String space = "";
    private static String graph = "";

    public static void control(int A[]) {
        Graph.A = A;
        recurse(0);
        System.out.print("    "+result);
        System.out.print(graph);

    }

    private static int recurse(int indx) {
        if (indx < A.length) {
            graph = graph  + "\n"+space()+"   /\\" + "\n" + space() + A[indx] + "   "  ;
            if (indx < A.length-1 )
                graph = graph + "result"+ "\n"+ space() +"    + ";
            result = A[indx] + recurse(indx + 1);
        }
        return result;

    }

    private static String space() {
        return space = space + " ";
    }


}
