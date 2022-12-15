package CodeSUber;

public class FancyRide {
    public String fancyRide(int l, double[] fares) {
        String[] rides = {"UberX", "UberXL", "UberPlus", "UberBlack", "UberSUV"};
        for (int i = fares.length - 1; i >= 0; i--) {
            if (fares[i] * l <= 20) {
                return rides[i];
            }
        }
        return "";
    }
}
