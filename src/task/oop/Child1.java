package task.oop;

public class Child1 extends Parent {
    public static void main(String[] args) {

    }

    int sum(int a, int b) {
        int result11 = a * b;
        System.out.println(result11);
        return result11;
    }

    int sumFromString(String str, int num) {
        int k = Integer.parseInt(str.trim());
        int result12 = (k + num) * 2;
        System.out.println(result12);
        return result12;
    }

    String returnString(String str2) {
        char i = str2.charAt(0);
        String str = new String(new char[]{i});
        System.out.println(str);
        return str;
    }

    void printParent() {
        System.out.println("I am a Child1");
    }

    String concatenateStrings(String str1, String str2) {
        String result15 = str1 + str2;
        int i = result15.length();
        int b = i / 2;
        String itogResult15 = result15.substring(0, b);
        System.out.println(itogResult15);
        return itogResult15;
    }
}
