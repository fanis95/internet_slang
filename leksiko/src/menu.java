// icsd13126, biniakou theofanis, askisi 4

import java.util.Scanner;



public class menu { // edw einai h roh tou provlhmatos
    
    public menu()
    {
        System.out.print("dwste thn protash : "); //zhtaw apo ton xristi thn protash
        
        Scanner in = new Scanner(System.in);
        String s;
        s = in.nextLine();
        
        // rwtaw ton xristi ti eidous metafrashs thelei
        System.out.println("thelete kanonikh h antistrofh metafrash?\nkanonikh : 0  antistrofh : 1");
        System.out.print("apanthsh: ");
       
        int a = in.nextInt();
        
        //dimiourgw ena neo leksiko
        dictionary d = new dictionary();
        
        switch (a) {
        // a=0 antistoixei sthn kanonikh metafrash
            case 0:
                d.normal_search(s.toLowerCase()); // metatrepw ola ta grammata se mikra 
                                                    //gia na ginei o elegxos
                break;
            case 1:
                d.reverse_search(s.toLowerCase());
                break;
            default:
                System.out.println("dwsate lathos epilogh");
                break;
        }
        
    }
}
