package task.oop;

public class Child1 extends Parent {


    public int sum(int a, int b) {
        int result11 = a * b;
        System.out.println(result11);
        return result11;
    }

    public int sumFromString(String str, int num) {
        int k = Integer.parseInt(str.trim());
        int result12 = (k + num) * 2;
        System.out.println(result12);
        return result12;
    }

    public String returnString(String str2) {
        return str2.charAt(0) + "";
    }


    public void printParent() {
        System.out.println("I am a Child1");
    }

    public String concatenateStrings(String str1, String str2) {
        var res = super.concatenateStrings(str1, str2);
        return res.substring(0, res.length() / 2);
    }
}
