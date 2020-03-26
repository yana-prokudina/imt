public class BmiService {

    public static float calculate(int weight, float height) {

        float square = height * height;
        float imt = weight / square;

        return imt;
    }

}
