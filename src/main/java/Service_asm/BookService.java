package Service_asm;

import Asm_Models.Books;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;

public class BookService {

    public List<Books> read(String path) throws IOException{
        List<Books> book = new ArrayList<>();
        Path pathFiletoRead = Paths.get(path);
        List<String> allLine = Files.readAllLines(pathFiletoRead);

    for(int i = 0; i < allLine.size();i++) {
        String line = allLine.get(i);
        String[] data = line.split(",");

        Books bk = new Books(data[0], data[1], data[2], data[3], data[4]);
        book.add(bk);
    }
        return book;
    }

    public void write(String path, List<Books> books) throws IOException{

        List<String> list = new ArrayList<>();

        for(int i = 0; i < books.size(); i++){
            Books book = books.get(i);

            list.add(book.toString());
        }
        Path pathFileToWrite = Paths.get(path);

        Files.write(pathFileToWrite, list);
    }
}