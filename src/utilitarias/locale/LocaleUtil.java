package utilitarias.locale;

import java.util.Locale;

public class LocaleUtil {
    public static void main(String[] args) {

        Locale locale = Locale.getDefault();
        System.out.println(locale);

        Locale[] locales = Locale.getAvailableLocales();

        for(Locale loc:locales){
            System.out.println("Nome:"+loc.getDisplayName());
            System.out.println("Cód. língua:"+loc.getLanguage());
            System.out.println("Lingua:"+loc.getDisplayLanguage());
            System.out.println("Cód País:"+loc.getCountry());
            System.out.println("País:"+loc.getDisplayCountry());

            System.out.println("##################");
        }

        //setar local padrão
        Locale br = new Locale("pt", "Brazil");
        Locale.setDefault(br);
    }
}
