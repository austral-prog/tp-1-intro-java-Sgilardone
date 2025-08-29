package com.template;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        return a + b;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("factorial: n no puede ser negativo");
        }
        int res = 1;
        for (int i = 2; i <= n; i++) res *= i;
        return res;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        return (input == null) ? 0 : input.length();
    }

    // 6. Reverse a String
    public String reverse(String input) {
        if (input == null) return "";
        return new StringBuilder(input).reverse().toString();
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        int limit = (int) Math.sqrt(number);
        for (int i = 3; i <= limit; i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("findMin: el arreglo no puede ser nulo o vacío");
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        if (array == null) return 0;
        int s = 0;
        for (int v : array) s += v;
        return s;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    // 11. Sum of Elements in a List
    public int sumList(List<Integer> list) {
        if (list == null) return 0;
        int s = 0;
        for (Integer v : list) {
            if (v != null) s += v;
        }
        return s;
    }

    // 12. Find the Largest Element in a List
    public int findMax(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("findMax: la lista no puede ser nula o vacía");
        }
        Integer max = null;
        for (Integer v : list) {
            if (v == null) continue;
            if (max == null || v > max) max = v;
        }
        if (max == null) {
            throw new IllegalArgumentException("findMax: todos los elementos son nulos");
        }
        return max;
    }

    // 13. Filter Even Numbers from a List
    public List<Integer> filterEvenNumbers(List<Integer> list) {
        List<Integer> out = new ArrayList<>();
        if (list == null) return out;
        for (Integer v : list) {
            if (v != null && v % 2 == 0) out.add(v);
        }
        return out;
    }

    // 14. Concatenate Two Lists
    public List<String> concatenateLists(List<String> list1, List<String> list2) {
        List<String> out = new ArrayList<>();
        if (list1 != null) out.addAll(list1);
        if (list2 != null) out.addAll(list2);
        return out;
    }

    // 15. Check if List Contains Element
    public boolean listContains(List<String> list, String element) {
        if (list == null) return false;
        return list.contains(element);
    }

    // 16. Convert Strings to Uppercase
    public List<String> toUpperCase(List<String> list) {
        List<String> out = new ArrayList<>();
        if (list == null) return out;
        for (String s : list) {
            out.add(s == null ? null : s.toUpperCase());
        }
        return out;
    }

    // 17. Remove Duplicates from a List (preserva orden)
    public List<Integer> removeDuplicates(List<Integer> list) {
        if (list == null) return new ArrayList<>();
        Set<Integer> seen = new LinkedHashSet<>();
        for (Integer v : list) seen.add(v);
        return new ArrayList<>(seen);
    }

    // 18. Convert List to Set for Unique Elements
    public Set<Integer> listToSet(List<Integer> list) {
        return (list == null) ? new HashSet<>() : new HashSet<>(list);
    }

    // 19. Check if Map Contains Key
    public boolean mapContainsKey(Map<String, String> map, String key) {
        if (map == null) return false;
        return map.containsKey(key);
    }

    // 20. Check if Map Contains Value
    public boolean mapContainsValue(Map<String, String> map, String value) {
        if (map == null) return false;
        return map.containsValue(value);
    }

    // 21. Iterate Over a Map
    public List<String> iterateMap(Map<String, String> map) {
        List<String> out = new ArrayList<>();
        if (map == null) return out;
        for (Map.Entry<String, String> e : map.entrySet()) {
            out.add(e.getKey() + " -> " + e.getValue());
        }
        return out;
    }

}
