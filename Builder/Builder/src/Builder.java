public class Builder implements SekilBuilder{
    private int kenarSayısı;
    private int baslangıcKonumu;
    private int kenarUzunlugu;
    private int kenarKalınlıgı;
    private String kenarRengi;
    private String icRenk;



    @Override
    public void kenarSayısıBelirle(int kenarSayisi) {
        this.kenarSayısı=kenarSayisi;

    }

    @Override
    public void baslangicKonumuBelirle(int baslangıcKonumu) {
        this.baslangıcKonumu=baslangıcKonumu;

    }

    @Override
    public void kenarUzunluguBelirle(int kenarUzunlugu) {
        this.kenarUzunlugu=kenarUzunlugu;

    }

    @Override
    public void kenarKalınlıgıBelirle(int kenarKalınlıgı) {
        this.kenarKalınlıgı=kenarKalınlıgı;

    }

    @Override
    public void kenarRengiBelirle(String kenarRengi) {
        this.kenarRengi=kenarRengi;


    }

    @Override
    public void icRenkBelirle(String icRenk) {
        this.icRenk=icRenk;

    }

    @Override
    public SekliCiz ciz() {

        return new Sekil(kenarSayısı,baslangıcKonumu,kenarUzunlugu,kenarKalınlıgı,kenarRengi,icRenk);
    }

}

