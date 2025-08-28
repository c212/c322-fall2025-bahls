import java.sql.SQLOutput;
import java.util.ArrayList;

public class RandomStringGenerator {
    private ArrayList<Range> randList = new ArrayList<Range>();

    public void addRange(char first, char last){
        this.randList.add(new Range(first, last));
    }

    public String nextString(int length){
        String output = "";
        int index; // picking from this range
        for(int i = 0; i < length; i++){
            index = ((int) Math.random() * this.randList.size()); // creating a random range
            output = output + this.randList.get(index).getChar(); // picking a random char
        }
        return output;
    }

    public class Range{
        private char a;
        private char b;

        public Range(char a, char b){
            this.a = a;
            this.b = b;
        }

        public char getChar(){ // randomized character from the range
            return (char) (Math.random() * (this.b - this.a + 1) + this.a);
        }
    }

    public static void main(String[] args) {
        int strLength = 10; // default length of strings
        if (args.length == 1)
            strLength = Integer.parseInt(args[0]); //adjusts the string length if the user inputs a value
        RandomStringGenerator obj = new RandomStringGenerator(); // string generator object
        obj.addRange('a', 'z'); // adding a-z to the range
        System.out.println(obj.nextString(strLength)); // generate string with updated range
        obj.addRange('A', 'Z'); // adding A-Z to the range
        System.out.println(obj.nextString(strLength)); // generate string with updated range
        obj.addRange('0', '9'); // adding 0-9 to the range
        System.out.println(obj.nextString(strLength)); // generate string with updated range

    }
}
