public class Sekil implements SekliCiz{

    private int kenarSayısı;
    private int baslangıcKonumu;
    private int kenarUzunlugu;
    private int kenarKalınlıgı;
    private String kenarRengi;
    private String icRenk;




    public Sekil(int kenarSayısı, int baslangıcKonumu, int kenarUzunlugu, int kenarKalınlıgı, String kenarRengi,
                 String icRenk) {
        super();
        this.kenarSayısı = kenarSayısı;
        this.baslangıcKonumu = baslangıcKonumu;
        this.kenarUzunlugu = kenarUzunlugu;
        this.kenarKalınlıgı = kenarKalınlıgı;
        this.kenarRengi = kenarRengi;
        this.icRenk = icRenk;
    }




    public int getKenarSayısı() {
        return kenarSayısı;
    }




    public void setKenarSayısı(int kenarSayısı) {
        this.kenarSayısı = kenarSayısı;
    }




    public int getBaslangıcKonumu() {
        return baslangıcKonumu;
    }




    public void setBaslangıcKonumu(int baslangıcKonumu) {
        this.baslangıcKonumu = baslangıcKonumu;
    }




    public int getKenarUzunlugu() {
        return kenarUzunlugu;
    }




    public void setKenarUzunlugu(int kenarUzunlugu) {
        this.kenarUzunlugu = kenarUzunlugu;
    }




    public int getKenarKalınlıgı() {
        return kenarKalınlıgı;
    }




    public void setKenarKalınlıgı(int kenarKalınlıgı) {
        this.kenarKalınlıgı = kenarKalınlıgı;
    }




    public String getKenarRengi() {
        return kenarRengi;
    }




    public void setKenarRengi(String kenarRengi) {
        this.kenarRengi = kenarRengi;
    }




    public String getIcRenk() {
        return icRenk;
    }




    public void setIcRenk(String icRenk) {
        this.icRenk = icRenk;
    }




    @Override
    public void ciz() {
        System.out.println("Şeklin kenar sayısı:"+kenarSayısı+",Baslangıç konumu:"+baslangıcKonumu+",Kenar uzunlugu:"+kenarUzunlugu+",Kenar kalınlığı:"+kenarKalınlıgı+",Kenar rengi:"+kenarRengi+",İç renk:"+icRenk+"dir...");


    }
}


