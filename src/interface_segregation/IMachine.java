package interface_segregation;

public interface IMachine {
    void print(Document document);
    void scan(Document document);
    void fax(Document document);
}

interface IPrinter {
    void print(Document document);
}

interface IScan {
    void scan(Document document);
}

interface IFax {
    void fax(Document document);
}
