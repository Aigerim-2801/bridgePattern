public class LinearNotebook extends Notebook{
    LinearNotebook(Page page) {
        super(page);
    }
    public void request() {
        System.out.print("Request for Linear Notebook: ");
        page.write();
    }
}
