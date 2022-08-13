package Practica5;

/**
 * @author Jorge.
 * Esta es la subclase Cazador que hereda de Personaje e inicializa los atributos de un Personaje.
 * @version 1.0.
 */

public class Cazador extends Personaje{
  
    /**
    * @author Jorge.
    * Esta es la clase anidada Compa�eroAnimal de Cazador que hereda de Personaje e inicializa los atributos de un Personaje.
    * @version 1.0.
    */
    
    public class CompañeroAnimal extends Personaje{
       
    /**
    * Este es un constructor por defecto de un Cazador. Inicializa todos sus atributos a su valor base excepto el Nombre y la Raza.
    */    
        public CompañeroAnimal(){
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
    * Este es un constructor con par�metros, los cuales, inicializan solo: El Nombre, Raza y Nivel. Ya que el resto de sus atributos siempre deben partir de su valor base.
    * @param no Recibe un atributo de tipo String que inicializar� el Nombre si lo verifica el Setter dise�ado para ello.
    * @param ra Recibe un atributo de tipo String que inicializar� la Raza si lo verifica el Setter dise�ado para ello.
    * @param ni Recibe un atributo de tipo int que inicializar� el Nivel usando el Setter dise�ado para ello.
    */    
        public CompañeroAnimal(String no, String ra, int ni){
            setNombre(no);
            setRaza(ra);
            setNivel(ni);
            
            for(int i=0; i<ni; i++){
            subeNivel();
            }
        }
        
    /**
    * Este m�todo comprueba que se cumpla la condici�n para que la Raza del Compa�ero Animal sea v�lida.
    * @param ra Recibe un atributo de tipo String que contendr� la Raza del Compa�ero Animal.
    */
        public void setRaza(String ra){
            switch(ra){
                case "Sabueso":
                    setVida((int)(100*1.25));
                    setAtaque((int)(10*1.25));
                    setAgilidad((int)(10*1.25));
                    setArmadura((int)(30*1.25));
                    setResistenciaMagica((int)(30*1.25));
                    Raza=ra;
                break;
                
                case "Felino":
                    setVida((int)(100*1.15));
                    setAtaque((int)(10*1.3));
                    setAgilidad((int)(10*1.3));
                    setArmadura((int)(30*1.15));
                    setResistenciaMagica((int)(30*1.15));
                    Raza=ra;
                break;
            
                case "Ave":
                    setVida((int)(100*1.05));
                    setAtaque((int)(10*1.15));
                    setAgilidad((int)(10*1.35));
                    setArmadura((int)(30*1.05));
                    setResistenciaMagica((int)(30*1.25));
                    Raza=ra;
                break;
            }
        }

    /**
    * Este m�todo implementado de la clase padre Persona, devuelve un atributo de tipo String.
    * @return Devuelve un String describiendo el estado del Compa�ero Animal.
    */
        public String toString() {
            return "La raza del Animal " + getNombre() + " es: " + getRaza() + ". Su Nivel es " + getNivel() + ", y tiene " + getVida() + " puntos de Vitalidad, " + getAtaque() + " puntos de Ataque, " + getAgilidad() + " puntos de Agilidad, " + getArmadura() + " puntos de Armadura, " + getResistenciaMagica() + " puntos de Resistencia Magica.";

        }
    }
            
/**
 * Este es un constructor por defecto de un Cazador. Inicializa todos sus atributos a su valor base excepto el Nombre y la Raza.
 */
    public Cazador(){
        setNombre("");
        setRaza("");
        setNivel(1);
        setVida(100);
        setAtaque(10);
        setAgilidad((int)(10*1.1));
        setArmadura(30);
        setResistenciaMagica(30);
    }
    
/**
 * Este es un constructor con par�metros, los cuales, inicializan solo: El Nombre, Raza y Nivel. Ya que el resto de sus atributos siempre deben partir de su valor base.
 * @param no Recibe un atributo de tipo String que inicializar� el Nombre si lo verifica el Setter dise�ado para ello.
 * @param ra Recibe un atributo de tipo String que inicializar� la Raza si lo verifica el Setter dise�ado para ello.
 * @param ni Recibe un atributo de tipo int que inicializar� el Nivel usando el Setter dise�ado para ello.
 */
    public Cazador(String no, String ra, int ni){
        setNombre(no);
        setRaza(ra);
        setNivel(ni);
        setNivel(1);
        setVida(100);
        setAtaque(10);
        setAgilidad((int)(10*1.1));
        setArmadura(30);
        setResistenciaMagica(30);
        for(int i=0; i<ni; i++){
            subeNivel();
        }
    }
    
/**
 * Este m�todo imprime por pantalla un String que determina un Ataque usando los Getters de Nombre y Ataque del Cazador.
 */
    public void luchar(){
        CompañeroAnimal a=new CompañeroAnimal();
        System.out.println("El Cazador " + getNombre() + " ataca con " + getAtaque() + " puntos de da�o. \nSu compa�ero animal " + a.getNombre() + " ataca con " + a.getAtaque() + " puntos de da�o.");
    }

/**
 * Este m�todo implementado de la clase padre Persona, devuelve un atributo de tipo String.
 * @return Devuelve un String describiendo el estado del Cazador.
 */
    public String toString(){
        CompañeroAnimal a=new CompañeroAnimal();
        return "La raza del Cazador " + getNombre() + " es: " + getRaza() + ". Su Nivel es " + getNivel() + ", y tiene " + getVida() + " puntos de Vitalidad, " + getAtaque() + " puntos de Ataque, " + getAgilidad() + " puntos de Agilidad, " + getArmadura() + " puntos de Armadura, y " + getResistenciaMagica() + " puntos de Resistencia Magica";
    }
}
