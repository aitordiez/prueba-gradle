import java.util.ArrayList;

class EjercicioR207
{
    public String devolverEnOrden(ArrayList<String> palabras)
    {
        ArrayList<String>copiaListaPalabras = new ArrayList<String> (palabras);
        String devolver= "";
        int posicionPalabraMayor=0;
        if(palabras.size() > 0){
            while(!copiaListaPalabras.isEmpty()){
                String palabrasMayor= copiaListaPalabras.get(0);
                int posicion =0;
                for(int i=0; i< copiaListaPalabras.size(); i++){
                    if(copiaListaPalabras.get(i).length() >= palabrasMayor.length()) {
                        palabrasMayor = copiaListaPalabras.get(i);
                    }
                }   
                devolver = devolver + palabrasMayor + ",";
                copiaListaPalabras.remove(palabrasMayor);
            }
            devolver = devolver.substring(0,devolver.length()-1);
        }
        return devolver;
    }

}
