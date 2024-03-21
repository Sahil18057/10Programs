public class ExamScores
{
    public static void main(String[] args)
    {
        int [] [] scores = {
            {72, 85, 91}, {95, 89, 90}, {77, 65, 73}, {97, 92, 93}
            };
            studentsAvg(scores);
    }

    public static void studentsAvg(int[] [] inArray)
    {
        double total, average;
        for (int i=0; i<inArray.length; i++)
        {
            total = 0.0;
            for (int j=0; j<inArray[i].length; j++)
            total = total + inArray[i][j]; average = total/inArray[i].length;
            System.out.printf("average for student " + (i+1) + ": %5.2f", average);
            System.out.println();
        }
    }
}

