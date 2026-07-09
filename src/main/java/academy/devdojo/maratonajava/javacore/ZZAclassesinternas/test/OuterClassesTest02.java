package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest02 {
    private String name = "Sam";

    void print(String msg) {
        class LocalClass {
            public void printLocal() {
                System.out.println(name);
                for(int i = 0; i < msg.length(); i++){
                    System.out.print(msg.charAt(i));
                    try{
                        Thread.sleep(100);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }
    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print("Salvar pessoas, caçar coisas. O negócio da família.");
    }
}
