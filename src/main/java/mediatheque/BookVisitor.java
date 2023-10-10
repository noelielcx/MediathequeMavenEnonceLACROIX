package mediatheque;

public class BookVisitor implements ItemVisitor{
    public void visit(CD cd) {
    }

    public void visit(Book book) {
        System.out.println("Print "+ book);
    }
}
