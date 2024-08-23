public class Main {
    public static void main(String[] args) {

        SekilBuilder builder = new Builder();

        builder.kenarSayısıBelirle(4);
        builder.baslangicKonumuBelirle(0);
        builder.kenarUzunluguBelirle(50);
        builder.kenarKalınlıgıBelirle(5);
        builder.kenarRengiBelirle("Beyaz");
        builder.icRenkBelirle("Mavi");

        SekliCiz Sekil= builder.ciz();

        Sekil.ciz();

    }
}