import java.util.*;

public class Main {
    public static void main(String[] args) {

        uppgift1();
        uppgift2();
        uppgift3();
        uppgift4();
        uppgift5();
        uppgift6();
        uppgift7(3);
        System.out.println(uppgift8(4));
        System.out.println(uppgift8(7));
        uppgift9(10);
        uppgift10();
        uppgift11();
        uppgift12();
        uppgift13();
        uppgift14();
        uppgift15();

        test();

    }

    //Strängar ---------------------------------------------------

    // Uppgift 1 Räkna tecken i en sträng
    public static void uppgift1(){
        String ord = "Hello";
        int countLetters = ord.length();

        System.out.println();
        System.out.println("There are " + countLetters + " letters in the word: " + ord );
    }

    // Uppgift 2 Omvänd en sträng
    public static void uppgift2(){
        String ord = "Sunflower";
        String spegelOrd = new StringBuilder(ord).reverse().toString();

        System.out.println("This is the word: " + ord +" reversed: " +spegelOrd);
    }

    // Uppgift 3 Räkna vokaler
    public static void uppgift3(){
        String ord = "Programmering";
        String vokaler = "aeiouyåäö";

        int vokalerCount = 0;
        for(int i = 0; i<ord.length(); i++){
            char currentChar = ord.charAt(i);
            if(vokaler.indexOf(Character.toLowerCase(currentChar)) != -1){
                vokalerCount++;
            }
        }
        System.out.println("The nummber of vokaler in the word: " + ord + " are: " + vokalerCount);
    }

    //Arrayer------------------------------------------------------------

    //Uppgift 4 Summera alla tal i en array

    public static void uppgift4(){
        int[] nummbers = {1,2,3,4,5,6,7,8,9};
        int sum = 0;

        for (int i = 0; i<nummbers.length; i++){
            sum += nummbers[i];
        }
        System.out.println("The sum of the array is: " + sum);
    }

    //uppgift 5 Hitta största talet i en array

    public static void uppgift5(){
        int[] numbers = {3,5,7,9};
        int highestNumber = numbers[3];

        for(int nr : numbers){
            if(highestNumber < nr){
                highestNumber = nr;
            }
        }

        System.out.println("The highest number in the array is: " + highestNumber);
    }

    //uppgift 6 Skriv ut array baklänges
    public static void uppgift6(){
        int[] numbers = {1,2,3};

        for(int i = 0; i < numbers.length/2; i++){
            int t = numbers[i];
            numbers[i]= numbers[numbers.length -1 -i];
            numbers[numbers.length -1-i] = t;
        }
        System.out.println("The numbers in the array revers are: " + Arrays.toString(numbers));
    }

    //Metoder (static)-------------------------------------------------------------

    //Uppgift 7 Multiplikationstabell

    public static void uppgift7(int a){

    int nr = a;

    for (int i = 1; i<=10; i++){
        System.out.println(nr + "x" + i + "=" + (nr*i));
    }
    }

    //Uppgift 8 Är ett tal jämnt?

    public static boolean uppgift8(int a){

        boolean isEven =(a % 2 == 0) ;
        return isEven;
    }

    //Uppgift 9 Konvertera temperatur
    public static void uppgift9(double a){

        double cel = a;
        double fah = (a * 9/5 + 32);

        System.out.println("The celcius tep are: " + cel + " = " + fah + " in Fahrenhait");
    }

    // Listor ------------------------------------------------------------------------------
    // Uppgift 10 Lägg till och skriv ut element
    public static void uppgift10(){

        List<String> shopingList = new ArrayList<>();
        shopingList.add("banan");
        shopingList.add("apple");
        shopingList.add("kiwi");

        System.out.println("\n" + "This is your Shopping list: ");

        printList(shopingList);

    }

    public static void printList (List<String>list){
        for(String item : list){
            System.out.println(item);
        }
    }

    //Uppgift 11 Hitta det största talet i en lista

    public static void uppgift11(){

        List<Integer> numbers = List.of(3, 2, -1,7,-2);
        int max = maxValue(numbers);

        System.out.println("The highest number is: " + max);

    }

    public static int maxValue (List<Integer>numbers){
        return Collections.max(numbers);
    }

    //Uppgift 12 Ta bort alla negativa tal från en lista

    public static void uppgift12(){

        List<Integer> nnumbers = new ArrayList<>(List.of(3, -1, 4, -2, 5));
        removeNegatives(nnumbers);
        System.out.println("Now with out any negative numbers " + nnumbers);

    }

    public static void removeNegatives(List<Integer> nnumbers){

        Iterator<Integer> iterator = nnumbers.iterator();

        while(iterator.hasNext()){
            Integer number = iterator.next();
            if(number < 0){
                iterator.remove();
            }
        }
    }

    //Uppgift 13 Räkna förekomsten av ett visst ord

    public static void uppgift13(){

        List<String> words = List.of("Java", "Python", "Java", "C++", "Java");
        int count = countOccurrences(words,"java");
        System.out.println("How many times do 'Java' ocurre in the list: " + count);
    }

    public static int countOccurrences(List<String> words, String target){
        int count = 0;

        for(String word: words){
            if(word.equalsIgnoreCase(target)){
                count++;
            }
        }
        return count;
    }

    //Uppgift 14 Omvänd ordning på en lista

    public static void uppgift14(){

        List<Integer> rnumbers = new ArrayList<>(List.of(1, 2, 3, 4));
        reverseList(rnumbers);
        System.out.println("this are the numbers reverse: "+ rnumbers);

    }

    public static void reverseList(List<Integer> rnumbers){

        Collections.reverse(rnumbers);
    }

    //Uppgift 15 Slumpmässig dragning från en lista

    public static void uppgift15(){

        List<String> names = List.of("Anna", "Björn", "Cecilia", "David");
        System.out.println(randomPick(names));

    }

    public static String randomPick(List<String> names){

        Random random = new Random();
        int randomIndex = random.nextInt(names.size());

        return names.get(randomIndex);
    }

    static void test(){
        int a = 5;
        int b = 2;
        int sum = a/b;
        System.out.println(sum);
    }

}

