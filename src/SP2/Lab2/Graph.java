package SP2.Lab2;

public class Graph {
//    private static String[] signals = {"342", "dfds", "4353", "erew", "dlm", "dlm", "dlm", "erer", "e"};
    private static String[] signals = {"dlm", "dlm", "ctz", "Itr", "cfz", "dlq", "Itr", "Itr"};
    //    private static String[] signals = {"dlm", "dlm", "dlm"};
//    private static String[] signals = {"342", "dfds", "4353", "erew", "erer", "e" , "dfdfs" , "dIm", "ltr"};
    private static State[] mapSignals = {
            new State(2, 2),
            new State(3, 7),
            new State(4, 4),
            new State(2, 5),
            new State(6, 6),
            new State(7, 7),
            new State(8, 8)
    };
    private static int startState = 1;
    private static int currentState = startState;

    public static void main(String[] args) {
        automaticMachine();
    }

    private static void automaticMachine() {
        int count = 0;
        if (signals.length == 0) {
            System.out.println("S2");
            return;
        }
        do {
            System.out.print("S" + (currentState + 1));
            String elem = signals[count];
            if (elem.equals("Itr")) {
                currentState = mapSignals[currentState - 1].getItr();
                System.out.print("(Itr)");
            } else if (elem.equals("dlm")) {
                currentState = mapSignals[currentState - 1].getDlm();
                System.out.print("(dlm)");
            }
            System.out.print("-> " + "S" + (currentState + 1) + "\n");
            count++;
        } while (currentState + 1 != 9 && count < signals.length);
    }
}