package dk.brics.automaton;

/**
 * Created by Tommy Ettinger on 3/26/2016.
 */
public class RegExpTest {
    public static void main(String[] args)
    {

        RegExp re = new RegExp("(a|b)c");
        Automaton a = re.toAutomaton();
        RunAutomaton ra = new RunAutomaton(a);
        System.out.println("'Automaton (a|b)c' on 'ac': " + a.run("ac"));
        System.out.println("'Automaton (a|b)c' on 'bc': " + a.run("bc"));
        System.out.println("'Automaton (a|b)c' on 'ab': " + a.run("ab"));
        System.out.println("'Automaton (a|b)c' on 'abc': " + a.run("abc"));
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

        RegExp re2 = new RegExp("\\pL+");
        Automaton a2 = re2.toAutomaton();
        RunAutomaton ra2 = new RunAutomaton(a2);

        System.out.println("'Automaton \\pL+' on 'ac': " + a2.run("ac"));
        System.out.println("'Automaton \\pL+' on '12': " + a2.run("12"));
        System.out.println("'Automaton \\pL+' on 'ab1': " + a2.run("ab1"));
        System.out.println("'Automaton \\pL+' on 'abc': " + a2.run("abc"));
        System.out.println("'RunAutomaton \\pL+' on 'ac': " + ra2.run("ac"));
        System.out.println("'RunAutomaton \\pL+' on '12': " + ra2.run("12"));
        System.out.println("'RunAutomaton \\pL+' on 'ab1': " + ra2.run("ab1"));
        System.out.println("'RunAutomaton \\pL+' on 'abc': " + ra2.run("abc"));

    }
}
