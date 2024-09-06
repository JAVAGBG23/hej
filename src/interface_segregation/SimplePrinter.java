package interface_segregation;

public class SimplePrinter implements IMachine{
    @Override
    public void print(Document document) {
        System.out.println("Printing document " + document.getContent());
    }

    @Override
    public void scan(Document document) {
        throw new UnsupportedOperationException("Scan not supported by SimplePrinter");
    }

    @Override
    public void fax(Document document) {
        throw new UnsupportedOperationException("Fax not supported by SimplePrinter");
    }
}
