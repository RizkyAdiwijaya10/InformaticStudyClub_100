package informatic_study_club;

public class Day25 {

    int data = 10;

    public Day25() {
        System.out.println("Class pertama");

    }

    public void dataku() {
        System.out.println("Method class pertama");
    }

    public class InnerClass {

        int innerData = 5;

        public InnerClass() {
            System.out.println("Inner class");

        }

        public void InnerMethod() {
            System.out.println("Method innerClass");
            System.out.println(data);
        }
    }

    public static void main(String[] args) {
        Day25 object = new Day25();
        object.dataku();

        Day25.InnerClass innerObj = object.new InnerClass();
        innerObj.InnerMethod();
    }
}
