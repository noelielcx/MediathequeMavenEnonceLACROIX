package mediatheque;

public class CDVisitor implements ItemVisitor{

    public void visit(Book book) {
    }

    public void visit(CD cd) {
        System.out.println("Print "+ cd);
    }
}
