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
		System.out.println("\n�Qu� decides hacer?\n\n\t1) Preguntas quien es y donde estas.\n\n\t2) Te quedas en silencio.\n");

		opcionUsuario = pedirNumeroInt(scan);


		if (opcionUsuario == 1) {

			System.out.println("\nSe gira malhumorado y se acerca a ti con rapidez, seg�n se va acercando a la luz vas distingui�ndole cada vez m�s.\nTe das cuenta de que no es una persona, es algo mucho peor, un ser proveniente del inframundo.\nVestido con lo que parece un uniforme de m�dico, te mira con unos ojos negros como el carb�n que se clavan en tu alma.\nAbre su boca dispuesto a comerte, revela unos dientes afilados, sabes que tu hora hab�a llegado.");
			System.out.println("\nUn gran estruendo inunda la habitaci�n interrumpiendo al ser que iba a comerte, el sonido parec�a de un suelo de madera que se hab�a roto, \nparec�a estar a pocos metros de donde te encuentras.");
			System.out.println("\nEl monstruo parece alertarse bastante, decide pegarte un pu�etazo en la cara y se va por una puerta de la habitaci�n en busca de la causa de ese sonido.");
			System.out.println("\n\nTu nivel de locura aumenta");
			locura = 5;
		} else if (opcionUsuario == 2) {
			delay(2000);
			System.out.println("\nUn gran estruendo inunda la habitaci�n, el sonido parec�a de un suelo de madera que se hab�a roto, parec�a estar a pocos metros de donde te encuentras. \nEl hombre parece alertarse bastante y se va por una puerta de la habitaci�n en busca de la causa de ese sonido.");
		} else {
			System.out.println("\nNo se que intentas hacer, pero parece que has llamado la atenccion del hombre.");
			System.out.println("\nSe gira malhumorado y se acerca a ti con rapidez, seg�n se va acercando a la luz vas distingui�ndole cada vez m�s.\nTe das cuenta de que no es una persona, es algo mucho peor, un ser proveniente del inframundo.\nVestido con lo que parece un uniforme de m�dico, te mira con unos ojos negros como el carb�n que se clavan en tu alma.\nAbre su boca dispuesto a comerte, revela unos dientes afilados, sabes que tu hora hab�a llegado.");
			System.out.println("\nUn gran estruendo inunda la habitaci�n interrumpiendo al ser que iba a comerte, el sonido parec�a de un suelo de madera que se hab�a roto, \nparec�a estar a pocos metros de donde te encuentras.");
			System.out.println("\nEl monstruo parece alertarse bastante, decide pegarte un pu�etazo en la cara y se va por una puerta de la habitaci�n en busca de la causa de ese sonido.");
			System.out.println("\n\nTu nivel de locura aumenta");
			locura = 5;
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

				System.out.println("\nAvanzas por la derecha, te das cuenta de que el pasillo no tiene escapatoria, solo un ventanal al final del pasillo. Decides volver pero al darte la vuelta hay una pared.\n");
				System.out.println("Se escucha un fuerte mecanismo de engranajes y la pared comienza a desplazarse hacia tu posici�n. Intentas pararla sin conseguir nada, la pared cada vez va m�s r�pido.");
				System.out.println("Poco a poco te vas acercando al ventanal, del miedo, la �nica reacci�n que toma tu cuerpo es correr hacia el ventanal y saltas hacia �l.");
				System.out.println("El ventanal daba a un patio interior, con la mala suerte de caer encima de una valla, clav�ndote la punta de flecha en el est�mago.\n");
				System.out.println("Te desangras lentamente hasta morir.\n\n");
				main(null);

			} else {
				
				System.out.println("De los nervios, no decides con certeza y eliges el camino de la izquierda.");
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
				
			}

		} else if (opcionUsuario == 2) {

			System.out.println("Continuas con prisa por el pasillo, avanzando por el ves dos puertas entreabiertas, tienes que elegir una de ellas para esconderte.");
			System.out.println("\nTienes dos caminos, la puerta de la izquierda o la puerta de la derecha\n�Por cual decides ir?\n\n\t1) Puerta izquierda.\n\n\t2) Puerta derecha\n");
			opcionUsuario = pedirNumeroInt(scan);
			
			if (opcionUsuario == 1) {
				
				System.out.println("Abres la puerta de la izquierda y entras, cierras la puerta y esperas en silencio.");
				System.out.println("Escuchas unos pasos que se acercan cada vez m�s, y se paran justo al otro lado de la puerta.");
				delay(3000);
				System.out.println("\nLos pasos se vuelven a o�r alej�ndose cada vez m�s, parece que el peligro ha pasado. Mejor ser� no salir.");
				
				System.out.println("Estas en una habitaci�n completamente a oscuras, notas un escal�n, parece que hay unas escaleras hacia abajo, pero no es muy buena idea bajar a oscuras,");
				System.out.println("notas un olor extra�o y una brisa roza tu cara. Encima de ti, notas una cuerda que acciona un interruptor.");
				System.out.println("\nPuedes accionar el interrupto para encender la luz o bajar las escaleras a oscuras\n�Que decides hacer?\n\n\t1) Bajas a tientas las escaleras\n\n\t2) Enciendes la luz\n");
				opcionUsuario = pedirNumeroInt(scan);
				
				if (opcionUsuario == 1) {
					
					System.out.println("\nTe dispones a bajar las escaleras con cuidado, escal�n a escal�n el olor cada vez es mas fuerte.");
					System.out.println("Un escal�n mal colocado te hace tropezar haciendo que vayas de cabeza contra el vac�o.\n");
					System.out.println("Caes contra un escal�n, que te da en la cabeza y quedas inconsciente, las escaleras se pierden en el vac�o.");
					System.out.println("Tu cuerpo sigue cayendo sin fin a un vac�o oscuro y frio, donde se perder� para siempre.\n\n");
					main(null);
					
				} else if (opcionUsuario == 2) {
					
					System.out.println("Alzas la mano para encender el interruptor. La luz parpadea, apagas y vuelves a encender, delante de ti se encuentra ese ser que se dispon�a a matarte.");
					System.out.println("Es� horroroso�");
					System.out.println("Te deja sin palabras");
					System.out.println("Sin consciencia propia");
					System.out.println("Tu mano agarrotada en la cuerda del interruptor, del miedo, accionas el interruptor, apagando la luz.");
					locura = locura + 15;
					comprobadorLocura(locura);
					System.out.println("\n\n");
					main(null);
					
				} else {
					
					System.out.println("Te mareas y no mantienes el control, hace que vayas de cabeza contra el vac�o.");
					System.out.println("Caes contra un escal�n, que te da en la cabeza y quedas inconsciente, las escaleras se pierden en el vac�o.");
					System.out.println("Tu cuerpo sigue cayendo sin fin a un vac�o oscuro y frio, donde se perder� para siempre.");
					main(null);
					
				}
				
				
			} else if (opcionUsuario == 2) {
				
				System.out.println("Abres la puerta de la derecha y entras, cierras la puerta y esperas en silencio.");
				System.out.println("Escuchas unos pasos que se acercan cada vez m�s, y se paran justo al otro lado de la puerta.");
				delay(3000);
				System.out.println("\nLos pasos se vuelven a o�r alej�ndose cada vez m�s, parece que el peligro ha pasado. Mejor ser� no salir.");
				System.out.println("En cuanto te tranquilizas, notas un olor pestilente, al girarte ves que te encuentras en un establo muy descuidado, esta todo completamente vac�o y destrozado.\n");
				System.out.println("Al final del establo ves un port�n abierto que da al exterior, avanzas hacia �l. ");
				System.out.println("Al lado del port�n, en una escuadra medio decente escuchas unos ruidos, al acercarte ves un roc�n que se levanta y se acerca cari�osamente.");
				
				do {
					
				System.out.println("\nTienes que salir de aqu�\n�Que decides hacer?\n\n\t1) Dejar el caballo y salir a pie al exterior.\n\n\t2) Montarte en el caballo y salir con �l al exterior.\n");
				opcionUsuario = pedirNumeroInt(scan);
				
				if (opcionUsuario == 1) {
					
					System.out.println("Sales por el port�n corriendo, sin mirar atr�s para no perder tiempo. Corres sin parar, pero no sabes a d�nde vas, este todo oscuro.");
					System.out.println("Escuchas un fuerte sonido de una cuerda destensarse a la lejan�a.");
					System.out.println("Un silbido suena cada vez m�s cerca.");
					System.out.println("Y de repente�\n\n");
					delay(10000);
					System.out.println("Un gran arp�n te ensarta el coraz�n por las espalada.\n");
					System.out.println("Caes al instante apaciguado, a los pocos segundos, tu cuerpo yace sin vida en el suelo.\n");
					System.out.println("Y poco a poco te van arrastrando devuelta a ese lugar maldito.\n\n\n\n");
					main(null);
					
				} else if (opcionUsuario == 2) {
					
					System.out.println("Te subes a lomos del caballo, y cabalgas r�pido hacia el horizonte oscuro.");
					System.out.println("Escuchas un fuerte sonido de una cuerda destensarse a la lejan�a.");
					System.out.println("Un silbido suena cada vez m�s cerca.");
					System.out.println("Un arp�n cae a pocos metros de ti, parece que te has librado.");
					System.out.println("Todo parece sombr�o y frio, parece que has escapado de ese maldito lugar.");
					System.out.println("No ves absolutamente nada, la oscuridad te va comiendo cada vez m�s, no consigues ver ni el suelo.");
					System.out.println("Poco a poco la oscuridad va encerr�ndote m�s, en pocos segundos el caballo desaparece de tu vista.");
					System.out.println("Caes a un vac�o que te consume, sientes mas frio y que tu alama se separa de tu cuerpo, cierras los ojos y notas una paz eterna�\n\n");
					delay(15000);
					main(null);
					
				} else {
					
					System.out.println("Tienes que escoger una opcion.");
					
				}
				
				} while (true);
				
			} else {
				
				System.out.println("No sabes que decision tomar. Te quedas paralizado\n");
				System.out.println("Los pasos por detras suenan cada vez mas cerca, derrepente recibes un fuerte golpe en la cabeza que te deja incosciente al instante.");
				System.out.println("Notas como te arrastran y te llevan a una habitaci�n.");
				main(null);
			}
			
		} else {

			System.out.println("No sabes que decision tomar. Te quedas paralizado\n");
			System.out.println("Los pasos por detras suenan cada vez mas cerca, derrepente recibes un fuerte golpe en la cabeza que te deja incosciente al instante.");
			System.out.println("Notas como te arrastran y te llevan a una habitaci�n.");
			main(null);
			
		}


	}

	public static void comprobadorLocura(int locura) {
		if (locura < 5) {
			System.out.println("\n\n...Sientes unas voces en tu cabeza que te hablan en un idioma que desconoces...\n\n");
		}
		else if (locura >5 && locura < 10) {
			System.out.println("\n\n...Escuchas unas voces en tu cabeza que no comprendes, solo eres capaz de entender la palabra: final...\n\n");
			locura++;
		}
		else if (locura > 10 && locura < 18) {
			System.out.println("\n\n...Crees entender las voces de tu cabeza que te dicen este es el final de tu historia...\n\n");
			locura++;
		}
		else if (locura > 18) {
			System.out.println("\n\n...Comienzas a ver bichos subiendo por tu piel y tratas de arranc�rtela, lo que provoca tu muerte...\n\n\n\n\t\tHAS MUERTO");

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