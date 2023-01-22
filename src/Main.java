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
        //rand in [62-67] - symbols -> ASCII [33-38]
        if(rand <= 9){
            //digit
            rand += 48;
        }
        else if(rand <= 35){
            //uppercase
            rand +=55; //65-10
        }
        else if(rand <= 61){
            //uppercase
            rand += 61; //97-36
        }
        // TO DO: add symbols
        else{
            rand -= 29; // 62-33
        }
        return (char)(rand); //return character for ASCII code rand
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many passwords do you want to generate?");
        int passwordsNumber = sc.nextInt();
        System.out.println("What is the length of the passwords?");
        int passwordLength = sc.nextInt();
        for(int j = 0; j < passwordsNumber; j++){
            StringBuilder password = new StringBuilder();
            for(int i = 0; i < passwordLength; i++){
                password.append(generateCharacter());
            }
            System.out.println(password);
        }
    }

}
