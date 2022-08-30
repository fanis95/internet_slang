// icsd13126, biniakou theofanis, askisi 4

import java.util.HashMap;
import java.util.Map;



public class dictionary {
    
    protected Map<String, String> dict = new HashMap<>();
        
    public dictionary()
    // ston constructor tou leksikou, pernaw tous sundiasmous pou thelw na uparxoun sto leksiko
    {
        this.dict.put("dae", "does anyone else");
        this.dict.put("fyi", "for your information");
        this.dict.put("icymi", "in case you missed it");
        this.dict.put("amsp", "ask me something personal");
        this.dict.put("enat", "every  now and then");
        this.dict.put("fft", "food for thought");
        this.dict.put("q4u", "question for you");
    }
    
    public void normal_search(String s)
    {
       boolean word = false;
       String key=null;
       
        for(Map.Entry<String, String> entry: dict.entrySet()) 
            // tha psaksw se olo to map an uparxei h suntomografia
        {
            if (s.contains(entry.getKey()))
            // an sthn protash p edwse o xristis uparxei kapoia suntomografia apo to leksiko
            {
                key = entry.getKey(); // krataw to key tou map 
                word = true; // to kanw true gia na kserw oti vrethike h suntomografia
                break; // afou exei vrethei afto p theloume, den xreiazetai  na psaksw parakatw sto map
            }
        }
        
        if (word == true) // an dhladh sthn protash p edwse o xristis vrethike kapoia suntomografia
        {
            //edw tha kanw antikatastash ths suntomografias me thn antistoixh metafrash ths apo to map
            String result = s.replaceAll(key,dict.get(key)); 
            System.out.println("to metafrasmeno keimeno: ");
            System.out.println(result);
        }
        else
            System.out.println("den uphrkse antistoixhsh sto leksiko!");
        
           
       
    }
    
    public void reverse_search(String s)
    {
        boolean word = false;
        String key=null;
       
        for(Map.Entry<String, String> entry: dict.entrySet()) 
            // tha psaksw se olo to map an uparxei h ekfrash
        {
            if (s.contains(entry.getValue()))
            // an apo thn protash pou edwse o xristis uparxei kapoia ekfrash pou uparxei sto leksiko
            {
                key = entry.getKey(); // krataw to key tou map 
                word = true; // to kanw true gia na kserw oti vrethike h ekfrash
                break; // afou exei vrethei afto p theloume, den xreiazetai  na psaksw parakatw sto map
            }
        }
        
        if (word == true) // an dhladh sthn protash p edwse o xristis vrethike h ekfrash
        {
            //edw tha kanw antikatastash ths ekfrashs me thn antistoixh suntomografia apo to map
            String result = s.replaceAll(dict.get(key),key); 
            System.out.println("to metafrasmeno keimeno: ");
            System.out.println(result);
        }
        else
            System.out.println("den uphrkse antistoixhsh sto leksiko!");
    }
}
