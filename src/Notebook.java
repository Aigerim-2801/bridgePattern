abstract class Notebook {
    Page page;

    public void setPrint(Page page) {
        this.page = page;
    }

    Notebook(Page page){
        this.page = page;
    }
    void request() {
      page.write();
    }
}
