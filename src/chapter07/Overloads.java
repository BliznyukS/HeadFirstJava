package chapter07;

public class Overloads {

    String uniqueID;

    public int addNums(int a, int b){
        return a + b;
    }

    public double addNums(double a, double b){
        return a + b;
    }

    public void setUniqueID(String theID){
        uniqueID = theID;
    }

    /*
    public void setUniqueID(String ssNumber){
        String numString = "" + ssNumber;
        setUniqueID(numString);
    }*/
}
