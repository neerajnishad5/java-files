

class Data<T>{
    private T obj;

    public T getObj() {
        return obj;
    }
    public void setObj(T obj) {
        this.obj = obj;
    }
}
public class CGenereics {
    public static void main(String[] args) {
        Data<Integer> a = new Data<>();

        a.setObj(10);

        System.out.println(a.getObj());
    }
}
