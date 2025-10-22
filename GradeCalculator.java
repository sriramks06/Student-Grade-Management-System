public class GradeCalculator {

    public static int calculateTotal(int[] marks) {
        int total = 0;
        for (int m : marks)
            total += m;
        return total;
    }

    public static double calculateAverage(int[] marks) {
        return (double) calculateTotal(marks) / marks.length;
    }

    public static char calculateGrade(double avg) {
        if (avg >= 90) return 'A';
        else if (avg >= 75) return 'B';
        else if (avg >= 60) return 'C';
        else if (avg >= 40) return 'D';
        else return 'F';
    }
}
