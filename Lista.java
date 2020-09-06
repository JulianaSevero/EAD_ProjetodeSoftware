package Lista2308Jole;

public class Lista {
private Nodo p;

	public Lista(String d){
		Nodo p = new Nodo(d);
		this.p = p;
	}
	public Lista(){
		this.p = null;	
	}
	public void adicionar(String d){
		if(p == null){
			p = new Nodo(d);
		}else{
			Nodo nNodo = new Nodo(d);
			Nodo aux = p;
			
			while (aux.getPr() != null){
				aux = aux.getPr();
			}
			aux.setPr(nNodo);	
		}
	}
	public void imprimir(){
		Nodo aux = p;
		while(aux.getPr() != null ){
			System.out.println(aux.getD());
			aux = aux.getPr();
		}
		System.out.println(aux.getD());	
	}
	public int posicaoD(String D){
		Nodo aux = p;
		int cont = 0;
		while(aux!= null){
			if(aux.getD().equals(D)){
				return cont;
			}else{
				cont ++;
				aux = aux.getPr();
			}
		}
		return -1;
	}
	public void remover(String D){
		Nodo aux = p;
		if(p.getD().equalsIgnoreCase(D)){
			p = p.getPr();
		}else{
			do{
			
			if(aux.getPr().getD().equalsIgnoreCase(D)){
				aux.setPr(aux.getPr().getPr());
				}else{
				aux = aux.getPr();
				}
		}while(aux.getPr() != null);
			}
		}
	}
