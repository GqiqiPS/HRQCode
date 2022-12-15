package CodeSUber;
import java.util.*;
public class BestRoute {
    double solution(double[] departure, double[] destination) {
//        Given user's departure and destination coordinates, each of them located on some street, find the length of the shortest route between them assuming that cars can only move along the streets. Each street can be represented as a straight line defined by the x = n or y = n formula, where n is an integer.
        // For departure = [0.4, 1] and destination = [0.9, 3], the output should be
        //solution(departure, destination) = 2.7.
        double res = Double.MAX_VALUE;
        double x = Math.abs(departure[0] - destination[0]);
        double y = Math.abs(departure[1] - destination[1]);
        if(departure[0] / 1 != destination[0] / 1 && departure[1] / 1 != destination[1] / 1) {
            res = Math.min(res, x + y);
        }
        else if(departure[0] / 1 == destination[0] / 1 && departure[1] / 1 != destination[1] / 1) {
                res = Math.min(res,Math.min(Math.ceil(departure[0]) - departure[0] + destination[0] -
                        Math.floor(destination[0]), Math.ceil(destination[0]) -
                        destination[0] + departure[0] - Math.floor(departure[0]))+ y);

            }
        else if(departure[1] / 1 == destination[1] / 1 && departure[0] / 1 != destination[0] / 1) {
                res = Math.min(res,Math.min(Math.ceil(departure[1]) - departure[1] + destination[1] -
                        Math.floor(destination[1]), Math.ceil(destination[1]) -
                        destination[1] + departure[1] - Math.floor(departure[1]))+ x);

            }
        else {
            res = Math.min(res,Math.min(Math.ceil(departure[0]) - departure[0] + destination[0] -
                        Math.floor(destination[0]), Math.ceil(destination[0]) -
                        destination[0] + departure[0] - Math.floor(departure[0]))+ Math.min(Math.ceil(departure[1]) - departure[1] + destination[1] -
                        Math.floor(destination[1]), Math.ceil(destination[1]) -
                        destination[1] + departure[1] - Math.floor(departure[1])));
        }
        return res;


    }
}
// Math.abs(Math.floordeparture[1] - destination[1])