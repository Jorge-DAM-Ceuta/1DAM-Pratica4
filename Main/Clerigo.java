package Practica5;

public class Clerigo extends Zelote{

    public Clerigo(){
        setNombre("");
        setRaza("");
        setNivel(1);
        setVida((int)(100*0.8));
        setAtaque(10);
        setAgilidad((int)(10*1.1));
        setArmadura((int)(30*0.8));
        setResistenciaMagica((int)(30*1.3));
        setFe((int)(10*1.3));
    }
    
    public Clerigo(String no, String ra, int ni){
        setNombre(no);
        setRaza(ra);
        setNivel(ni);
        setVida((int)(100*0.8));
        setAtaque(10);
        setAgilidad((int)(10*1.1));
        setArmadura((int)(30*0.8));
        setResistenciaMagica((int)(30*1.3));
        setFe((int)(10*1.3));
        for(int i=0; i<ni; i++){
            subeNivel();
        }
    }

    public void rezarMilagro(int mi) {
        switch(mi){
            case 1:
                System.out.println("Sanacion");
            break;
            
            case 2:
                System.out.println("Rezo sagrado");
            break;
            
            case 3:
                System.out.println("Colera divina");
            break;
        }
    }
    
    public void luchar(){
        System.out.println("El Clerigo " + getNombre() + " ataca con " + getAtaque() + " puntos de da�o.");
    }
    
    public void luchar(int mi){
        System.out.println("El Clerigo " + getNombre());
        rezarMilagro(mi);
    }
    
    public String toString() {
        return "La raza del Clerigo " + getNombre() + " es: " + getRaza() + ". Su nivel " + getNivel() + " y sus atributos son... Vitalidad: " + getVida() + ", Fuerza: " + getAtaque() + ", Agilidad: " + getAgilidad() + ", Protección: " + getArmadura() + " Resistencia Mágica: " + getResistenciaMagica() + " y Fe de Clerigo: " + getFe();
    }
    
}
