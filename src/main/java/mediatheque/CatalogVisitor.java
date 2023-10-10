package mediatheque;

public class CatalogVisitor implements ItemVisitor{

    public void visit(Book book) {
        System.out.println("Print "+ book);
    }
    public void visit(CD cd) {
        System.out.println("Print "+ cd);
    }


}
