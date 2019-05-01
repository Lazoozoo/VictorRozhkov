import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {
//Task 1:
        char chD = 'D';
        char chR = 'R';
        char chf = 'f';

        int intChD = (int) chD;
        int intChR = (int) chR;
        int intChf = (int) chf;
        System.out.println("Task 1:");
        System.out.println("D corresponds with " + intChD);
        System.out.println("R corresponds with " + intChR);
        System.out.println("f corresponds with " + intChf + "\n");

//Task 2:
        int a = 127123212;
        short b = 32760;
        char c = 'P';
        float d = 25524.3f;
        long e = 34293482394836534L;
        double f = 120.4324;

        System.out.println("Task 2:");
        System.out.println(
                "int --> byte: " + (byte) a + "\nThe value int a = " + a + " doesn't match the byte range\n");
        System.out.println(
                "short --> byte: " + (byte) b + "\nThe value short b = " + b + " doesn't match the byte range\n");
        System.out.println(
                "char --> int: " + (int) c + "\n");
        System.out.println(
                "float --> long: " + (long) d + "\nLose the fractional part\n");
        System.out.println(
                "long --> int: " + (int) e + "\nThe value 'long e' doesn't match the int range\n");
        System.out.println(
                "double --> int: " + (int) f + "\nLose the fractional part\n");

//Task 3:
        int toInt = 14354;
        boolean toBoolean = true;
        char toCharacter = 'T';
        Float toFl = 123.2F;
        Long toL = 2463563562342345L;

        System.out.println("Task 3:");
        System.out.println(
                "int --> Integer: " + (Integer) toInt);
        System.out.println(
                "boolean --> Boolean: " + (Boolean) toBoolean);
        System.out.println(
                "char --> Character: " + (Character) toCharacter);
        System.out.println(
                "Float --> float: " + (float) toFl);
        System.out.println(
                "Long --> long: " + (long) toInt  + "\n");

//Task 4:
        System.out.println("Task 4:");
        String greeting = "Welcome";
        String name = new String(" ,Bob!");
        StringBuilder welcome = new StringBuilder();
        welcome = welcome.append(greeting).append(name);
        System.out.println(welcome);
        System.out.println(String.format("%s\n", welcome.reverse()));
        System.out.println(String.format("%s%s",
                greeting.substring(3, 6),
                name.substring(2, 4))
        );
        
    }
}
