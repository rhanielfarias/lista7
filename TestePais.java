import java.util.ArrayList;
import java.util.List;
public class TestePais {
    public static void main(String[] args) {

    Pais brasil = new Pais("BRA", "Brasil", 213300, 8500);
    Pais uruguai = new Pais("URY", "Uruguai", 3.474, 176.215);
    Pais venezuela = new Pais("VEN", "Venezuela", 28.44, 916.445);
    Pais estadosunidos = new Pais("USA", "Estados Unidos", 329.5, 9.834000);
    Pais paraguai = new Pais("PRY", "Paraguai", 7.133, 15.6);

    brasil.adicionarFronteira(uruguai);
    brasil.adicionarFronteira(paraguai);


    uruguai.adicionarFronteira(brasil);

    venezuela.adicionarFronteira(brasil);

    paraguai.adicionarFronteira(brasil);

    if(brasil.paisFronteira("Uruguai")) {
System.out.println("Brasil faz fronteira com Uruguai");
    }

    if(brasil.paisFronteira("Estados Unidos")) {
System.out.println("Brasil faz fronteira com Estados Unidos");
    } else {
System.out.println("Brasil não faz fronteira com os Estados Unidos");
    }
System.out.println("A dimensão demográfica do Brasil é: ");
    double brDimensao = brasil.getDimensao();
System.out.print(brDimensao);
System.out.println("Venezuela e Uruguai tem como país comum de fronteira");
    List <Pais> fronteirasEmComum = venezuela.fronteirasEmComum(uruguai);
        for(int i = 0; i < fronteirasEmComum.size(); i++) {
System.out.println(fronteirasEmComum.get(i).getNome());

        }
    }
}
