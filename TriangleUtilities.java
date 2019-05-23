 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        StringBuilder myBuilder = new StringBuilder("");
        for(Integer i=0;i<numberOfStars;i++){
            myBuilder.append("*");
        }
        return myBuilder.toString();
    }
    
    public static String getTriangle(int numberOfRows) {
        StringBuilder myBuilder = new StringBuilder("");
        for(Integer i=1;i<=numberOfRows;i++){
            myBuilder.append(getRow(i));
            myBuilder.append("\n");
        }
        return myBuilder.toString();
    }


    public static String getSmallTriangle() {
        StringBuilder myBuilder = new StringBuilder("");
        for(Integer i=1;i<=4;i++){
            myBuilder.append(getRow(i));
            myBuilder.append("\n");
        }
        return myBuilder.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder myBuilder = new StringBuilder("");
        for(Integer i=1;i<=9;i++){
            myBuilder.append(getRow(i));
            myBuilder.append("\n");
        }
        return myBuilder.toString();
    }
}
