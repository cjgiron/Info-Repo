
import java.util.ArrayList;
public class BasicJava {

    public void printNums(int number) {
        for(int i = 1; i < number+1; i++) {
            System.out.println(i);
        }
    }

    public void printOdds(int number) {
        for(int i = 1; i < number+1; i+=2){
            System.out.println(i);
        }
    }

    public void printSums(int number) {
        int sum = 0;

        for(int i = 0; i < number+1; i++) {
            sum += i;
            String str = String.format("New number: %s Sum: %s", i, sum);
            System.out.println(str);
        }
    }

    public void iterateThroughArray(int[] myArr) {
        for(int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]);
        }
    }

    public Integer printMax(int[] arr) {
        int max = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public Integer printAvg(int[] arr) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public ArrayList<Integer> printOddsArr (int limit) {
        ArrayList<Integer> y = new ArrayList<Integer>(); 

        for(int i = 1; i < limit+1; i++) {
            if(i % 2 != 0) {
                y.add(i);
            }
        }
        return y;
    }

    public Integer printNumsGreaterThanY (int[] arr, int y) {
        int numsGreaterThanY = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > y) {
                numsGreaterThanY += 1;
            }
        }
        return numsGreaterThanY;
    }

    public ArrayList<Integer> printSquares (ArrayList<Integer> x) {

        for(int i = 0; i < x.size(); i++) {
            int val = x.get(i);

            x.set(i, (val * val));
        }
        return x;
    }

    public ArrayList<Integer> eliminateNegatives (ArrayList<Integer> x) {
        for(int i = 0; i < x.size(); i++) {
            int val = x.get(i);

            if(val < 0) {
                x.set(i, 0);
            } else {
                x.set(i, val);
            }
        }
        return x;
    }

    public Integer printMin(int[] arr) {
        int min = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public ArrayList<Integer> maxMinAvg(int[] x) {
        int max = printMax(x);
        int min = printMin(x);
        int avg = printAvg(x);

        ArrayList<Integer> results = new ArrayList<Integer>();
        results.add(max);
        results.add(min);
        results.add(avg);

        return results;
    }

    public ArrayList<Integer> shiftValues(ArrayList<Integer> x) {

        for(int i = 0; i < x.size()-1; i++) {
            int val = x.get(i+1);

            System.out.println(val);
            System.out.println(x.size()-1);

            if(i == (x.size()-2)){
                x.set(i+1, 0);
                x.set(i, val);
            } else {
                x.set(i, val);
            }
        }
        return x;
    }

}