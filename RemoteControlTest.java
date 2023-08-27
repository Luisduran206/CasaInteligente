import java.util.Scanner;
import java.util.Stack;

public class RemoteControlTest{

	public static void main(String[] args) {
		
		Command[] comandos = new Command[20];
		
		int seleccion = 0; 
		int last = 0;
	    Scanner scanner = new Scanner(System.in); 
	    Stack<Integer> stack = new Stack<Integer>();
	    
	    ////Remote
	    SimpleRemoteControl remote = new SimpleRemoteControl();
	    
	    ////Comandos de luz
		Light light = new Light();	
		LightOnCommand lightOn = new LightOnCommand(light); comandos [0] = lightOn;
		LightOffCommand lightOff = new LightOffCommand(light); comandos [1] = lightOff;
		
		////Comandos de garaje
		Garage garage = new Garage();
		GarageOpenCommand garageOpen = new GarageOpenCommand(garage); comandos [2] = garageOpen;
		GarageCloseCommand garageClose = new GarageCloseCommand(garage); comandos [3] = garageClose;
		
		////Comandos de tv
		TV tv = new TV();
		TVOnCommand tvOn = new TVOnCommand(tv); comandos [4] = tvOn;
		TVOffCommand tvOff = new TVOffCommand(tv); comandos [5] = tvOff;
		
		////Comandos de e-Girlfriend
		eGirlfriend eGirlfriend = new eGirlfriend();
		eGirlfriendOnCommand eGirlfriendOn = new eGirlfriendOnCommand(eGirlfriend); comandos [6] = eGirlfriendOn;
		eGirlfriendOffCommand eGirlfriendOff = new eGirlfriendOffCommand(eGirlfriend); comandos [7] = eGirlfriendOff;
		
		////Comandos CeillingFan
		CeillingFan ceillingFan = new CeillingFan();
		CeillingFanOnCommand ceillingFanOn = new CeillingFanOnCommand(ceillingFan); comandos [8] = ceillingFanOn;
		CeillingFanOffCommand ceillingFanOff = new CeillingFanOffCommand(ceillingFan); comandos [9] = ceillingFanOff;
		
		////Comandos Hottub
		Hottub hottub = new Hottub();
		HottubOnCommand hottubOn = new HottubOnCommand(hottub); comandos [10] = hottubOn;
		HottubOffCommand hottubOff = new HottubOffCommand(hottub); comandos [11] = hottubOff;
		
		////Comandos Stereo
		Stereo stereo = new Stereo();
		StereoOnCommand stereOn = new StereoOnCommand(stereo); comandos [12] = stereOn;
		StereoOffCommand stereOff = new StereoOffCommand(stereo); comandos [13] = stereOn;
		
		////Operaciones con los controles
		System.out.print("\t\tBIENVENIDO A SU CONTROL INTELIGENTE...");
		do {
			System.out.print("\n\t¿Qué desea hacer?\n");
			System.out.print("1. Prender la luz \n2. Apagar la luz \n3. Abrir el garaje \n4. Cerrar el garaje \n5. Prender la TV \n6. Apagar la TV \n7. Invocar e-Girlfriend \n8. Desactivar e-Girlfriend \n");
			System.out.print("9. Encender el ventilador de techo \n10. Apagar el ventilador de techo \n11. Encender el Hottub \n12. Apagar el Hottub \n13. Encender el Stereo \n14. Apagar el stereo \n15. Undo() \n16. Salir\n");
			seleccion = scanner.nextInt();
			
			////Opciones de comando
			switch(seleccion) {
			
			case 1:
				remote.setCommand(lightOn);
				remote.buttonWasPressed();
				stack.push(1);
				last = 1;
				break;
			case 2:
				remote.setCommand(lightOff);
				remote.buttonWasPressed();
				stack.push(2);
				last = 2;
				break;
			case 3: 
				remote.setCommand(garageOpen);
				remote.buttonWasPressed();
				stack.push(3);
				last = 3;
				break;
			case 4:
				remote.setCommand(garageClose);
				remote.buttonWasPressed();
				stack.push(4);
				last = 4;
				break;
			case 5: 
				remote.setCommand(tvOn);
				remote.buttonWasPressed();
				stack.push(5);
				last = 5;
				break;
			case 6:
				remote.setCommand(tvOff);
				remote.buttonWasPressed();
				stack.push(6);
				last = 6;
				break;
			case 7: 
				remote.setCommand(eGirlfriendOn);
				remote.buttonWasPressed();
				stack.push(7);
				last = 7;
				break;
			case 8: 
				remote.setCommand(eGirlfriendOff);
				remote.buttonWasPressed();
				stack.push(8);
				last = 8;
				break;
			case 9: 
				remote.setCommand(ceillingFanOn);
				remote.buttonWasPressed();
				stack.push(9);
				last = 9;
				break;
			case 10:
				remote.setCommand(ceillingFanOff);
				remote.buttonWasPressed();
				stack.push(10);
				last = 10;
				break;
			case 11: 
				remote.setCommand(hottubOn);
				remote.buttonWasPressed();
				stack.push(11);
				last = 11;
				break;
			case 12:
				remote.setCommand(hottubOff);
				remote.buttonWasPressed();
				stack.push(12);
				last = 12;
				break;
			case 13:
				remote.setCommand(stereOn);
				remote.buttonWasPressed();
				stack.push(13);
				last = 13;
				break;
			case 14:
				remote.setCommand(stereOff);
				remote.buttonWasPressed();
				stack.push(14);
				last = 14;
				break;
			case 15:
				if(stack.isEmpty()) {
					System.out.println("No hay dispositivos encendidos, intente prender algo...");
				} else {
					if(last % 2 != 0) {
						int cabeza = stack.pop();
						remote.setCommand(comandos[cabeza++]);
						remote.buttonWasPressed();
					} else {
							int cabeza = stack.pop();
							remote.setCommand(comandos[cabeza-2]);
							remote.buttonWasPressed();
					}
				}
				break;
			case 16: 
				System.out.println("Escogió salir, hasta pronto...");
				break;
			}
			System.out.print(stack);
		} while(seleccion != 16 && seleccion < 17);
	}
}
