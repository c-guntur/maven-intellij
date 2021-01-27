package none.cvg.maven.datetime.greetinggen;

import none.cvg.maven.greeting.Greeting;

public class GreetingGenerator {

    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        System.out.println("\n" + greeting.greet());
    }
}
