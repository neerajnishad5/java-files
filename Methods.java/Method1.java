public class Method1 {

    static void update(int a[], int val, int index) {
        a[index] = val;
    }

    static void name (String n){
        System.out.println("Hello " + n);
    }

    public static void main(String[] args) {

        int a[] = { 55, 66, 77, 88, 99 };

        update(a, 60, 1);

        for (int x : a)
            System.out.print(x + " ");

            String name = "Victor";
            name(name);
        

    }

}
