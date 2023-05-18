
package listas.poo;

import javax.swing.JOptionPane;


public class ListasPoo {

    public static void main(String[] args) {

        int option, d, d2;
        int resp, resp2;
        
        lista L1 = new lista();
        lista L2 = new lista ();
        lista L3 = new lista ();
        
        do{
            option= Integer.parseInt(JOptionPane.showInputDialog(null, "1. Insertar Inicio.\n"
                                                                    +  "2. Insertar final.\n"
                                                                    +  "3. Insertar Ordenado.\n"
                                                                    +  "4. Ordenar ascendente.\n"
                                                                    +  "5. Ordenar descendente.\n"
                                                                    +  "6. Buscar dato.\n"
                                                                    +  "7. Mostrar lista.\n"
                                                                    +  "8. Lista intercalada.\n"
                                                                    +  "9. Multiplicación.\n"
                                                                    +  "10. Salir", "Menú principal",2));
            
            switch (option) {
                    case 1:
                        d = Integer.parseInt(JOptionPane.showInputDialog("Insertar dato: "));
                        L1.InsertarInicio(d);
                    break;
                    case 2:
                        d = Integer.parseInt(JOptionPane.showInputDialog("Insertar dato: "));
                        L1.InsertarFinal(d);
                    break;
                    case 3:
                        d = Integer.parseInt(JOptionPane.showInputDialog("Insertar dato: "));
                        L1.InsertarOrdenado(d);
                        
                    break;
                    case 4:
                            if(L1.Punta!=null){
                                L1.OrdenarAscendente();
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Es necesario que la lista este llena para ordenarla");
                            }
                    break;
                    case 5:
                            if(L1.Punta!=null){
                                L1.OrdenarDescendente();
                            }
                            else{
                                 JOptionPane.showMessageDialog(null, "Es necesario que la lista contenga datos para ordenarla");
                            }
                    break;
                    case 6:
                            if(L1.Punta!=null){
                               d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato a buscar: "));
                               L1.BuscarDato(d);
                            }
                            else{
                                 JOptionPane.showMessageDialog(null, "Es necesario que la lista contenga datos para buscar el dato");
                            }
                    case 7:
                            if(L1.Punta!=null){
                               L1.MostrarLista();
                            }
                            else{
                                 JOptionPane.showMessageDialog(null, "Es necesario que la lista contenga datos para mostrarla");
                            }
                    break;
                    case 8:
                        if(L1.Punta == null){

                            resp = Integer.parseInt(JOptionPane.showInputDialog("¿Desea ingresar un dato? 1:si o 2:no"));
                            
                            while(resp==1){
                                d = Integer.parseInt(JOptionPane.showInputDialog("Insertar dato: "));
                                L1.InsertarFinal(d); 
                                resp = Integer.parseInt(JOptionPane.showInputDialog("¿Desea ingresar un dato? 1:si o 2:no"));
                            }
                        }
                        L1.MostrarLista();
                        
                       if(L2.Punta == null){

                            resp2 = Integer.parseInt(JOptionPane.showInputDialog("¿Desea ingresar un dato? 1:si o 2:no"));
                            
                            while(resp2==1){
                                d = Integer.parseInt(JOptionPane.showInputDialog("Insertar dato: "));
                                L2.InsertarFinal(d); 
                                resp2 = Integer.parseInt(JOptionPane.showInputDialog("¿Desea ingresar un dato? 1:si o 2:no"));
                            }
                        }
                        
                        L2.MostrarLista();
                        L3.Intercalado(L1, L2);

                    break;
                    case 9:
                        if(L1.Punta == null){

                            resp = Integer.parseInt(JOptionPane.showInputDialog("¿Desea ingresar un dato? 1:si o 2:no"));
                            
                            while(resp==1){
                                d = Integer.parseInt(JOptionPane.showInputDialog("Insertar dato: "));
                                L1.InsertarFinal(d); 
                                resp = Integer.parseInt(JOptionPane.showInputDialog("¿Desea ingresar un dato? 1:si o 2:no"));
                            }
                        }
                        L1.MostrarLista();
                        
                       if(L2.Punta == null){

                            resp2 = Integer.parseInt(JOptionPane.showInputDialog("¿Desea ingresar un dato? 1:si o 2:no"));
                            
                            while(resp2==1){
                                d = Integer.parseInt(JOptionPane.showInputDialog("Insertar dato: "));
                                L2.InsertarFinal(d); 
                                resp2 = Integer.parseInt(JOptionPane.showInputDialog("¿Desea ingresar un dato? 1:si o 2:no"));
                            }
                        }
                        
                        L2.MostrarLista();
                        L3.MultiplicacionDistributiva(L1, L2);

                    break;
                    case 10:
                        
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción incorrecta");
         
            }
        } while (option!=10);
    }
   
}
    
