public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 98;
        int heightM = 187;
        int bmi = service.calculate(weightKg, heightM);
        System.out.println(bmi);
    }
}