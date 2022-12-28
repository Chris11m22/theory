public class Main {

    // Задача
    //Напишите программу, которая проверяет, является ли строка палиндромом.
    public class IsStringPalindrome {

        }
            public static void main(String[] args) {
                System.out.println(isPalindrome("комок"));
                System.out.println(isPalindrome("ротор"));
            }
            public static boolean isPalindrome(String str) {
                return str.equalsIgnoreCase(new StringBuffer(str).reverse().toString());

            }
        }









