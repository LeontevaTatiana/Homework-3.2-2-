public class BmiService {
    public int calculate(int weightInKilograms, double heightInMeters) {
        double index;
        int result;
        index = weightInKilograms / (heightInMeters * heightInMeters);
        result = (int) index;
        return result;
    }
}
