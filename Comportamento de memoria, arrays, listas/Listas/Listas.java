import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {

        //Size = Tamanho da Lista
        //Add(obj), add(int,obj) = Insere elementos na Lista
        // remove(obj), remove(int), removeIf(Predicate) = Remove elementos da Lista
        // indexOf(ob), lastIndexOf(obj) = Encontra posicao do elemento

        //Array list e mais utilizado
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(5);
        list.add(5);
        list.add(5);
        //Forma para adicionar elemento sem prejudicar o resto da lista
        list.add(2, 5);

        //Tamanho da Lista
        System.out.println(list.size());
        //For each
        for(Integer i : list){
            System.out.println(i);
        }
        System.out.println("---------------------------------");

        list.remove(3);

        //remover aqueles elemento que atendam a um predicado
        list.removeIf(x -> x == 3);

        //For each
        for(Integer i : list){
            System.out.println(i);
        }

        System.out.println("---------------------------------");

        System.out.println("Index: " + list.indexOf(1));

        //Quando nao encontra o elemento retorna -1
        System.out.println("Index: " + list.indexOf(0));


        System.out.println("---------------------------------");

        //Filtrando a Lista
        List<Integer> result = list.stream().
                filter(x -> x == 5).
                collect(Collectors.toList());

        for(Integer i : result){
            System.out.println(i);
        }
        
        System.out.println("---------------------------------");
        String numero = String.valueOf(list.stream().filter(x -> x ==1).findFirst().orElse(null));
        System.out.println(numero);
    }
}
