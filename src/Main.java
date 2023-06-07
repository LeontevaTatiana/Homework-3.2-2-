public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int myWeightInKilograms = 98;
        double myHeightInMeters = 1.87;
        int bmi = service.calculate(myWeightInKilograms, myHeightInMeters);
        System.out.println(bmi);
    }
}