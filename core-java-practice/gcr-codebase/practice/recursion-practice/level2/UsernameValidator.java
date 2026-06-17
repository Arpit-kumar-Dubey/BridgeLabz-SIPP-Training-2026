package practicesProgram;

public class UsernameValidator {
    public static boolean isValidUsername(String username, int index) {
        if (index == username.length()) return true;
        char c = username.charAt(index);
        if (c < 'a' || c > 'z') return false;
        return isValidUsername(username, index + 1);
    }
    public static void main(String[] args) {
        String user1 = "abcdxyz";
        String user2 = "abcD123";
        System.out.println(isValidUsername(user1, 0));
        System.out.println(isValidUsername(user2, 0));
    }
}