package academy.devdojo.maratonajava.javacore.Xserializacao.test;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Student;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Student student = new Student(1L, "Willian Suane", "123412121");
        serialize(student);
        desserialize();
    }

    private static void serialize(Object object){
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("folder/aluno.ser")))){
            oos.writeObject(object);
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    private static void desserialize(){
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get("folder/aluno.ser")))){
            Student student = (Student) ois.readObject();
            System.out.println(student);
        }catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
