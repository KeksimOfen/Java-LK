/**
 * @author (Luca & Johannes) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class StringAufgaben
{


    public String stringUmkehren(String pEingabe)
    {
        String ausgabe = "";
        if(pEingabe.length()<=1)
        {
            return pEingabe;
        }    
        else
        {
            char erster = pEingabe.charAt(0);
            String subs = pEingabe.substring(1);
            ausgabe = stringUmkehren(subs);
            return ausgabe + erster;
        }
    }


    public String stringGlaetten(String pEingabe)
    {
        String ausgabe = "";
        for(int i=0; i<pEingabe.length(); i++)
        {
            if(Character.isLetter(pEingabe.charAt(i)))
            {
                ausgabe += pEingabe.charAt(i);
            }
        }
        return ausgabe;
    }

    public boolean istPalindrom(String pEingabe)
    {
        String ausgabe = stringGlaetten(pEingabe);
        ausgabe = verwandelInGrossbuchstaben(ausgabe);
        return stringUmkehren(ausgabe).equals(ausgabe);
    }

    public String verwandelInGrossbuchstaben(String pEingabe)
    {
        String ausgabe = "";
        for(int i=0; i < pEingabe.length(); i++)
        {
            if((int) pEingabe.charAt(i) < 97 || (int) pEingabe.charAt(i) > 122)
            {
                ausgabe += pEingabe.charAt(i);
            }
            else
            {
                ausgabe += (char) ((int) pEingabe.charAt(i) - 32);
            }
        }
        return ausgabe;
    }

    public String[] stringTeilung(String pEingabe)
    {
        String[] ausgabe;
        int anfang = 0;
        int stelle = 0;
        int anzahl = 0;
        
        for(int j=0; j < pEingabe.length(); j++)
        {
            if(!Character.isLetter(pEingabe.charAt(j)))
            {
                anzahl++;
            }
        }
        ausgabe = new String[anzahl+1];
        
        for(int i=0; i < pEingabe.length(); i++)
        {            
            if(!Character.isLetter(pEingabe.charAt(i)))
            {
                ausgabe[stelle] = pEingabe.substring(anfang, i);
                anfang = i;
                stelle++;
            }
        }
        ausgabe[stelle] = pEingabe.substring(anfang);
        return ausgabe;
    }
}
