import java.util.Scanner;
public class Main {
    public static char generateCharacter(){
        //generate a random number that represents a char
        //26+26 lowercase and uppercase letters
        //10 digits
        //6 symbols
        //total of 68 characters(letters, digits and symbols)
        int rand = (int) (Math.random()* 62);
        //rand in [0-9] - digit -> ASCII [48-57]
        //rand in [10-35] - lowercase letter -> ASCII [97-122]
        //rand in [36- 61] - uppercase letter -> ASCII [65-90]
        //rand in [62 - 67] - symbol -> ASCII [33-38]
        if(rand <= 9){
            //digit
            rand += 48;
            return (char)(rand); //return character for ASCII code rand
        }
        else if(rand <= 35){
            //uppercase
            rand +=55; //65-10
            return (char)(rand);
        }
        else{
            //uppercase
            rand += 61; //97-36
            return (char)(rand);
        }
    }
    public static String checkPasswordStrength(String testedString){
        String passwordStrength = "";
        boolean hasUppercase = false, hasLowercase = false, hasDigit = false, hasSymbol = false, hasLength = false;
        for(int i = 0; i < testedString.length(); i++){
            if(testedString.charAt(i) <= 9){

            }
            else if(testedString.charAt(i) <= 35){

            }
            else if(testedString.charAt(i) <= 61){

            }
        }
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
    }

}
