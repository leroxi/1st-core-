package task.oop;

public class TestChildren{
    public static void main(String[] args) {
        Child1 vova = new Child1();
        int a = 19;
        int b = 100;
        int num = 10;
        String str = "6";
        String str1 = "I love ";
        String str2 = "you ";
        String str3 = "!!))";
        String str5 = "25";
        String str6 = "11";
        String str7 = "4";
        int c = 11;
        System.out.println("Vova start ---");
        vova.sum(a, b);
        vova.sumFromString(str, num);
        vova.returnString(str2);
        vova.printParent();
        vova.concatenateStrings(str1, str2);
        System.out.println("Vova end ---");
        System.out.println();
        System.out.println("Leha start ---");
        Child2 leha = new Child2();
        leha.sum(a, b, c);
        leha.sumFromString(str5, str6, str7);
        leha.concatenateStrings(str1, str2);
        leha.printChild2(str);
        leha.concatenateStrings(str1, str2, str3);
        System.out.println("leha end ---");
    }
}
