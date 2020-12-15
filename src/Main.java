public class Main {

    public static <T extends Number> void printArray(T[]array){
        for (T i:array) {
            System.out.println(i.toString());
        }
    }

}
