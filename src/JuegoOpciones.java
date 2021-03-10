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
		
		System.out.println("\nTe dispones a abrir la puerta, pero te parece que hay algo al otro lado, se te erizan los pelos solo de imaginar que podría haber, te cargas de\n valor y abres la puesta de golpe.\nSolo ves oscuridad...\nTe dispones a coger la vela para ver algo, pero al darte la vuelta, la puerta a desaparecido, dejando una pared lisa con lo que parece que es cuadro colgado,\npero ni rastro de una puerta o rastro de ella.");
		System.out.println("Desesperado te llevas las manos a la cabeza y de rabia de no saber que está pasando tiras lo que parece que es un cuadro de la pared, rompiendose contra el suelo.");
		System.out.println("Sin ver nada, palpas la pared buscando algo con lo que iluminarte, y encuentras ¿Un escritorio? si, será eso. Y con suerte encuentras algo parecido a un candil.\nLo enciendes accionando el mecanismo, y vislumbras una sombra atravesando otra puerta al final del cuarto. Asustado y dudando de tu vista buscas algo con lo que\ndefenderte de un posible agresor, encuentras un tenedor y una cuchara.");
		System.out.println("\n¿Cúal vas a escoger?");
		System.out.println("Opción 1: tenedor\nOpción 2: cuchara");
		opcionUsuario = pedirNumeroInt(scan);
		switch (opcionUsuario) {
		case 1: 
			boolean tenedor = true;
			boolean cuchara = false;
			System.out.println("Coges el tenedor pensando que al menos es un objeto minimamente punzante.");
			break;
		case 2: 
			tenedor = false;
			cuchara = true;
			System.out.println("Escoges la cuchara ya que parece brillante y extraña.");
			break;
		case 7: //Opción secreta
			tenedor = false;
			cuchara = false;
			boolean cuchillo = true;
			opcionUsuario = 2;
			System.out.println("Descubres un cajón secreto debajo del escritorio,en ella hay un cuchillo de la misma cuberteria que la cuchara y el tenedor, te lo llevas contigo.");
			break;
		default: 
			System.out.println("Decides no coger nada, ya que no parece tener ningún uso futuro.");

		}
		
		System.out.println("Te adentras en la habitación, candil en mano, es un gran salón lleno de muebles viejos sin cubir y lleno de polvo, es tan grande que no ves al final del gran cuarto.");
		System.out.println("Escuchas unos crujidos en debajo de tus pies, como si algo se moviera en el piso inferior.");
		System.out.println("La situacion te pone mas nervisioso al fijarte que todos los cuadros de la sala tienen las caras tachadas de forma muy macabra, subiendo tu nivel de locura.");
		int locura = 1;
	}

}