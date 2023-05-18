
package listas.poo;

import javax.swing.JOptionPane;

public class lista {
    
    //Atributo
    Nodo2 Punta;
    Nodo2 Final;
    
    //Métodos

    public lista() { //si estamos creando la punta por primera vez no se le manda ninguna direccion y se pone en null
        Punta = null;
        Final = null;
    }
    
    public void InsertarFinal (int d ){
        
        Nodo2 p = null , x = new Nodo2(d);
        
        if (Punta == null){
            Punta = x;
            Final = x;
        } else {
            p = Punta;
            
            while (p.getLigaD() != null){
                p = p.getLigaD();
            }
            p.setLigaD(x);
            x.setLigaI(p);
            Final = x;
        }
    }
    
    public void MostrarLista(){
        
        Nodo2 p = Punta;
        String s = ""; // s sirve para que muestre la lista concatenada en 1 ventana 
        
        while (p != null) {            
            
            //sout
            System.out.print("["+ p.getDato()+ "]-->"); //se le quita el ln para que no haga salto de linea 
            s = s + "["+ p.getDato()+ "]-->";
            p = p.getLigaD();
        }
        JOptionPane.showMessageDialog(null, s);
    }

    void InsertarInicio(int d) {
        
            Nodo2 x = new Nodo2 (d);
            
            if(Punta == null){
                
                Punta = x;
            }
            
            else{
                x.setLigaD(Punta);
                Punta.setLigaI(x);
                Punta = x;
            }
    }
    
    void InsertarOrdenado(int d){
        
        Nodo2 x=new Nodo2(d), A=null, p=Punta;
        
        if (Punta == null){
            
            Punta = x;
        }
        else{
            while(p!=null && x.getDato()>p.getDato()){
                
                A=p;
                p=p.getLigaD();
            }
            
            if (p==Punta){
                
                x.setLigaD(Punta);
                p.setLigaI(x.getLigaD());
                Punta=x;
            }
            else{
                A.setLigaD(x);
                x.setLigaD(p);
                x.setLigaI(A.getLigaD());
            }
        }
    }
    
    void BuscarDato (int d){
        
        Nodo2 p=Punta, A;
        int opc, NuevoDato;
        

        while(p!=null){
            //p=p.getLigaD();
        
            if(d==p.getDato()){

                do{
                    opc = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                             1. Mostrar posicion.
                                                                             2. Eliminar.
                                                                             3. Reemplazar.
                                                                             4. Salir.
                                                                             """));

                    switch (opc) {
                        case 1:
                                //JOptionPane.showMessageDialog(null, cont);
                            MostrarPosicion(d);
                            break;
                        case 2:
                            Eliminar(d);
                            MostrarLista();
                            break;
                        case 3:
                            NuevoDato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuevo dato: "));
                            ReemplazarDato(d, NuevoDato);
                            MostrarLista();
                            break;
                        case 4:
                            
                       break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción incorrecta");
                    }
                }while (opc!=4);
                break;
            }
        p=p.getLigaD();
        }
    }
    
    void OrdenarAscendente(){
        
        Nodo2 p=Punta, q;
        int aux;
        
        while (p.getLigaD()!=null){
            q=p.getLigaD();
            
            while(q!=null){
                if(p.getDato()>q.getDato()){
                    aux=q.getDato();
                    q.setDato(p.getDato());
                    p.setDato(aux);
                }
                q=q.getLigaD();
            }
            p=p.getLigaD();
        }
        MostrarLista();
    }
    
    void OrdenarDescendente(){
        
        Nodo2 p=Punta, q;
        int aux=0;
        
        while (p.getLigaD()!=null){
            q=p.getLigaD();
            
            while(q!=null){
                if(p.getDato()<q.getDato()){
                    aux=q.getDato();
                    q.setDato(p.getDato());
                    p.setDato(aux);
                }
                q=q.getLigaD();
            }
            p=p.getLigaD();
        }
        MostrarLista();
    }
    
    void Intercalado (lista L1, lista L2 ){
        
        Nodo2 p = L1.Punta , q = L2.Punta;
            
            while(p!=null || q!=null){
                InsertarFinal(p.getDato());
                InsertarFinal(q.getDato());
                p = p.getLigaD();
                q = q.getLigaD();
            }
            
            MostrarLista();
    }
    
    void MultiplicacionDistributiva (lista L1, lista L2){
        
        Nodo2 p = L1.Punta , q = L2.Punta;
        int sum=0;
        
        while (q!=null){
            while(p!=null){
               sum=sum+(q.getDato()*p.getDato());
               p=p.getLigaD();
            }
        InsertarFinal(sum);
        q=q.getLigaD();
        p=L1.Punta;
        sum=0;
        }
        MostrarLista();
    }
    
    void MostrarPosicion(int d){
        
        Nodo2 p=Punta;
        int cont=0;
        
        if(Punta==null){
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
        else{
            while(p!=null){
                cont++;
                if(p.getDato()!=d){
                    p=p.getLigaD();
                }
                else{
                    JOptionPane.showMessageDialog(null, cont);
                    p=p.getLigaD();
                }
            }
        }
    }
    void Eliminar(int d){
        
        Nodo2 p=Punta, A;
        
        while(p!=null){
            
                if(d!=p.getDato()){
                    p=p.getLigaD();
                }
                else{
                    if(p==Punta){
                        Punta=p.getLigaD();
                        p.setLigaD(null);
                        p=Punta;
                        if(p!=null){
                            p.setLigaI(null);
                        }
                    }  
                    else{   
                        A = p.getLigaI();
                        A.setLigaD(p.getLigaD());
                        A=p.getLigaD();
                            if(A!=null){
                                A.setLigaI(p.getLigaI());
                            }
                        p.setLigaD(null);
                        p.setLigaI(null);
                        p = A;  
                    }
                }
        }
    }
    
    void ReemplazarDato(int d, int NuevoDato){
        
        Nodo2 p=Punta;
        
        if(Punta==null){
            JOptionPane.showMessageDialog(null, "lista vacia");
        }
        else{
            while(p!=null){
                if(p.getDato()!=d){
                    p=p.getLigaD();
                }
                else{
                    p.setDato(NuevoDato);
                    p=p.getLigaD();
                }
            }
        }
    }
}    
