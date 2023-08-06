public class BmiService {
    public int calculate(int weightKg, int heightM) {
        int square = 2;
        int bmi = (int) (weightKg / (Math.pow(heightM, square)) * 10_000);

        return bmi;
    }
}
