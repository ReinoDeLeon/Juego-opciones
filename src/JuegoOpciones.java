import java.util.InputMismatchException;
import java.util.Scanner;

public class JuegoOpciones {

	static int opcionUsuario;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Despiertas en la cama de una pequeña habitación que solamente tiene una puerta pequeña de madera al fondo,\nal lado de la cama tiene una trampilla y vislumbras una luz tenue de una vela en el suelo");
		System.out.println("No recuerdas nada, ni siquiera tu nombre. Tienes un fuerte dolor de cabeza y no sabes qué haces en esa habitación\nni donde está situada");

		do {
			System.out.println("\n¿Qué quieres hacer?\n\t1) Investigar la trampilla\n\t2) Abrir la puerta y salir\n\t3) Volverte a dormir (ya que parece una pesadilla)");
			opcionUsuario = pedirNumeroInt(scan);
			switch (opcionUsuario) {
			case 1: 
				System.out.println("Trampilla");
				break;
			case 2: 
				puerta(scan);
				break;
			case 3: 
				System.out.println("Dormirse");
				break;
			default: 
				System.out.println("Intentas levantarte y pierdes el conocimiento");

			}
		} while (opcionUsuario > 3 || opcionUsuario < 1);

	}
	public static int pedirNumeroInt(Scanner scan) {
		/*
		 * pediremos un numero y comprobamos que la entrada por teclado es numérica
		 */
		boolean control = true;
		do {
			try {
				System.out.print("\nIntroduzca una opción: -> ");
				int valor = scan.nextInt();
				control = false;
				return valor;
			} catch (InputMismatchException e) {
				scan.next();
				System.out.println("El valor introducido no es numérico o contiene decimales");
				continue;
			}
		} while (control);
		return 0;
	}
	
	static void puerta(Scanner scan){
		
		boolean tenedor = false;
		boolean cuchara = false;
		boolean cuchillo = false;
		
		
		System.out.println("\nTe dispones a abrir la puerta, pero te parece que hay algo al otro lado, se te erizan los pelos solo de imaginar que podría haber, te cargas de\n valor y abres la puesta de golpe.\nSolo ves oscuridad...\nTe dispones a coger la vela para ver algo, pero al darte la vuelta, la puerta a desaparecido, dejando una pared lisa con lo que parece que es cuadro colgado,\npero ni rastro de una puerta o rastro de ella.");
		System.out.println("Desesperado te llevas las manos a la cabeza y de rabia de no saber que está pasando tiras lo que parece que es un cuadro de la pared, rompiendose contra el suelo.");
		System.out.println("Sin ver nada, palpas la pared buscando algo con lo que iluminarte, y encuentras ¿Un escritorio? si, será eso. Y con suerte encuentras algo parecido a un candil.\nLo enciendes accionando el mecanismo, y vislumbras una sombra atravesando otra puerta al final del cuarto. Asustado y dudando de tu vista buscas algo con lo que\ndefenderte de un posible agresor, encuentras un tenedor y una cuchara.");
		
		int locura = 0;
	
		comprobadorLocuraPuerta(locura);
		
		System.out.println("Tu locura aumente, no puedes creer lo que acabas de ver");
		System.out.println("\n¿Cúal vas a escoger?");
		System.out.println("Opción 1: tenedor\nOpción 2: cuchara\nOpcion 3: cuchillo");
		
		opcionUsuario = pedirNumeroInt(scan);
		switch (opcionUsuario) {
		case 1: 
			tenedor = true;
			System.out.println("Coges el tenedor pensando que al menos es un objeto minimamente punzante.");
			break;
		case 2: 
			cuchara = true;
			System.out.println("Escoges la cuchara ya que parece brillante y extraña.");
			break;
		case 3:
			cuchillo = true;
			opcionUsuario = 2;
			System.out.println("Descubres un cajón secreto debajo del escritorio,en ella hay un cuchillo de la misma cuberteria que la cuchara y el tenedor, te lo llevas contigo.");
			break;
		default: 
			System.out.println("Decides no coger nada, ya que no parece tener ningún uso futuro.");

		}
		
		System.out.println("Te adentras en la habitación, candil en mano, es un gran salón lleno de muebles viejos sin cubir y lleno de polvo, es tan grande que no ves al final del gran cuarto.");
		System.out.println("Escuchas unos crujidos en debajo de tus pies, como si algo se moviera en el piso inferior.");
		System.out.println("La situacion te pone mas nervioso al fijarte que todos los cuadros de la sala tienen las caras tachadas de forma muy macabra, subiendo tu nivel de locura.");
		
		comprobadorLocuraPuerta(locura);
		
		System.out.println("De la nada te empieza a doler el tobillo, te lo miras y observas una especie de mordedura, como de roedor, no puedes aguantar el dolor y te agachas, no puedes con el dolor.");
		System.out.println("Te salta un rata gigante sobre ti, te asustas y usas el utensilio que escogiste anteriormente");
		
		if (cuchara ==  true) {
			System.out.println("La rata ve lo brillante que es la cuchara, te la roba y sale corriendo");
			cuchara = false;
		}
		
		if (tenedor == true) {
			System.out.println("Rapidamente coges el tenedor y le pinchas un ojo a la rata lo que la mata instantáneamente");
			comprobadorLocuraPuerta(locura);
		}
		
		if (cuchillo == true) {
			System.out.println("Clavas el cuchillo de forma certera en el torso del animal, dejandolo agonizando en el suelo de la sala.");
			System.out.println("La rata agoniza, pero te da un hambre feroz, como si tu instinto te estuviera pidiendo que te la comieras.");
			System.out.println("Opción 1: Matas a la rata\nOpción 2: Te la comes");
			
			opcionUsuario = pedirNumeroInt(scan);
			switch (opcionUsuario) {
			case 1: 
				System.out.println("Terminas con el sufrimiento de la rata");
				comprobadorLocuraPuerta(locura);
				opcionUsuario = 2;
				break;
			case 2: 
				System.out.println("Empiezas a deborar al sucio roedor de una forma grotesca, cosa que no te quita el hambre, si no que te da más.");
				locura+=6;
				comprobadorLocuraPuerta(locura);
				
				break;
			default:
				System.out.println("La rata desaparece de repente");
				opcionUsuario = 2;
			}
		}
		
		else {
			System.out.println("La rata te arranca un ojo por el cual se mete en tu cabeza y mueres");
			opcionUsuario = 15;
		}
		
		System.out.println("Ves un mantel viejo, lo sacudes y te tapas la herida supurante del tobillo, cojeando vas al final de la habitación hay una puerta que parece que da al exterior, pero tiene una gran cerradura que se encuentra cerrada. Cerca de la puerta hay un espejo tapado, que desentona con el resto del salón, siendo este el único mueble cubierto del polvo");
		System.out.println("Te decides a destaparlo, al hacerlo empiezas a toser y lees en el clistal, escrito con sangre,\n\n\"Es solo una ilusión\"\n\n");
		System.out.println("En ese momento observas tu rostro en el espejo, y te das cuenta de que tiene pagado en la frente una llave, la cual pruebas con la cerradura de la puerta");
		System.out.println("Abres la puerta");
		System.out.println("Detrás de esa hay otra puerta, y de esa, otra, y de esa, otra, hasta que llegas a una que indica, que si te tragas la llave, volveras y no habrá pasado nada, pero si abres la puerta, no sobras lo que te vas a encontrar");
		System.out.println("¿Qué quieres hacer?");
		System.out.println("\nOpción 1: te tragas la llave\nOpción 2: abres la puerta y sales corriendo");
		
		opcionUsuario = pedirNumeroInt(scan);
		switch (opcionUsuario) {
		case 1: 
			System.out.println("Te duermes una vez más, tras tragarte la llave...");
			opcionUsuario = 15;
			break;
		case 2: 
			System.out.println("Enhorabuena, has salido, pero no sabes que te deparará el futuro...");
			opcionUsuario = 2;
			break;
		default:
			System.out.println("Una sombra se acerca a ti de forma vertiginosa...");
			opcionUsuario = 15;
		}
	}

	public static void comprobadorLocuraPuerta(int locura) {
		System.out.println(locura);
		if (locura >= 5) {
			
			System.out.println("Sientes que tu no eres tu, te miras en un reflejo, y ves que tu cara se ha vuelto borrosa y no tienes boca, lo que provoca que salgas corriendo hacia una pared con el cuchillo en el pecho, muriendo en el acto.");
			System.out.println("\n\nSe acabó, has muerto");
			opcionUsuario = 15;
		}
		
		
	}
}