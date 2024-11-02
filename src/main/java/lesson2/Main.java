package lesson2;

public class Main {
    public static void main(String[] args) {
        Lesson2 lesson2 = new Lesson2();
        lesson2.printThreeWords();
        lesson2.checkSumSign(2,-10);
        lesson2.printColor(101);
        lesson2.compareNumbers(2,5);
        lesson2.checkSumInRange(10,20);
        lesson2.checkNumberSign(-5);
        lesson2.checkNumberIsNegative(3);
        lesson2.printWord("Aston", 3);
        System.out.println(lesson2.checkYearIsLeap(1700));
        lesson2.reversNumbersInMassive();
        lesson2.fillMassive();
        lesson2.changeMassive();
        lesson2.fillDiagonalMassive();
        lesson2.fillMassiveValue(4,0);
    }

}
