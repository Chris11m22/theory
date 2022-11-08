public class Main {

    // Задача
    //Напишите программу, которая проверяет, является ли строка палиндромом.
    public class IsStringPalindrome {

        }
            public static void main(String[] args) {
                System.out.println(isPalindrome("anna")); // true
                System.out.println(isPalindrome("forest")); // false
            }
            public static boolean isPalindrome(String str) {
                return str.equalsIgnoreCase(new StringBuffer(str).reverse().toString());
                //переворачиваем строку  и сравниваем с изначальной строкой
            }
        }








