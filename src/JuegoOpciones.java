import java.util.InputMismatchException;
import java.util.Scanner;

public class JuegoOpciones {

	static int opcionUsuario;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Despiertas en la cama de una peque�a habitaci�n que solamente tiene una puerta peque�a de madera al fondo,\nal lado de la cama tiene una trampilla y vislumbras una luz tenue de una vela en el suelo");
		System.out.println("No recuerdas nada, ni siquiera tu nombre. Tienes un fuerte dolor de cabeza y no sabes qu� haces en esa habitaci�n\nni donde est� situada");

		do {
			System.out.println("�Qu� quieres hacer?\n\t1) Investigar la trampilla\n\t2) Abrir la puerta y salir\n\t3) Volverte a dormir (ya que parece una pesadilla)");
			opcionUsuario = pedirNumeroInt(scan);
			switch (opcionUsuario) {
			case 1: 
				System.out.println("Trampilla");
				break;
			case 2: 
				System.out.println("Puerta");
				break;
			case 3: 
				System.out.println("Dormirse");
				dormirse(scan);
				break;
			default: 
				System.out.println("Intentas levantarte y pierdes el conocimiento");

			}
		} while (opcionUsuario > 3 || opcionUsuario < 1);

	}
	public static int pedirNumeroInt(Scanner scan) {
		/*
		 * pediremos un numero y comprobamos que la entrada por teclado es num�rica
		 */
		boolean control = true;
		do {
			try {
				System.out.print("Introduzca una opci�n: -> ");
				int valor = scan.nextInt();
				control = false;
				return valor;
			} catch (InputMismatchException e) {
				scan.next();
				System.out.println("El valor introducido no es num�rico o contiene decimales");
				continue;
			}
		} while (control);
		return 0;
	}

	public static void dormirse(Scanner scan) {
		
		int locura = 0;
		
		for (int i = 0; i < 6; i++) {
			delay(500);
			System.out.println(".");
		}
		
		System.out.println("Despiertas en una l�gubre habitaci�n. Una tenue luz de una vela a punto de apagarse flagra en una mesita al lado de la cama.\nConmocionado, sigues sin saber nada, excepto que ya no estas en la misma habitaci�n, todo hab�a pasado, lo de antes solo fue un mal sue�o, pero� No era as�.");
		System.out.println("\nDistingues la silueta de un hombre dado la espalda. Parece que no sabe que te has despertado.");
		System.out.println("\n�Qu� decides hacer?\n\n\t1) Preguntas quien es y donde estas.\n\n\t2) Te quedas en silencio para que no se d� cuenta y poder escapar.\n");
		
		opcionUsuario = pedirNumeroInt(scan);

		
		if (opcionUsuario == 1) {
			
			System.out.println("\nSe gira malhumorado y se acerca a ti con rapidez, seg�n se va acercando a la luz vas distingui�ndole cada vez m�s.\nTe das cuenta de que no es una persona, es algo mucho peor, un ser proveniente del inframundo.\nVestido con lo que parece un uniforme de m�dico, te mira con unos ojos negros como el carb�n que se clavan en tu alma.\nAbre su boca dispuesto a comerte, revela unos dientes afilados, sabes que tu hora hab�a llegado.");
			System.out.println("\nUn gran estruendo inunda la habitaci�n interrumpiendo al ser que iba a comerte, el sonido parec�a de un suelo de madera que se hab�a roto, \nparec�a estar a pocos metros de donde te encuentras.");
			System.out.println("\nEl monstruo parece alertarse bastante, decide pegarte un pu�etazo en la cara y se va por una puerta de la habitaci�n en busca de la causa de ese sonido.");
			System.out.println("\n\nTu nivel de locura aumenta");
			locura = 7;
		} else if (opcionUsuario == 2) {
			delay(2000);
			System.out.println("\nUn gran estruendo inunda la habitaci�n, el sonido parec�a de un suelo de madera que se hab�a roto, parec�a estar a pocos metros de donde te encuentras. \nEl hombre parece alertarse bastante y se va por una puerta de la habitaci�n en busca de la causa de ese sonido.");
		} else {
			System.out.println("\nNo se que intentas hacer, pero parece que has llamado la atenccion del hombre.");
			System.out.println("\nSe gira malhumorado y se acerca a ti con rapidez, seg�n se va acercando a la luz vas distingui�ndole cada vez m�s.\nTe das cuenta de que no es una persona, es algo mucho peor, un ser proveniente del inframundo.\nVestido con lo que parece un uniforme de m�dico, te mira con unos ojos negros como el carb�n que se clavan en tu alma.\nAbre su boca dispuesto a comerte, revela unos dientes afilados, sabes que tu hora hab�a llegado.");
			System.out.println("\nUn gran estruendo inunda la habitaci�n interrumpiendo al ser que iba a comerte, el sonido parec�a de un suelo de madera que se hab�a roto, \nparec�a estar a pocos metros de donde te encuentras.");
			System.out.println("\nEl monstruo parece alertarse bastante, decide pegarte un pu�etazo en la cara y se va por una puerta de la habitaci�n en busca de la causa de ese sonido.");
			System.out.println("\n\nTu nivel de locura aumenta");
			locura = 7;
		}
		
		
		System.out.println();
		System.out.println("Sales de la habitaci�n lo antes posible antes de que vuelva eso. Avanzas por un pasillo apagado y mugriento,\nlas telara�as abundan en el z�calo del techo, mientras caminas suena el rechinar del suelo.\nAvanzando por una alfombra roja muy lustrosa llegas a una especie de vest�bulo principal.");
		System.out.println("\nVes una gran puerta de madera que parece ser la puerta principal de donde te hayas.\nComo no, la puerta est� cerrada a cal y canto.");
		System.out.println("Observando el vest�bulo, ves una gran escalera que sube al piso superior y otro pasillo que no sabes d�nde ir�.");
		System.out.println("A la lejan�a escuchas pasos, parecen venir de la habitaci�n donde te encontrabas, tenias que salir de all� antes de que supiera que estas aqu�.");
		
		System.out.println("\n�Qu� decides hacer?\n\n\t1) Subes por la escalera.\n\n\t2) Avanzas por el pasillo.\n");
		opcionUsuario = pedirNumeroInt(scan);
		
		if (opcionUsuario == 1) {
			
			System.out.println("Subes r�pido pero con cuidado de no hacer ruido por la escalera, y llegas a un pasillo.");
			System.out.println("\nTienes dos caminos, ir por la izquierda o por la derecha\n�Por cual decides ir?\n\n\t1) Izquierda.\n\n\t2) Derecha\n");
			opcionUsuario = pedirNumeroInt(scan);
			if (opcionUsuario == 1) {
				
				System.out.println("\nCaminas r�pido por un pasillo angosto, los pasos detr�s de ti cada vez suenan m�s fuerte y m�s cercanos, tu coraz�n palpita cada vez mas r�pido.");
				System.out.println("No ves nada mas que una puerta al final, un fuerte grito dirigido a ti suena a tus espaldas a escasos metros.");
				System.out.println("Empiezas a correr, pero los pasos detr�s de ti se agilizan y cada vez est�n mas cerca.");
				System.out.println("Llegas al final del pasillo, abres la puerta r�pidamente, y entras, al cerrar la puerta ves aquello que te persegu�a y estaba ah� justamente,\ntu coraz�n palpita a punto de explotar, pero le cierras la puerta con fuerza.");
				System.out.println("No puedes m�s, tu coraz�n palpita tan fuerte que te agarras el pecho y�");
				System.out.println("PUM���\n");
				delay(30000);
				System.out.println("Te relajas, parece que todo ha pasado.");
				delay(3000);
				System.out.println("\nUn silencio inunda tu cuerpo.");
				System.out.println("Escuchas una armonia celestial y...");
				delay(3000);
				System.out.println("Caes de golpe contra el suelo.\n\n");
				delay(3000);
				main(null);
				
			} else if (opcionUsuario == 2) {
				
				System.out.println("");
				
				
				
			} else {
				
			}
			
		} else if (opcionUsuario == 2) {
			
			System.out.println("");
			
		} else {
			
		}
		
		
	}
	 
	public static void comprobadorLocura(int locura) {
		if (locura < 7) {
			System.out.println("\n\n...Sientes unas voces en tu cabeza que te hablan en un idioma que desconoces...\n\n");
		}
		
	}
	
	public static void delay(long milis) {
		
		try {
			Thread.sleep(milis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}