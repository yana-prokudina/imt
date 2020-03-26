public class Main {
    public static void main(String[] args) {

        float imt = BmiService.calculate(100, 1.6F);
        System.out.println(imt);

        float imt1 = BmiService.calculate(65, 1.7F);
        System.out.println(imt1);

        float imt2 = BmiService.calculate(200, 2.0F);
        System.out.println(imt2);

    }
}
