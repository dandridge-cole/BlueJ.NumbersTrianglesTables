 

public class TableUtilities {
  
    public static String padNumber(Integer myNum) {
        if(myNum<10) return "  "+myNum;
        else if (myNum<100) return " "+myNum;
        else return ""+myNum;
    }
    
    public static String getRow(Integer rowNum, Integer numberOfElements) {
        StringBuilder myBuilder = new StringBuilder("");
        for(Integer i=1;i<=numberOfElements;i++){
            myBuilder.append(padNumber(i*rowNum));
            myBuilder.append(" |");
        }
        return myBuilder.toString();
    }

    public static String getSmallMultiplicationTable() {
        Integer tableSize = 5;
        StringBuilder myBuilder = new StringBuilder("");
        for(Integer i=1;i<=tableSize;i++){
            myBuilder.append(getRow(i,tableSize));
            myBuilder.append("\n");
        }
        return myBuilder.toString();
    }

    public static String getLargeMultiplicationTable() {
        Integer tableSize = 10;
        StringBuilder myBuilder = new StringBuilder("");
        for(Integer i=1;i<=tableSize;i++){
            myBuilder.append(getRow(i,tableSize));
            myBuilder.append("\n");
        }
        return myBuilder.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder myBuilder = new StringBuilder("");
        for(Integer i=1;i<=tableSize;i++){
            myBuilder.append(getRow(i,tableSize));
            myBuilder.append("\n");
        }
        return myBuilder.toString();
    }
    
}
