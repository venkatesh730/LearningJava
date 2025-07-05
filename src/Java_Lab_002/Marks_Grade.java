package Java_Lab_002;

public class Marks_Grade {
    public static void main(String[] args) {
        int Marks = 55;

        String grade = (Marks >= 90) ? "A+" :
                (Marks >= 75) ? "A-" :
                        (Marks >= 60) ? "B" :
                                (Marks >= 40) ? "C" : "F";
        System.out.println(grade);
    }
}
