package interface_segregation;

public class SimplePrinter implements IPrinter{
    @Override
    public void print(Document document) {
        System.out.println("Printing document " + document.getContent());
    }
}
