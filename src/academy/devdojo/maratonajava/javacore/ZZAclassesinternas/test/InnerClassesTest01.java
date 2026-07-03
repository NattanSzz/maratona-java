package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class InnerClassesTest01 {
    private String name = "Dean";

    class Inner {
        public void printOuterClassAttribute(){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {

    }
}
