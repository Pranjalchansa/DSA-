abstract class Document {
    abstract void save(); 
}
class PDFDocument extends Document {
    void save() {
        System.out.println("Saving document as PDF");
    }
}
class WordDocument extends Document {
    void save() {
        System.out.println("Saving document as Word file");
    }
}
public class abstractdocument {
    public static void main(String[] args) {
        Document d1 = new PDFDocument();
        Document d2 = new WordDocument();
        d1.save();
        d2.save();
    }
}
