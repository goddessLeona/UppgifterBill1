

### **Strängar**
1. **Räkna tecken i en sträng**  
   - Skriv en metod `countCharacters(String text)` som returnerar antalet tecken i en given sträng.  
   - Exempel: `countCharacters("Hej")` → `3`

2. **Omvänd en sträng**  
   - Skriv en metod `reverseString(String text)` som returnerar den omvända versionen av en sträng.  
   - Exempel: `reverseString("Java")` → `"avaJ"`

3. **Räkna vokaler**  
   - Skriv en metod `countVowels(String text)` som räknar antalet vokaler (`a, e, i, o, u, y, å, ä, ö`) i en sträng.  
   - Exempel: `countVowels("programmering")` → `5`

---

### **Arrayer**
4. **Summera alla tal i en array**  
   - Skriv en metod `sumArray(int[] numbers)` som returnerar summan av alla tal i en array.  
   - Exempel: `sumArray(new int[]{1, 2, 3, 4})` → `10`

5. **Hitta största talet i en array**  
   - Skriv en metod `maxValue(int[] numbers)` som returnerar det största värdet i en array.  
   - Exempel: `maxValue(new int[]{3, 7, 2, 9})` → `9`

6. **Skriv ut array baklänges**  
   - Skriv en metod `reverseArray(int[] numbers)` som skriver ut en array i omvänd ordning.  
   - Exempel: `reverseArray(new int[]{1, 2, 3})` → `3 2 1`

---

### **Metoder (static)**
7. **Multiplikationstabell**  
   - Skriv en metod `printMultiplicationTable(int n)` som skriver ut multiplikationstabellen för `n`.  
   - Exempel: `printMultiplicationTable(3)` →  
     ```
     3 x 1 = 3
     3 x 2 = 6
     3 x 3 = 9
     ...
     ```

8. **Är ett tal jämnt?**  
   - Skriv en metod `isEven(int number)` som returnerar `true` om talet är jämnt, annars `false`.  
   - Exempel: `isEven(4)` → `true`

9. **Konvertera temperatur**  
   - Skriv en metod `celsiusToFahrenheit(double celsius)` som omvandlar Celsius till Fahrenheit.  
   - Formel: `F = C * 9/5 + 32`  
   - Exempel: `celsiusToFahrenheit(0)` → `32.0`

---


### **Listor (`List<>`)**
10. **Lägg till och skriv ut element**  
    - Skriv en metod `printList(List<String> words)` som skriver ut alla ord i en lista, ett per rad.  
    - Exempel:  
      ```java
      List<String> words = new ArrayList<>();
      words.add("Java");
      words.add("är");
      words.add("kul");
      printList(words);
      ```
      **Utdata:**  
      ```
      Java
      är
      kul
      ```

11. **Hitta det största talet i en lista**  
    - Skriv en metod `maxValue(List<Integer> numbers)` som returnerar det största talet i en lista.  
    - Exempel:  
      ```java
      List<Integer> numbers = List.of(10, 20, 5, 7);
      System.out.println(maxValue(numbers)); // 20
      ```

12. **Ta bort alla negativa tal från en lista**  
    - Skriv en metod `removeNegatives(List<Integer> numbers)` som tar bort alla negativa tal från listan.  
    - Exempel:  
      ```java
      List<Integer> numbers = new ArrayList<>(List.of(3, -1, 4, -2, 5));
      removeNegatives(numbers);
      System.out.println(numbers); // [3, 4, 5]
      ```

13. **Räkna förekomsten av ett visst ord**  
    - Skriv en metod `countOccurrences(List<String> words, String target)` som räknar hur många gånger ett visst ord förekommer i listan.  
    - Exempel:  
      ```java
      List<String> words = List.of("Java", "Python", "Java", "C++", "Java");
      System.out.println(countOccurrences(words, "Java")); // 3
      ```

14. **Omvänd ordning på en lista**  
    - Skriv en metod `reverseList(List<Integer> numbers)` som vänder ordningen på en lista.  
    - Exempel:  
      ```java
      List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4));
      reverseList(numbers);
      System.out.println(numbers); // [4, 3, 2, 1]
      ```

15. **Slumpmässig dragning från en lista**  
    - Skriv en metod `randomPick(List<String> names)` som returnerar ett slumpmässigt namn från en lista.  
    - Exempel:  
      ```java
      List<String> names = List.of("Anna", "Björn", "Cecilia", "David");
      System.out.println(randomPick(names)); // Slumpar t.ex. "Cecilia"
      ```

