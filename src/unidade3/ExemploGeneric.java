package unidade3;

public class ExemploGeneric <T> {
    T obj;

    public ExemploGeneric(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
    public void showType(){
        System.out.println(obj.getClass().getName());
    }
}
