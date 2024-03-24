package task.methods;

public class Task13 {
    public static void main(String[] args) {
        getCountedLetters();
    }

    public static void getCountedLetters() {
        String str = "AAA";
        int index = 0;
        for (char elem : str.toCharArray()) {
            if (elem == 'A') index++;
        }
        System.out.println(index + " Букв А в строке ");


    }
}


