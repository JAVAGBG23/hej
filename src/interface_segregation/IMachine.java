package interface_segregation;

public interface IMachine {
    void print(Document document);
    void scan(Document document);
    void fax(Document document);
}
