import java.util.ArrayList;
import java.util.List;

public class Banco {

    public static void main(String args[]){

        ContaCorrente c1 = new ContaCorrente();
            c1.numero = 1234;
            Cliente cliente1 = new Cliente();
            cliente1.setNome("Maria");
            //c1.cliente = "Maria";
            c1.setSaldo(40.0);
            c1.deposita(100.00);
            c1.setCliente(cliente1);

        ContaCorrente c2 = new ContaCorrente();
            c2.numero = 4321;
            Cliente cliente2 = new Cliente();
            cliente2.setNome("João");
            c2.setSaldo(35.0);
            c2.deposita(200.00);
            c2.setCliente(cliente2);

        List contas = new ArrayList();

        contas.add(c1);
        contas.add(c2);

        //System.out.println( c1.getSaldo());

        for(int i = 0; i<contas.size(); i++){
            contas.get(i);
            ContaCorrente cc = (ContaCorrente) contas.get(i);
            //System.out.println(cc.getSaldo());
            System.out.println( "\n Cliente: " + cc.getCliente().getNome() + "\n N conta: " + cc.getNumero()+ "\n Saldo: " +  cc.getSaldo());

            //System.out.println( "Cliente: " + cliente1.getNome() +" \n numero conta:  " + c1.numero+ "\n Saldo: " +  c1.getSaldo());
        }

    }
}
