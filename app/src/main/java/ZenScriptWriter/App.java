/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ZenScriptWriter;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Primary().setVisible(true);
            }
        });
    }
}
