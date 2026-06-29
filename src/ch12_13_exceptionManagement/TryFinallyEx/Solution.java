package ch12_13_exceptionManagement.TryFinallyEx;

public class Solution {

    public static void riskyMethod() throws Exception {
        Exception original = null;

        try {
            throw new Exception("A");
        } catch (Exception e) {
            original = e;          // "A"yı sakla
        } finally {
                Exception e = new Exception("B");
                original.addSuppressed(e); //"B"yi "A"nın cause'una ekle
            throw original;
        }
    }

    public static void main(String[] args) {
        try {
            riskyMethod();
        } catch (Exception e) {
            System.out.println("Ana hata  : " + e.getMessage());          // A
            for (Throwable s : e.getSuppressed()) {
                System.out.println("Bastırılan: " + s.getMessage());      // B
            }
        }
    }
}
