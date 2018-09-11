package SP2.Lab1;

public class Main {
    public static void main(String[] args) {
        Table table = new Table(10);
        table.putElement("GARAnt");
        System.out.println(table.choiceElem("Ant"));
//        System.out.println(table.choiceElem("jant"));
//        System.out.println(table.choiceElem("jt"));
//        System.out.println(table.choiceElem("jt"));
        System.out.println(table);

    }
}
