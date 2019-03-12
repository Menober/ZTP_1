public class Wyświetlacz {
    public static void main(String [] args){
        Kontener<Zwierze> zwierzeta=new Kontener();
        Kontener<Ssak> ssaki=new Kontener();
        Kontener<Pies> psy=new Kontener();

        zwierzeta.list.add(new Zwierze());
        ssaki.list.add(new Ssak());
        psy.list.add(new Pies());
        ssaki.list.add(new Pies());

        pokazDaneZwierze(zwierzeta);
        pokazDaneSsak(ssaki);
        pokazDanePies(psy);

    }


    private static void pokazDaneZwierze(Kontener<? extends Zwierze> z){
        System.out.println("pokazDaneZwierze");
        for(Zwierze x:z.list)
            System.out.println("Czy żyje: "+x.czyZyje);
        System.out.println();
    }
    private static void pokazDaneSsak(Kontener<? extends Ssak> z){
        System.out.println("pokazDaneSsak");
        for(Ssak x:z.list)
            System.out.println("Czy żyje: "+x.czyZyje+", Czy ma pępek: "+x.maPepek);
        System.out.println();
    }
    private static void pokazDanePies(Kontener<? extends Pies> z){
        System.out.println("pokazDanePies");
        for(Pies x:z.list)
            System.out.println("Czy żyje: "+x.czyZyje+", Czy ma pępek: "+x.maPepek+", Długość ogona: "+x.dl_ogona);
        System.out.println();
    }
}
