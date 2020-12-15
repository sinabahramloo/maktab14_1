public class Main {

    public static <T> void printArray(T[]array){
        for (T i:array) {
            System.out.println(i.toString());
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
