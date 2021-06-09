package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    public static void main(String[] args) throws IOException {

//        boolean exists = file.exists();
//
//        //Wyjątek który trzeba obsłużyć
//        try {
//            Scanner scanner = new Scanner(file);
//        } catch (FileNotFoundException e) {
//            //Podaje informacje że nie można odnaleźć określonego pliku
//            e.printStackTrace();
//            //lub e.getMessage() żeby wyświetlić samą wiadomość bez drzewa wywołań
//            System.out.println(e.getMessage());
//        }
        File file2 = new File("TEXT2.txt");
        if(file2.exists()){
            Scanner scanner=new Scanner(file2);
            System.out.println(scanner.nextLine());
        }else{
            // rzucanie stworzonym przez nas wyjątkiem FileNotExistException
            //tak
//            FileNotExistException fileNotExistException=new FileNotExistException();
//            throw fileNotExistException;
            //lub
            throw new FileNotExistException("Plik nie istnieje !");
        }


        try {
            run();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void run() throws IOException {
        File file = new File("text.txt");
        FileWriter writer = new FileWriter(file);
        writer.write("To jest tylko test");
        writer.close();
    }
}