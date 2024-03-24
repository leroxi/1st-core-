package task.methods;

public class Task12 {
    static String[] array1 = {"boba", "zoba", " moba", "doba", "zola", "kola"};
    static int[] array2 = {1, 2, 3, 4, 3, 1, 9};

    public static void main(String[] args) {
        getLastEl();
    }

    public static void getLastEl() {
        var lastel = array1[array1.length - 1];
        System.out.println(lastel);
    }
}