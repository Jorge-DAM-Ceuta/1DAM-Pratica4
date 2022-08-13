package Practica5;

/**
 * @author Jorge.
 * Esta es la subclase Monstruo que hereda de Personaje e inicializa los atributos de un Personaje.
 * @version 1.0.
 */

public class Monstruo extends Personaje{

/**
 * Este es un constructor por defecto de un Monstruo. Inicializa todos sus atributos a su valor base excepto el Nombre y la Raza.
 */
    public Monstruo(){
        setNombre("");
        setRaza("");
        setNivel(1);
        setVida(100);
        setAtaque(10);
        setAgilidad(10);
        setArmadura(30);
        setResistenciaMagica(30);
    }
    
/**
 * Este es un constructor con parámetros, los cuales, inicializan solo: El Nombre, Raza y Nivel. Ya que el resto de sus atributos siempre deben partir de su valor base.
 * @param no Recibe un atributo de tipo String que inicializará el Nombre si lo verifica el Setter diseñado para ello.
 * @param ra Recibe un atributo de tipo String que inicializará la Raza si lo verifica el Setter diseñado para ello.
 * @param ni Recibe un atributo de tipo int que inicializará el Nivel usando el Setter diseñado para ello.
 */
    public Monstruo(String no, String ra, int ni){
        setNombre(no);
        setRaza(ra);
        setNivel(ni);
        for(int i=0; i<ni; i++){
            subeNivel();
        }
    }
    
/**
 * Este método comprueba que se cumpla la condición para que la Raza del Monstruo sea válida.
 * @param ra Recibe un atributo de tipo String que contendrá la Raza del Monstruo.
 */
    public void setRaza(String ra){
        switch(ra){
            
            case "Bestia":
                setAtaque((int)(10*1.2));
                setAgilidad((int)(10*1.2));
                setVida((int)(100*1.1));
                setArmadura((int)(30*0.9));
                setResistenciaMagica((int)(30*0.9));
                Raza=ra;
                break;
            
            case "No-Muerto":
                setResistenciaMagica((int)(30*1.3));
                setAtaque((int)(10*1.1));
                setVida((int)(100*0.8));
                setArmadura((int)(30*0.9));
                setAgilidad((10*1));
                Raza=ra;
                break;
                
            case "Gigante":
                setVida((int)(100*1.4));
                setAtaque((int)(10*1.4));
                setArmadura((int)(30*1.4));
                setAgilidad((int)(10/1.2));
                setResistenciaMagica((int)(30/1.2));
                Raza=ra;
                break;
        }
    }

/**
 * Este método implementado de la clase padre Persona, devuelve un atributo de tipo String.
 * @return Devuelve un String describiendo el estado del Monstruo.
 */
    public String toString(){
        return "La raza del Monstruo " + getNombre() + " es: " + getRaza() + ". Su Nivel es " + getNivel() + ", y tiene " + getVida() + " puntos de Vitalidad, " + getAtaque() + " puntos de Ataque, " + getAgilidad() + " puntos de Agilidad, " + getArmadura() + " puntos de Armadura y " + getResistenciaMagica() + " puntos de Resistencia Magica";
    }
    
}
