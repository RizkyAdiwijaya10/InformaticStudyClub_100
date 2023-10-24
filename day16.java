package informatic_study_club;

public class day16 {

    public static void main(String[] args) {
        double[][] data = {
            {91.35, 4.72, 26, 3.5, 8, 61, 65.36, 12, 5.6, 7.11},
            {27, 9.53, 549, 2.23, 17.31, 4.25, 2.13, 83, 7, 102.4},
            {53.21, 3.42, 0.21, 70.02, 819.4, 6173, 4.25, 19.8, 17.35, 5.768}
        };

        //min
        double min = Double.MAX_VALUE;
        //max
        double max = Double.MIN_VALUE;
        //sum
        double sum = 0;
        //avg
        int n = 0;
        for (int i = 0; i < data.length; i++) {
            System.out.print("[");
            for (int j = 0; j < data[i].length; j++) {
                if (j > 0) {
                    System.out.print("\t");
                }
                System.out.print(data[i][j]);

                if (data[i][j] < min) {
                    min = data[i][j];
                }
                if (data[i][j] > max) {
                    max = data[i][j];
                }
                //sum
                sum = sum + data[i][j];

                //update banyaknya data
                n++;

            }
            System.out.println("]");

        }
        double avg = sum / n;

        System.out.println("===============================================");
        System.out.println("MIN DATA = " + min);
        System.out.println("MAX DATA = " + max);
        System.out.println("SUM DATA = " + sum);
        System.out.println("AVG DATA = " + avg);

    }
}
