public class Main {

    public static <T> void printArray(T[]array){
        for (T i:array) {
            System.out.println(i.toString());
        }
    }
    public static <T> void printArray(T[]array,int lowSubscript,int highSubscript){
        if(lowSubscript >= 0  && lowSubscript<=highSubscript && highSubscript<= array.length){
        for (int i=lowSubscript;i<highSubscript;i++) {
            System.out.println(array[i].toString());
        }
        }
        else {
            throw new IllegalArgumentException("lowSubscript and highSubscript must be in array rnge and lowSubscript must be lower thanhighSubscript");
        }
    }
    public static void main(String[] args) {
        Integer [] integerArray={1,2,3};
        Double [] doubleArray={1.1,2.1,3.1};
        Character [] characterArray={'a','b','c'};
        printArray(integerArray);
        printArray(doubleArray);
        printArray(characterArray);
    }
}
