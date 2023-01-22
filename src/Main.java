import java.util.Scanner;
public class Main {
    public static char generateCharacter(){
        //generate a random number that represents a char
        //26+26 lowercase and uppercase letters
        //10 digits
        //6 symbols
        //total of 68 characters(letters, digits and symbols)
        int rand = (int) (Math.random()* 68);
        //rand in [0-9] - digit -> ASCII [48-57]
        //rand in [10-35] - lowercase letter -> ASCII [97-122]
        //rand in [36- 61] - uppercase letter -> ASCII [65-90]
        //rand in [62 - 67] - symbol -> ASCII [33-38]
        if(rand >= 0 && rand <= 9){
            //digit
            rand += 48;
        }
        else if(rand >= 10 && rand <= 35){
            //lowercase
            rand +=87; //97-10
        }
        else if(rand >= 36 && rand <= 61){
            //uppercase
            rand += 29; //65-36
        }
        else if(rand >= 62 && rand <= 67){
            //symbol
            rand -= 29; // 38-67
        }
        return (char)(rand); //return character for ASCII code rand
    }
    public static String checkPasswordStrength(StringBuilder testedString){
        String passwordStrength = "";
        boolean hasUppercase = false, hasLowercase = false, hasDigit = false, hasSymbol = false;
        int conditionsPassed = 0;
        for(int i = 0; i < testedString.length(); i++){
            if(testedString.charAt(i) <= 33 && !hasSymbol){
                hasSymbol = true;
                conditionsPassed++;
            }
            else if(testedString.charAt(i) <= 48 && !hasDigit){
                hasDigit = true;
                conditionsPassed++;
            }
            else if(testedString.charAt(i) <= 65 && !hasUppercase){
                hasUppercase = true;
                conditionsPassed++;
            }
            else if(testedString.charAt(i) >= 97 && !hasLowercase){
                hasLowercase = true;
                conditionsPassed++;
            }
        }
        if(testedString.length() >= 8){
            conditionsPassed++;
        }
        passwordStrength = switch (conditionsPassed) {
            case 0 -> "try again";
            case 1 -> "bad";
            case 2 -> "moderate";
            case 3 -> "good";
            case 4 -> "very good";
            case 5 -> "excellent";
            default -> "error";
        };
        return passwordStrength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the length of the password?");
        int passwordLength = sc.nextInt();
        StringBuilder password = new StringBuilder();
        for(int i = 0; i < passwordLength; i++){
            password.append(generateCharacter());
        }
        System.out.println(password);
        System.out.println("password security:");
        System.out.print(checkPasswordStrength(password));
    }

}
