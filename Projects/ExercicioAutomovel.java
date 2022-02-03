package auto;

public class ExercicioAutomovel {
	
		public static void main(String args[]){
			
			automovel a = new automovel();
			int teste = a.qtd();
			automovel vetA[] = new automovel[teste];
			int op;
			do{
				op=a.menu();
				switch(op){
				case 1:
					for(int i=0; i<vetA.length;i++){
					vetA = new automovel[teste];
					System.out.println("Passou no for leitura" + "i" + i + "vetor lenght" + vetA.length);
					a.leitura();
				}
				break;
				case 2:for(int i=0; i<vetA.length;i++)
					System.out.println(a.toString());
				break;
				case 3:for(int i=0; i<vetA.length;i++)
					a.maisdetres10();
				break;
				case 4:for(int i=0; i<vetA.length;i++)
					a.maisdetres();
				break;
				case 5:for(int i=0; i<vetA.length;i++)
					a.garbagecolector();
				break;
				case 6:System.exit(0);
				break;
				}
			}while(op > 1 || op < 6);
			

		}}
