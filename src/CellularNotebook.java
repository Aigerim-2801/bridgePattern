public class CellularNotebook extends Notebook{
    CellularNotebook(Page page) {
        super(page);
    }
    public void request() {
        System.out.print("Request for Cellular Notebook: ");
        page.write();
    }
}
