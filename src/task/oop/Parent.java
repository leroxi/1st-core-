package task.oop;

public class Parent {


    public static void main(String[] args) {
        Parent maxim = new Parent();
        int a = 19;
        int b = 100;
        int num = 10;
        String str = "6";
        String str1 = "I love ";
        String str2 = "you ";
        System.out.println("Parent start --- ");
        maxim.sum(a, b);
        maxim.sumFromString(str, num);
        maxim.returnString(str);
        maxim.printParent();
        maxim.concatenateStrings(str1, str2);
        System.out.println("Parent end ---");

    }

    int sum(int a, int b) {
        int result11 = a + b;
        System.out.println(result11);
        return result11;
    }

    int sumFromString(String str, int num) {
        int k = Integer.parseInt(str.trim());
        int result12 = k + num;
        System.out.println(result12);
        return result12;
    }

    String returnString(String str) {
        System.out.println(str);
        return str;
    }

    void printParent() {
        System.out.println("I am a Parent");
    }

    String concatenateStrings(String str1, String str2) {
        String result15 = str1 + str2;
        System.out.println(result15);
        return result15;
    }

}
