package Practica5;

/**
 * @author Jorge.
 * Esta es la subclase Palad�n que hereda de Zelote e inicializa los atributos de un Zelote.
 * @version 1.0.
 */

public class Paladin extends Zelote{

/**
 * Este es un constructor por defecto de un Palad�n. Inicializa todos sus atributos a su valor base excepto el Nombre y la Raza.
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
 * Este es un constructor con par�metros, los cuales, inicializan solo: El Nombre, Raza y Nivel. Ya que el resto de sus atributos siempre deben partir de su valor base.
 * @param no Recibe un atributo de tipo String que inicializar� el Nombre si lo verifica el Setter dise�ado para ello.
 * @param ra Recibe un atributo de tipo String que inicializar� la Raza si lo verifica el Setter dise�ado para ello.
 * @param ni Recibe un atributo de tipo int que inicializar� el Nivel usando el Setter dise�ado para ello.
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
 * Este m�todo imprime por pantalla el nombre de un Milagro a rezar, dependiendo de cu�l se seleccione en el Switch.
 * @param mi Recibir� el atributo de tipo int con el que se seleccionar� el Milagro.
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
 * Este m�todo imprime por pantalla un String que determina un Ataque usando los Getters del Nombre y Ataque del Palad�n.
 */
    public void luchar(){
        System.out.println("El Paladi�n " + getNombre() + " ataca con " + getAtaque() + " puntos de daño.");        
    }
    
/**
 * Esta versi�n del m�todo sobrecargado imprime por pantalla un String que determina un Ataque con su habilidad especial usando el Getter del Nombre del Palad�n.
 * @param mi Recibe un atributo de tipo int con el que se seleccionar� el Milagro a rezar.
 */
    public void luchar(int mi){
        System.out.println("El Paladi�n " + getNombre() + " reza su milagro: "); 
        rezarMilagro(mi);        
    }
    
/**
 * Este m�todo implementado de la clase padre Persona, devuelve un atributo de tipo String.
 * @return Devuelve un String describiendo el estado del Palad�n.
 */
    public String toString(){
        return "La raza del Paladin " + getNombre() + " es: " + getRaza() + ". Su Nivel es " + getNivel() + ", y tiene " + getVida() + " puntos de Vitalidad, " + getAtaque() + " puntos de Ataque, " + getAgilidad() + " puntos de Agilidad, " + getArmadura() + " puntos de Armadura, " + getResistenciaMagica() + " puntos de Resistencia Magica y " + getFe() + " puntos de Fe.";
    }
    
}
