package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        openFile();
        openFile2();
    }

    private static String openFile() {
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo no arquivo");
            return "Conexão aberta";
        }catch(Exception e) {
            e.printStackTrace();
        }finally{
            System.out.println("Fechando arquivo");
        }
        return null;
    }

    private static void openFile2() {
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo no arquivo");
        }finally{
            System.out.println("Fechando arquivo");
        }
    }
}
