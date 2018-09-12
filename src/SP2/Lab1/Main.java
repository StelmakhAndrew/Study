package SP2.Lab1;

public class Main {
    public static void main(String[] args) {
        Table table = new Table(10);
        table.putElement("PartiCipate");
        table.putElement("Bugard");
        table.putElement("TBugard");
        table.putElement("GBugard");
        System.out.println(table);
        System.out.println(table.searchSame("fARaOn"));
        System.out.println(table.searchSame("Atrium"));
        System.out.println(table.searchSame("xxxxx"));
        System.out.println(table.searchSame("Buga"));
        System.out.println(table.searchSame("Buga"));
        System.out.println(table.searchSame("Buga"));
        System.out.println(table.searchSame("Cip"));
    }
}