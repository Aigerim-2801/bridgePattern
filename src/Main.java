public class Main {

    public static void main(String[] args) {
        Notebook a = new LinearNotebook(new SmallPage()); a.request();
        a.setPrint(new MiddlePage()); a.request();
        a.setPrint(new LargePage()); a.request();
        Notebook b =new CellularNotebook(new SmallPage()); b.request();
        b.setPrint(new MiddlePage()); b.request();
        b.setPrint(new LargePage()); b.request();
    }
}
