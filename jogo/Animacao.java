package jogo;

public class Animacao {
	
	public void sleep(){
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public void carregamento(){
		
		
		System.out.println("\t\t----------------------------------------CARREGANDO----------------------------------------");
		
		
		System.out.println("\t\t\t.");
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}System.out.println("\t\t\t .");
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}System.out.println("\t\t\t  .");
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		clear();
	}
	
	public void clear(){
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
	public void dragao(){
		System.out.println("___________b___A\n"
				      + "	___________$b__Vb.\n"
				      +	"	___________$b__V$b.\n"
				      +	   "____________$$b__V$$b.\n"
						 + "____________$$b._V$$$$oooooooo._________..\n"
				         + "_____________$$P*_V$$$$$**$$$b.____.o$$P\n"
						 + "_______________.oooZ$$$$b..o$$$$$$$$$$$$C\n"
					     + "______________.$$$$$$$$$$$$$$$$$$$$$$$$$$$b.\n"
						 + "______________$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n"
						 + "________.o$$$o$$$$$$$$P--*$$$$$$$$$P*$$$P\n"
						 + "_______.$$$**$$$$Pq$C____$$$b________.$$P\n"
						 + "_______$$P___$$$b__$_._.$$$$$b.______*\n"
						 + "_______$$______$$$._____***$$$$$$$b._A.\n"
						 + "_______V$b___._Z$$b.__._______*$$$$$b$$:\n"
						 + "________V$$.__*$$$b.__b._________$$$$$\n"
						 + "_________$$b_____*$.__*b._________$$$b\n"
						 + "___________$$b._____L__$$o.________*_____.ooo ..\n"
						 + "_____________*$$o.________*$$o.__________.o$$$$$ $$$b.\n"
						 + "_________________*$$b._______$$b._______.$$$$$* ___*.\n"
						 + "____________________*$$o.______$$$o.____$$$$$'\n"
						 + "_______________________$$o_______$$$b.__$$$$___ ...oo..\n"
						 + "_________________________$b.______$$$$b._$$$$$$ $P*\n"
						 + "________________________._$$_______$$$$b__$$$$P \n"
						 + "_________________________L.$.______.$$$$$.__$$$$\n"
						 + "__________..______________$$$;______o$$$$$$__$$$$\n"
						 + "_______._$.l______________$$____.$$$$$$$P__$$$P\n"
						 + "_____.I_.$b_b_.___________P___.P**$$$$;__$$$\n"
						 + "___.$P__$$o_._.__._________.______$$$$___$$;\n"
						 + "__.$$;__$$$._A_$._.______________o$$$P__.$P\n"
						 + "_.$$$b__$$$$._*$._$$$$o.__________.$$$$P___$\n"
						 + ".$$$$$__$$$$$._$$o.**$$$$o.__.o$$$$P____P\n"
						 + "$$P$$b_$$$$$$o__*$$$$boooooc$$$$$$$P___.\n"
						 + "$$__$$$.$$$*$$.___$$$$$$$$$$$$$$$$C__.o\n"
						 + "I__$P$.$$b._*$.____**$$$$$**$$$$$$$\n");
	}		
}
