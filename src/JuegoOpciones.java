import java.util.InputMismatchException;
import java.util.Scanner;

public class JuegoOpciones {
	static int numeroVecesJugadas = 1; //numero de veces que has vivido la historia
	static int opcionUsuario;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Despiertas en la cama de una peque�a habitaci�n que solamente tiene una puerta peque�a de madera al fondo,\nal lado de la cama tiene una trampilla y vislumbras una luz tenue de una vela en el suelo");
			System.out.println("No recuerdas nada, ni siquiera tu nombre. Tienes un fuerte dolor de cabeza y no sabes qu� haces en esa habitaci�n\nni donde est� situada");


			System.out.println("�Qu� quieres hacer?\n\t1) Investigar la trampilla\n\t2) Abrir la puerta y salir\n\t3) Volverte a dormir (ya que parece una pesadilla)");
			opcionUsuario = pedirNumeroInt(scan);
			switch (opcionUsuario) {
			case 1: 
				trampilla(scan);
				break;
			case 2: 
				System.out.println("Puerta");
				break;
			case 3: 
				System.out.println("Dormirse");
				break;
			default: 
				System.out.println("Intentas levantarte y pierdes el conocimiento");

			}
			numeroVecesJugadas++;
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
				scan.nextLine();
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
	static void trampilla(Scanner scan) {
		int locura = 0;
		String decisionSiNo = "";
		System.out.println("\nTe situas encima de la carcomida trampilla y te arrodillas para tocar su superficie en busca de un pomo.");
		System.out.println("Comienzas a notar unos crujidos bajo tus rodillas, intentas levantarte r�pidamente. Ya es tarde, para cuando consigues levantarte escuchas un fuerte chasquido que indica que la trampilla se ha roto bajo tus pies y te precipitas al vac�o");
		System.out.println("\nTras un golpe sordo te levantas aturdido, sientes un sabor met�lico en la boca pero parece que no te has hecho da�o. Notas un bulto en la pierna que se te clava a trav�s del pantal�n, acercas tu mano al bolsillo y encuentras una peque�a caja de cerillas.");
		System.out.println("\nSe escucha un lejano gru�ido en la oscura habitaci�n, �qu� haces?:\n\t1) Enciendes una cerilla para tratar de buscar el origen de ese ruido\n\t2) Te mantienes lo m�s silencioso posible a la espera de que el ruido se aleje\n");
		opcionUsuario = pedirNumeroInt(scan);
		if (opcionUsuario == 1) {
			System.out.println("\nPresa del miedo enciendes r�pidamente una cerilla para iluminar la habitaci�n.");
			System.out.println("Una siniestra voz te susurra al o�do: *no deber�as haber bajado aqu�...*");
			System.out.println("Notas como el aire se hace cada vez m�s denso y comienzas a sufir alucinaciones, cuanto m�s tiempo pasa, m�s te cuesta respirar. Tu mente empieza a nublarse mientras caes desplomado al suelo.\nLa siniestra voz te habla por �ltima vez: *...ahora formar�s parte del a historia de este lugar...*");
			System.out.println("Tu respiraci�n se va apagando lentamente... \n\n\t\tHAS MUERTO");
		}
		else {
			System.out.println("\nPresa del miedo decides agacharte y hacer el menor ruido posible.");
			System.out.println("El gru�ido se aleja junto con el sonido como de chapotear en un charco. Agazapado en esa habitaci�n te parece ver, de forma fugaz, la imagen de un escritorio de roble con un oxidado candil encima");
			System.out.println("\nEl ambiente se queda en completo silencio, los chapoteos se han disipado en la lejan�a, decides encender una cerilla ahora que sabes que est�s a salvo");
			System.out.println("Encuentras a tu alrededor una enorme cocina en la que parece que hace tiempo que no se utiliza, tienes hambre y puedes vislumbrar en la penumbra una olla\n\t1) Te acercas a inspeccionar la olla\n\t2) Buscas en la cocina a ver si encuentras comida fresca");
			opcionUsuario = pedirNumeroInt(scan);
			if (opcionUsuario == 1) {
				System.out.println("Abres la tapa de la olla y encuentras un caldo en el que flota una cosa blanca, metes un cucharon para comprobar que es y sacas un peque�o cr�neo");
				System.out.println("Retrocedes de la olla gritando y muerto de miedo lanzas con fuerza la peque�a calavera. (tus niveles de locura aumentan significativamente)");
				locura+=4;
				comprobadorLocura(locura);
			}
			System.out.println("Te pones a mirar con la cerilla a�n encendida por la habitaci�n y encuentras una peque�a caja con un 7 y un cuchillo dibujado, �quieres abrirla (si/no)?");
			decisionSiNo = scan.nextLine();
			if (decisionSiNo.equalsIgnoreCase("si")){
				System.out.println("\nAl abrir la caja encuentras una misteriosa tableta de chocolate en perfecto estado, decides com�rtela pero te sientes extra�ado por el estado del chocolate (tu nivel de locura se disminuye)");
				locura-=1;
			}
			System.out.println("\nContinuas registrando la habitaci�n y encuentras una puerta de madera que est� abierta, avanzas lentamente y te encuentras con una enorme galer�a iluminada que tiene en el medio una larga mesa para muchos comensales");
			System.out.println("Todo parece muy lujoso salvo por el hecho de que los cubiertos son de madera y est�n ro�dos");
			System.out.println("La habitaci�n luce abandonada desde hace a�os, as� lo muestran las enormes telara�as que se extienden por las columnas. \nDe un golpe se abre una peque�a ventana del techo y escuchas una voz un tanto siniestra que te dice: *...debes correr muy lejos de aqu�...* (tus niveles de locura aumentan significativamente)");
			locura+=4;
			comprobadorLocura(locura);
			System.out.println("\nTras recobrarte del susto intentas centrarte, no sabes donde est�s ni como has llegado a este lugar, la ventana est� demasiado alta como para poder escalar a mirar el exterior. En la derecha de la habitaci�n, casi oculto tras unas cortinas ves un cartel que dice: \n\t1) Escaleras superiores\n\t2) Escaleras inferiores\n�Por d�nde quieres ir?");
			opcionUsuario = pedirNumeroInt(scan);
			switch (opcionUsuario) {
			case 1: 
				System.out.println("\nSubes por las escaleras y desembocas ante una puerta de metal, est� un poco oxidada aunque seguramente seas capaz de abrirla sin problema.\nComienzas a escuchar los gru�idos de antes cada vez m�s cerca, �qu� haces?\n\t1) Abrir la puerta y huir\n\t2) Apagar la cerilla y mantenerte en silencio");
				opcionUsuario = pedirNumeroInt(scan);
				if (opcionUsuario == 1) {
					System.out.println("\nTras unos fuertes golpes en la puerta consigues abrirla y sales a un enorme patio interior, observas la silueta de una estatua en la mitad del patio\n\tadem�s puedes ver una hilera de almenaras que bordean el patio como si de una fortaleza se tratase");
					System.out.println("El sonido del chapoteo te hace recordar r�pidamente que algo te persigue y aunque muerto de miedo, consigues cerrar la puerta. (tu nivel de locura aumenta de forma cr�tica)");
					locura+=7;
					comprobadorLocura(locura);
					System.out.println("Te acercas a la estatua del �ngel d�nde encuentras una inscripci�n: \n\t\"He sobrevivido "+ numeroVecesJugadas +" veces\"");
					System.out.println("De repente un golpe seco te hace caer al suelo, desmayado...\n");
					opcionUsuario = 15; //continuar juego en bucle
				}
				else {
					System.out.println("\nApagas r�pidamente tu cerilla preso del miedo y tratas de hacer el menor ruido posible, hasta que deja de o�rse el chapoteo");
					System.out.println("Enciendes otra cerilla y encuentras delante de t� una aberraci�n de la naturaleza de color verdoso que con voz dulce te dice:\n\t*...te dije que deb�as correr muy lejos de aqu�...*");
					System.out.println("\n\tSu voz se torna m�s grave y los ojos de la criatura se inyectan en sangre: \n\t*...AHORA DEBES MORIR...*");
					locura+=20; //personaje muere si o s�
					comprobadorLocura(locura);

				}

				break;

			case 2:
				System.out.println("\nCoges las escaleras que bajan a un s�tano, cada vez sientes m�s y m�s fr�o...\nEl ambiente est� muy h�medo, notas bajo tus pies descalzos peque�os charcos un poco viscosos. Cuidadosamente enciendes tu cerilla y comienzas a mirar a tu alrededor.\nUna extra�a bombilla parpadea con una luz muy tenue al final del enorme pasillo que compone el s�tano.\nObservas que un reguero rojo y viscoso avanza por el suelo hasta una puerta al final de la sala �qu� haces?\n\t1) Seguirlo\n\t2) Tratar de obtener m�s informaci�n de ese flu�do");
				opcionUsuario = pedirNumeroInt(scan);
				if (opcionUsuario == 1) {
					System.out.println("Sigues el reguero sin hacer caso a tu instinto que te dice que deber�as huir de all�.\nA medida que va aumentando el caudal el olor empieza a ser insoportable, sientes un fuerte olor como a carne podrida.\nSin que te des cuenta la aberraci�n que encontraste en la cocina aparece rompiendo la puerta dispuesta a matarte a golpes, �qu� haces?\n\t1) Te enfrentas a ella\n\t2) Te preparas para parar el golpe");
					opcionUsuario = pedirNumeroInt(scan);
					if (opcionUsuario == 1) {
						System.out.println("Tratas de darle un golpe cuando la tienes casi encima pero descubres que no es un ser corp�reo, comienzas a notar como tu cuerpo se deshace poco a poco y gritas de dolor mientras agonizas en el suelo...\n\n\n\tHAS MUERTO\n\n\n");
						break;
					}
					else {
						System.out.println("Para tu suerte recibes un impacto no demasiado fuerte que te deja en el suelo inconsciente...\nCon un primer momento de lucidez eres capaz de ver como algo te est� arrastrando por un enorme pasillo de piedra, antes de caer inconsciente de nuevo crees pasar por delante de una habitaci�n con un peque�o escritorio de roble\n");
						opcionUsuario = 15; //continuar juego en bucle
						numeroVecesJugadas++;
					}

				} 
				else {
					System.out.println("Tratas de averiguar qu� es el extra�o flu�do que tienes bajo tus pies, acercas la cerilla pero a penas eres capaz de ver algo que no sea el color rojo, parece sangre pero no est�s seguro de d�nde puede proceder, comienzas a avanzar lentamente siguiendo el rastro y te cortas con un peque�o trozo de metal en la pierna. A medida que te acercas a las puerta, sientes como el suelo vibra bajo tus pies, como si algo muy pesado estuviera corriendo. Crees que est�s volvi�ndote loco y lo ignoras.\nAbres la enorme puerta y al otro lado encuentras un espejo con una mancha de sangre que dice:\n\t*Nunca podremos salir de aqu�*\n\nDebido a tus heridas caes al suelo desorientado.\n");
					opcionUsuario = 15; //continuar juego en bucle
					numeroVecesJugadas++;

				}

				break;
			default:
				System.out.println("Comienzas a sentir los gru�idos de antes detr�s de t� y decides subir las escaleras esperando llegar a una salida.\nPreso del p�nico subes corriendo y encuentras una puerta. Embistes la puerta y sales al exterior\nobservas la silueta de una estatua en la mitad del patio\\n\\tadem�s puedes ver una hilera de almenaras que bordean el patio como si de una fortaleza se tratase El sonido del chapoteo te hace recordar r�pidamente que algo te persigue y aunque muerto de miedo, consigues cerrar la puerta. (tu nivel de locura aumenta de forma cr�tica)\n");
				locura+=7;
				comprobadorLocura(locura);
				break;
			}

		}
	}
	static void comprobadorLocura(int locura) {
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

}