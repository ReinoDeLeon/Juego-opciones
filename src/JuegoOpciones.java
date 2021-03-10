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
		System.out.println("Comienzas a notar unos crujidos bajo tus rodillas, intentas levantarte rápidamente\nYa es tarde, para cuando consigues levantarte escuchas un fuerte chasquido que indica\n\tque la trampilla se ha roto bajo tus pies y te precipitas al vacío");
		System.out.println("\nTras un golpe sordo te levantas aturdido, sientes un sabor metálico en la boca pero parece que no te has hecho daño. Acercas tu mano al bolsillo y encuentras una pequeña caja de cerillas.");
		System.out.println("\nSe escucha un lejano gruñido en la oscura habitación, ¿qué haces?:\n\t1) Enciendes una cerilla para tratar de buscar el origen de ese ruido\n\t2) Te mantienes lo más silencioso posible a la espera de que el ruido se aleje\n");
		opcionUsuario = pedirNumeroInt(scan);
		if (opcionUsuario == 1) {
			System.out.println("\nPresa del miedo enciendes rápidamente una cerilla para iluminar la habitación.");
			System.out.println("Una siniestra voz te susurra al oído: *no deberías haber bajado aquí...*");
			System.out.println("Notas como el aire se hace cada vez más denso y comienzas a sufir alucinaciones,\n\tcuanto más tiempo pasa, más te cuesta respirar.\nTu mente empieza a nublarse mientras caes desplomado al suelo\nLa siniestra voz te habla por última vez: *...ahora formarás parte del a historia de este lugar...*");
			System.out.println("Tu respiración se va apagando lentamente... \n\n\t\tHAS MUERTO");
		}
		else {
			System.out.println("\nPresa del miedo decides agacharte y hacer el menor ruido posible.");
			System.out.println("El gruñido se aleja junto con el sonido como de chapotear en un charco.\n\tAgazapado en esa habitación te viene de forma fugaz la imagen de un escritorio de roble con un oxidado candil encima");
			System.out.println("\nEl ambiente se queda totalmente en silencio, los chapoteos se han disipado en la lejanía, decides\n\tencender una cerilla ahora que sabes que estás a salvo");
			System.out.println("Encuentras a tu alrededor una enorme cocina en la que parece que hace tiempo que no se utiliza, tienes hambre y puedes vislumbrar en la penumbra una olla\n\t1) Te acercas a inspeccionar la olla\n\t2) Buscas en la cocina a ver si encuentras comida fresca");
			opcionUsuario = pedirNumeroInt(scan);
			if (opcionUsuario == 1) {
				System.out.println("Abres la tapa de la olla y encuentras un caldo en el que flota una cosa blanca, metes un cucharon para comprobar que es y sacas un pequeño cráneo");
				System.out.println("Retrocedes de la olla gritando y muerto de miedo lanzas con fuerza la pequeña calavera. (tus niveles de locura aumentan significativamente)");
				locura+=2;
				comprobadorLocura(locura);
			}
			System.out.println("Te pones a mirar con la cerilla aún encendida por la habitación y encuentras una pequeña caja con un 7 y un cuchillo dibujado, ¿quieres abrirla (si/no)?");
			decisionSiNo = scan.nextLine();
			if (decisionSiNo.equalsIgnoreCase("si")){
				System.out.println("\nAl abrir la caja encuentras una misteriosa tableta de chocolate en perfecto estado, decides comértela pero te sientes extrañado por el estado del chocolate (tu nivel de locura se disminuye)");
				locura-=1;
			}
			System.out.println("Continuas registrando la habitación y encuentras una puerta de madera que está abierta, avanzas lentamente y te encuentras con una enorme galería iluminada que tiene en el medio una larga mesa para muchos comensales");
			System.out.println("Todo parece muy lujoso salvo por el hecho de que los cubiertos son de madera y están roidos");
			System.out.println("La habitación luce abandonada desde hace años, así lo muestran la enormes telarañas que se extienden por las columnas. \n\tDe un golpe se abre una pequeña ventana del techo y escuchas una voz\n\tun tanto siniestra que te dice: *...debes correr muy lejos de aquí...* (tus niveles de locura aumentan significativamente)");
			locura+=2;
			comprobadorLocura(locura);
			
		}
	}
	static void comprobadorLocura(int locura) {
		if (locura < 7) {
			System.out.println("\n\n...Sientes unas voces en tu cabeza que te hablan en un idioma que desconoces...\n\n");
		}
		
	}

}