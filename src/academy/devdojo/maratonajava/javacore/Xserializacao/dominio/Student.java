package academy.devdojo.maratonajava.javacore.Xserializacao.dominio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUIO = 12345676543L;
    private long id;
    private String name;
    private transient String password;
    private static final String SCHOOL_NAME = "DevDojo Viradão no Jiraya";
    private transient StudentClass studentClass;

    public Student(long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Serial
    private void writeObject(ObjectOutputStream oos) {
        try{
            oos.defaultWriteObject();
            oos.writeUTF(studentClass.getName());
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois) {
        try{
            ois.defaultReadObject();
            String className = ois.readUTF();
            studentClass = new StudentClass(className);
        }catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Student ID: " + id + "\nname: " + name + "\npassword=" + password + "\nSchool Name: " + SCHOOL_NAME + "\nClass: " + studentClass;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public StudentClass getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(StudentClass studentClass) {
        this.studentClass = studentClass;
    }
    
}
