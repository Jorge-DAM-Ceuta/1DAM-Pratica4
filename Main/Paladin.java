package Practica5;

/**
 * @author Jorge.
 * Esta es la subclase Paladín que hereda de Zelote e inicializa los atributos de un Zelote.
 * @version 1.0.
 */

public class Paladin extends Zelote{

/**
 * Este es un constructor por defecto de un Paladín. Inicializa todos sus atributos a su valor base excepto el Nombre y la Raza.
 */
    public Paladin(){
        setNombre("");
        setRaza("");
        setNivel(1);
        setVida((int)(100*1.3));
        setAtaque((int)(10*1.1));
        setAgilidad((int)(10*0.6));
        setArmadura((int)(30*1.3));
        setResistenciaMagica(30);
        setFe((int)(10*1.1));
    }
    
/**
 * Este es un constructor con parámetros, los cuales, inicializan solo: El Nombre, Raza y Nivel. Ya que el resto de sus atributos siempre deben partir de su valor base.
 * @param no Recibe un atributo de tipo String que inicializará el Nombre si lo verifica el Setter diseñado para ello.
 * @param ra Recibe un atributo de tipo String que inicializará la Raza si lo verifica el Setter diseñado para ello.
 * @param ni Recibe un atributo de tipo int que inicializará el Nivel usando el Setter diseñado para ello.
 */
    public Paladin(String no, String ra, int ni){
        setNombre("");
        setRaza("");
        setNivel(1);
        setVida((int)(100*1.3));
        setAtaque((int)(10*1.1));
        setAgilidad((int)(10*0.6));
        setArmadura((int)(30*1.3));
        setResistenciaMagica(30);
        setFe((int)(10*1.1));
        for(int i=0; i<ni; i++){
            subeNivel();
        }
    }
    
/**
 * Este método imprime por pantalla el nombre de un Milagro a rezar, dependiendo de cuál se seleccione en el Switch.
 * @param mi Recibirá el atributo de tipo int con el que se seleccionará el Milagro.
 */
    public void rezarMilagro(int mi) {
        switch(mi){
            case 1:
                System.out.println("Imbuir arma");
            break;
            
            case 2:
                System.out.println("Purificar no-muerto");
            break;
        }
    }
    
/**
 * Este método imprime por pantalla un String que determina un Ataque usando los Getters del Nombre y Ataque del Paladín.
 */
    public void luchar(){
        System.out.println("El Paladi­n " + getNombre() + " ataca con " + getAtaque() + " puntos de daÃ±o.");        
    }
    
/**
 * Esta versión del método sobrecargado imprime por pantalla un String que determina un Ataque con su habilidad especial usando el Getter del Nombre del Paladín.
 * @param mi Recibe un atributo de tipo int con el que se seleccionará el Milagro a rezar.
 */
    public void luchar(int mi){
        System.out.println("El Paladi­n " + getNombre() + " reza su milagro: "); 
        rezarMilagro(mi);        
    }
    
/**
 * Este método implementado de la clase padre Persona, devuelve un atributo de tipo String.
 * @return Devuelve un String describiendo el estado del Paladín.
 */
    public String toString(){
        return "La raza del Paladin " + getNombre() + " es: " + getRaza() + ". Su Nivel es " + getNivel() + ", y tiene " + getVida() + " puntos de Vitalidad, " + getAtaque() + " puntos de Ataque, " + getAgilidad() + " puntos de Agilidad, " + getArmadura() + " puntos de Armadura, " + getResistenciaMagica() + " puntos de Resistencia Magica y " + getFe() + " puntos de Fe.";
    }
    
}
