import java.util.InputMismatchException;
import java.util.Scanner;

public class JuegoOpciones {

	static int numeroVecesJugadas = 1; //numero de veces que has vivido la historia
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
		 * pediremos un numero y comprobamos que la entrada por teclado es numérica
		 */
		boolean control = true;
		do {
			try {
				System.out.print("Introduzca una opción: -> ");
				int valor = scan.nextInt();
				scan.nextLine();
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
	static void trampilla(Scanner scan) {
		int locura = 0;
		String decisionSiNo = "";
		System.out.println("\nTe situas encima de la carcomida trampilla y te arrodillas para tocar su superficie en busca de un pomo.");
		System.out.println("Comienzas a notar unos crujidos bajo tus rodillas, intentas levantarte rápidamente. Ya es tarde, para cuando consigues levantarte escuchas un fuerte chasquido que indica que la trampilla se ha roto bajo tus pies y te precipitas al vacío");
		System.out.println("\nTras un golpe sordo te levantas aturdido, sientes un sabor metálico en la boca pero parece que no te has hecho daño. Notas un bulto en la pierna que se te clava a través del pantalón, acercas tu mano al bolsillo y encuentras una pequeña caja de cerillas.");
		System.out.println("\nSe escucha un lejano gruñido en la oscura habitación, ¿qué haces?:\n\t1) Enciendes una cerilla para tratar de buscar el origen de ese ruido\n\t2) Te mantienes lo más silencioso posible a la espera de que el ruido se aleje\n");
		opcionUsuario = pedirNumeroInt(scan);
		if (opcionUsuario == 1) {
			System.out.println("\nPresa del miedo enciendes rápidamente una cerilla para iluminar la habitación.");
			System.out.println("Una siniestra voz te susurra al oído: *no deberías haber bajado aquí...*");
			System.out.println("Notas como el aire se hace cada vez más denso y comienzas a sufir alucinaciones, cuanto más tiempo pasa, más te cuesta respirar. Tu mente empieza a nublarse mientras caes desplomado al suelo.\nLa siniestra voz te habla por última vez: *...ahora formarás parte del a historia de este lugar...*");
			System.out.println("Tu respiración se va apagando lentamente... \n\n\t\tHAS MUERTO");
		}
		else {
			System.out.println("\nPresa del miedo decides agacharte y hacer el menor ruido posible.");
			System.out.println("El gruñido se aleja junto con el sonido como de chapotear en un charco. Agazapado en esa habitación te parece ver, de forma fugaz, la imagen de un escritorio de roble con un oxidado candil encima");
			System.out.println("\nEl ambiente se queda en completo silencio, los chapoteos se han disipado en la lejanía, decides encender una cerilla ahora que sabes que estás a salvo");
			System.out.println("Encuentras a tu alrededor una enorme cocina en la que parece que hace tiempo que no se utiliza, tienes hambre y puedes vislumbrar en la penumbra una olla\n\t1) Te acercas a inspeccionar la olla\n\t2) Buscas en la cocina a ver si encuentras comida fresca");
			opcionUsuario = pedirNumeroInt(scan);
			if (opcionUsuario == 1) {
				System.out.println("Abres la tapa de la olla y encuentras un caldo en el que flota una cosa blanca, metes un cucharon para comprobar que es y sacas un pequeño cráneo");
				System.out.println("Retrocedes de la olla gritando y muerto de miedo lanzas con fuerza la pequeña calavera. (tus niveles de locura aumentan significativamente)");
				locura+=4;
				comprobadorLocura(locura);
			}
			System.out.println("Te pones a mirar con la cerilla aún encendida por la habitación y encuentras una pequeña caja con un 7 y un cuchillo dibujado, ¿quieres abrirla (si/no)?");
			decisionSiNo = scan.nextLine();
			if (decisionSiNo.equalsIgnoreCase("si")){
				System.out.println("\nAl abrir la caja encuentras una misteriosa tableta de chocolate en perfecto estado, decides comértela pero te sientes extrañado por el estado del chocolate (tu nivel de locura se disminuye)");
				locura-=1;
			}
			System.out.println("\nContinuas registrando la habitación y encuentras una puerta de madera que está abierta, avanzas lentamente y te encuentras con una enorme galería iluminada que tiene en el medio una larga mesa para muchos comensales");
			System.out.println("Todo parece muy lujoso salvo por el hecho de que los cubiertos son de madera y están roídos");
			System.out.println("La habitación luce abandonada desde hace años, así lo muestran las enormes telarañas que se extienden por las columnas. \nDe un golpe se abre una pequeña ventana del techo y escuchas una voz un tanto siniestra que te dice: *...debes correr muy lejos de aquí...* (tus niveles de locura aumentan significativamente)");
			locura+=4;
			comprobadorLocura(locura);
			System.out.println("\nTras recobrarte del susto intentas centrarte, no sabes donde estás ni como has llegado a este lugar, la ventana está demasiado alta como para poder escalar a mirar el exterior. En la derecha de la habitación, casi oculto tras unas cortinas ves un cartel que dice: \n\t1) Escaleras superiores\n\t2) Escaleras inferiores\n¿Por dónde quieres ir?");
			opcionUsuario = pedirNumeroInt(scan);
			switch (opcionUsuario) {
			case 1: 
				System.out.println("\nSubes por las escaleras y desembocas ante una puerta de metal, está un poco oxidada aunque seguramente seas capaz de abrirla sin problema.\nComienzas a escuchar los gruñidos de antes cada vez más cerca, ¿qué haces?\n\t1) Abrir la puerta y huir\n\t2) Apagar la cerilla y mantenerte en silencio");
				opcionUsuario = pedirNumeroInt(scan);
				if (opcionUsuario == 1) {
					System.out.println("\nTras unos fuertes golpes en la puerta consigues abrirla y sales a un enorme patio interior, observas la silueta de una estatua en la mitad del patio\n\tademás puedes ver una hilera de almenaras que bordean el patio como si de una fortaleza se tratase");
					System.out.println("El sonido del chapoteo te hace recordar rápidamente que algo te persigue y aunque muerto de miedo, consigues cerrar la puerta. (tu nivel de locura aumenta de forma crítica)");
					locura+=7;
					comprobadorLocura(locura);
					System.out.println("Te acercas a la estatua del ángel dónde encuentras una inscripción: \n\t\"He sobrevivido "+ numeroVecesJugadas +" veces\"");
					System.out.println("De repente un golpe seco te hace caer al suelo, desmayado...\n");
					opcionUsuario = 15; //continuar juego en bucle
				}
				else {
					System.out.println("\nApagas rápidamente tu cerilla preso del miedo y tratas de hacer el menor ruido posible, hasta que deja de oírse el chapoteo");
					System.out.println("Enciendes otra cerilla y encuentras delante de tí una aberración de la naturaleza de color verdoso que con voz dulce te dice:\n\t*...te dije que debías correr muy lejos de aquí...*");
					System.out.println("\n\tSu voz se torna más grave y los ojos de la criatura se inyectan en sangre: \n\t*...AHORA DEBES MORIR...*");
					locura+=20; //personaje muere si o sí
					comprobadorLocura(locura);
				}

				break;

			case 2:
				System.out.println("\nCoges las escaleras que bajan a un sótano, cada vez sientes más y más frío...\nEl ambiente está muy húmedo, notas bajo tus pies descalzos pequeños charcos un poco viscosos. Cuidadosamente enciendes tu cerilla y comienzas a mirar a tu alrededor.\nUna extraña bombilla parpadea con una luz muy tenue al final del enorme pasillo que compone el sótano.\nObservas que un reguero rojo y viscoso avanza por el suelo hasta una puerta al final de la sala ¿qué haces?\n\t1) Seguirlo\n\t2) Tratar de obtener más información de ese fluído");
				opcionUsuario = pedirNumeroInt(scan);
				if (opcionUsuario == 1) {
					System.out.println("Sigues el reguero sin hacer caso a tu instinto que te dice que deberías huir de allí.\nA medida que va aumentando el caudal el olor empieza a ser insoportable, sientes un fuerte olor como a carne podrida.\nSin que te des cuenta la aberración que encontraste en la cocina aparece rompiendo la puerta dispuesta a matarte a golpes, ¿qué haces?\n\t1) Te enfrentas a ella\n\t2) Te preparas para parar el golpe");
					opcionUsuario = pedirNumeroInt(scan);
					if (opcionUsuario == 1) {
						System.out.println("Tratas de darle un golpe cuando la tienes casi encima pero descubres que no es un ser corpóreo, comienzas a notar como tu cuerpo se deshace poco a poco y gritas de dolor mientras agonizas en el suelo...\n\n\n\tHAS MUERTO\n\n\n");
						break;
					}
					else {
						System.out.println("Para tu suerte recibes un impacto no demasiado fuerte que te deja en el suelo inconsciente...\nCon un primer momento de lucidez eres capaz de ver como algo te está arrastrando por un enorme pasillo de piedra, antes de caer inconsciente de nuevo crees pasar por delante de una habitación con un pequeño escritorio de roble\n");
						opcionUsuario = 15; //continuar juego en bucle
						numeroVecesJugadas++;
					}

				} 
				else {
					System.out.println("Tratas de averiguar qué es el extraño fluído que tienes bajo tus pies, acercas la cerilla pero a penas eres capaz de ver algo que no sea el color rojo, parece sangre pero no estás seguro de dónde puede proceder, comienzas a avanzar lentamente siguiendo el rastro y te cortas con un pequeño trozo de metal en la pierna. A medida que te acercas a las puerta, sientes como el suelo vibra bajo tus pies, como si algo muy pesado estuviera corriendo. Crees que estás volviéndote loco y lo ignoras.\nAbres la enorme puerta y al otro lado encuentras un espejo con una mancha de sangre que dice:\n\t*Nunca podremos salir de aquí*\n\nDebido a tus heridas caes al suelo desorientado.\n");
					opcionUsuario = 15; //continuar juego en bucle
					numeroVecesJugadas++;

				}

				break;
			default:
				System.out.println("Comienzas a sentir los gruñidos de antes detrás de tí y decides subir las escaleras esperando llegar a una salida.\nPreso del pánico subes corriendo y encuentras una puerta. Embistes la puerta y sales al exterior\nobservas la silueta de una estatua en la mitad del patio\\n\\tademás puedes ver una hilera de almenaras que bordean el patio como si de una fortaleza se tratase El sonido del chapoteo te hace recordar rápidamente que algo te persigue y aunque muerto de miedo, consigues cerrar la puerta. (tu nivel de locura aumenta de forma crítica)\n");
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
			System.out.println("\n\n...Comienzas a ver bichos subiendo por tu piel y tratas de arrancártela, lo que provoca tu muerte...\n\n\n\n\t\tHAS MUERTO");

		}
	}
}