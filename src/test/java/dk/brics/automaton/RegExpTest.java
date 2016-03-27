package dk.brics.automaton;

/**
 * Created by Tommy Ettinger on 3/26/2016.
 */
public class RegExpTest {
    public static void main(String[] args)
    {
        RegExp re = new RegExp("(a|b)c");
        Automaton a = re.toAutomaton();
        System.out.println("'Automaton (a|b)c' on 'ac': " + a.run("ac"));
        System.out.println("'Automaton (a|b)c' on 'bc': " + a.run("bc"));
        System.out.println("'Automaton (a|b)c' on 'ab': " + a.run("ab"));
        System.out.println("'Automaton (a|b)c' on 'abc': " + a.run("abc"));
        RunAutomaton ra = new RunAutomaton(a);
        System.out.println("'RunAutomaton (a|b)c' on 'ac': " + ra.run("ac"));
        System.out.println("'RunAutomaton (a|b)c' on 'bc': " + ra.run("bc"));
        System.out.println("'RunAutomaton (a|b)c' on 'ab': " + ra.run("ab"));
        System.out.println("'RunAutomaton (a|b)c' on 'abc': " + ra.run("abc"));

        re = new RegExp("(a|b)*c");
        a = re.toAutomaton();
        ra = new RunAutomaton(a);
        System.out.println("'Automaton (a|b)*c' on 'abc': " + a.run("abc"));
        System.out.println("'RunAutomaton (a|b)*c' on 'abc': " + ra.run("abc"));
        SpecialOperations.reverse(a);
        System.out.println("'Reversed Automaton (a|b)*c' on 'c': " + a.run("c"));
        System.out.println("'Reversed Automaton (a|b)*c' on 'cab': " + a.run("cab"));
        System.out.println("'Reversed Automaton (a|b)*c' on 'abc': " + a.run("abc"));
        System.out.println("'Reversed Automaton (a|b)*c' reverse-run on 'c': " + a.runReversed("c"));
        System.out.println("'Reversed Automaton (a|b)*c' reverse-run on 'cab': " + a.runReversed("cab"));
        System.out.println("'Reversed Automaton (a|b)*c' reverse-run on 'abc': " + a.runReversed("abc"));

    }
}
