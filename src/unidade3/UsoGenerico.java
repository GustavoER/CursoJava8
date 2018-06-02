package unidade3;

public class UsoGenerico {
    public static void main(String[] args) {
        ExemploGeneric<Integer> iob = new ExemploGeneric<>(88);
        iob.showType();

        ExemploGeneric<String> sob = new ExemploGeneric<>("Antonio");
        sob.showType();
    }
}
