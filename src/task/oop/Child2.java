package task.oop;
public class Child2 extends Parent {

    public int sum(int a, int b, int c) {
        int summa = a + b + c;
        System.out.println(summa);
        return summa;
    }


    public int sumFromString(String str5, String str6, String str7) {
        int i = Integer.parseInt(str5.trim()) + Integer.parseInt(str6.trim()) + Integer.parseInt(str7.trim());
        System.out.println(i);
        return i;
    }
    @Override
    public String concatenateStrings(String str1, String str2) {
        String sumaStr = str1 + str2;
        System.out.println(sumaStr);
        return sumaStr;
    }

    public String printChild2(String str) {
        System.out.println("I am Child2" + " " + str);
        return str;
    }

    public String concatenateStrings(String str1, String str2, String str3) {

        String summaStrok = str1 + str2 + str3;
        System.out.println(summaStrok);
        return summaStrok;
    }
}
