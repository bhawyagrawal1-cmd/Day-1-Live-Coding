public class week1q3 {

    static String getBmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        double[] height = {1.75, 1.60, 1.80, 1.65, 1.70};
        double[] weight = {70, 90, 80, 75, 95};

        System.out.println("Person\tBMI\tStatus");

        for (int i = 0; i < height.length; i++) {
            double bmi = weight[i] / (height[i] * height[i]);

            System.out.printf("%d\t%.2f\t%s%n",
                    i + 1, bmi, getBmiStatus(bmi));
        }
    }
}