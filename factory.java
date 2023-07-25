abstract class Document {
    //...
}

class PDFDocument extends Document {
    //...
}

class WordDocument extends Document {
    //...
}

class DocumentFactory {
    static Document createDocument(String type) {
        switch (type) {
            case "pdf":
                return new PDFDocument();
            case "word":
                return new WordDocument();
            default:
                return null;
        }
        // better implementation would be to use map
    }
}
