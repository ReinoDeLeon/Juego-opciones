import java.util.InputMismatchException;
import java.util.Scanner;

public class JuegoOpciones {

	static int opcionUsuario;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Despiertas en la cama de una pequeña habitación que solamente tiene una puerta pequeña de madera al fondo,\nal lado de la cama tiene una trampilla y vislumbras una luz tenue de una vela en el suelo");
		System.out.println("No recuerdas nada, ni siquiera tu nombre. Tienes un fuerte dolor de cabeza y no sabes qué haces en esa habitación\nni donde está situada");

		do {
			System.out.println("¿Qué quieres hacer?\n\t1) Investigar la trampilla\n\t2) Abrir la puerta y salir\n\t3) Volverte a dormir (ya que parece una pesadilla)");
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
		 * pediremos un numero y comprobamos que la entrada por teclado es numérica
		 */
		boolean control = true;
		do {
			try {
				System.out.print("Introduzca una opción: -> ");
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

	public static void dormirse(Scanner scan) {
		
		int locura = 0;
		
		for (int i = 0; i < 6; i++) {
			delay(500);
			System.out.println(".");
		}
		
		System.out.println("Despiertas en una lúgubre habitación. Una tenue luz de una vela a punto de apagarse flagra en una mesita al lado de la cama.\nConmocionado, sigues sin saber nada, excepto que ya no estas en la misma habitación, todo había pasado, lo de antes solo fue un mal sueño, pero… No era así.");
		System.out.println("\nDistingues la silueta de un hombre dado la espalda. Parece que no sabe que te has despertado.");
		System.out.println("\n¿Qué decides hacer?\n\n\t1) Preguntas quien es y donde estas.\n\n\t2) Te quedas en silencio para que no se dé cuenta y poder escapar.\n");
		
		opcionUsuario = pedirNumeroInt(scan);

		
		if (opcionUsuario == 1) {
			
			System.out.println("\nSe gira malhumorado y se acerca a ti con rapidez, según se va acercando a la luz vas distinguiéndole cada vez más.\nTe das cuenta de que no es una persona, es algo mucho peor, un ser proveniente del inframundo.\nVestido con lo que parece un uniforme de médico, te mira con unos ojos negros como el carbón que se clavan en tu alma.\nAbre su boca dispuesto a comerte, revela unos dientes afilados, sabes que tu hora había llegado.");
			System.out.println("\nUn gran estruendo inunda la habitación interrumpiendo al ser que iba a comerte, el sonido parecía de un suelo de madera que se había roto, \nparecía estar a pocos metros de donde te encuentras.");
			System.out.println("\nEl monstruo parece alertarse bastante, decide pegarte un puñetazo en la cara y se va por una puerta de la habitación en busca de la causa de ese sonido.");
			System.out.println("\n\nTu nivel de locura aumenta");
			locura = 7;
		} else if (opcionUsuario == 2) {
			delay(2000);
			System.out.println("\nUn gran estruendo inunda la habitación, el sonido parecía de un suelo de madera que se había roto, parecía estar a pocos metros de donde te encuentras. \nEl hombre parece alertarse bastante y se va por una puerta de la habitación en busca de la causa de ese sonido.");
		} else {
			System.out.println("\nNo se que intentas hacer, pero parece que has llamado la atenccion del hombre.");
			System.out.println("\nSe gira malhumorado y se acerca a ti con rapidez, según se va acercando a la luz vas distinguiéndole cada vez más.\nTe das cuenta de que no es una persona, es algo mucho peor, un ser proveniente del inframundo.\nVestido con lo que parece un uniforme de médico, te mira con unos ojos negros como el carbón que se clavan en tu alma.\nAbre su boca dispuesto a comerte, revela unos dientes afilados, sabes que tu hora había llegado.");
			System.out.println("\nUn gran estruendo inunda la habitación interrumpiendo al ser que iba a comerte, el sonido parecía de un suelo de madera que se había roto, \nparecía estar a pocos metros de donde te encuentras.");
			System.out.println("\nEl monstruo parece alertarse bastante, decide pegarte un puñetazo en la cara y se va por una puerta de la habitación en busca de la causa de ese sonido.");
			System.out.println("\n\nTu nivel de locura aumenta");
			locura = 7;
		}
		
		
		System.out.println();
		System.out.println("Sales de la habitación lo antes posible antes de que vuelva eso. Avanzas por un pasillo apagado y mugriento,\nlas telarañas abundan en el zócalo del techo, mientras caminas suena el rechinar del suelo.\nAvanzando por una alfombra roja muy lustrosa llegas a una especie de vestíbulo principal.");
		System.out.println("\nVes una gran puerta de madera que parece ser la puerta principal de donde te hayas.\nComo no, la puerta está cerrada a cal y canto.");
		System.out.println("Observando el vestíbulo, ves una gran escalera que sube al piso superior y otro pasillo que no sabes dónde irá.");
		System.out.println("A la lejanía escuchas pasos, parecen venir de la habitación donde te encontrabas, tenias que salir de allí antes de que supiera que estas aquí.");
		
		System.out.println("\n¿Qué decides hacer?\n\n\t1) Subes por la escalera.\n\n\t2) Avanzas por el pasillo.\n");
		opcionUsuario = pedirNumeroInt(scan);
		
		if (opcionUsuario == 1) {
			
			System.out.println("Subes rápido pero con cuidado de no hacer ruido por la escalera, y llegas a un pasillo.");
			System.out.println("\nTienes dos caminos, ir por la izquierda o por la derecha\n¿Por cual decides ir?\n\n\t1) Izquierda.\n\n\t2) Derecha\n");
			opcionUsuario = pedirNumeroInt(scan);
			if (opcionUsuario == 1) {
				
				System.out.println("\nCaminas rápido por un pasillo angosto, los pasos detrás de ti cada vez suenan más fuerte y más cercanos, tu corazón palpita cada vez mas rápido.");
				System.out.println("No ves nada mas que una puerta al final, un fuerte grito dirigido a ti suena a tus espaldas a escasos metros.");
				System.out.println("Empiezas a correr, pero los pasos detrás de ti se agilizan y cada vez están mas cerca.");
				System.out.println("Llegas al final del pasillo, abres la puerta rápidamente, y entras, al cerrar la puerta ves aquello que te perseguía y estaba ahí justamente,\ntu corazón palpita a punto de explotar, pero le cierras la puerta con fuerza.");
				System.out.println("No puedes más, tu corazón palpita tan fuerte que te agarras el pecho y…");
				System.out.println("PUM………\n");
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