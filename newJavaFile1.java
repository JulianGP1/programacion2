
public class NewJavaFile1 {

    public static void main(String args[]) {
        var homero = new Character("homero", 39, 'm', "a la grande le puse cuca");
        homero.saySomthing();
    }

    static class Character {

        String name;
        int age;
        char gender;
        String phrase;

        public Character(String name, int age, char gender, String phrase) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.phrase = phrase;
        }

        void saySomthing() {
            System.out.println(this.phrase);
        }

    }
}
