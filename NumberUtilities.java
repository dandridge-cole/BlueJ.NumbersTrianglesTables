
//import java.lang.StringBuilder;

public class NumberUtilities {

    public static String getRange(int stop) {
        StringBuilder myBuilder = new StringBuilder("");
        for (Integer i = 0;i<stop;i++){
            myBuilder.append(i);
        }
        return myBuilder.toString();
    }

    public static String getRange(int start, int stop) {
        StringBuilder myBuilder = new StringBuilder("");
        for (Integer i = start;i<stop;i++){
            myBuilder.append(i);
        }
        return myBuilder.toString();
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder myBuilder = new StringBuilder("");
        for (Integer i = start;i<stop;i+=step){
            myBuilder.append(i);
        }
        return myBuilder.toString();
    }

    public static String getEvenNumbers(int start, int stop) {
        StringBuilder myBuilder = new StringBuilder("");
        start+=start%2;
        for (Integer i = start;i<stop;i+=2){
            myBuilder.append(i);
        }
        return myBuilder.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder myBuilder = new StringBuilder("");
        start+=(start+1)%2;
        for (Integer i = start;i<stop;i+=2){
            myBuilder.append(i);
        }
        return myBuilder.toString();
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        StringBuilder myBuilder = new StringBuilder("");
        for (Integer i = start;i<=stop;i++){
            myBuilder.append((int)Math.pow(i,exponent));
        }
        return myBuilder.toString();
    }
}
