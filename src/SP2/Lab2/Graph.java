package SP2.Lab2;

public class Graph {
    private static String[] signals = {"342", "dfds", "4353", "erew", "dlm", "dlm", "dlm", "erer", "e"};
    private static State[] mapSignals = {new State(2, 2),
            new State(7, 3),
            new State(4, 4),
            new State(5, 2),
            new State(6, 6),
            new State(7, 7),
            new State(8, 8)};
    private static int startState = 1;
    private static int currentState = startState;

    public static void main(String[] args) {
        automaticMachine();
    }

    private static void automaticMachine() {
        int count = 0;
        do {
            System.out.print("S" + (currentState + 1));
            String elem = signals[count];
            if (elem.equals("Iter")) {
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