package Practica5;

public class App {
    public static void main(String[] args) {
        Combate a=new Combate();
        Personaje jorge, ismael;
        jorge=new Cazador("ElPiezass", "Americana", 12);
        ismael=new Mago("Bravis", "Arabica", 15);
        
        System.out.println(a.combatir(jorge, ismael));
    }
}
    

