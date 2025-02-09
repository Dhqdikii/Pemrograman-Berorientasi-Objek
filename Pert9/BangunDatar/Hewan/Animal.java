package Pert9.BangunDatar.Hewan;

public class Animal {
    protected String suara;

    public Animal() {
        this.suara = "suara";
    }

    public void cetak(){
        System.out.println("Suara hewan ini adalah " + suara);
    }
}

class Mamalia extends Animal {
    protected String berkembangbiak;

    public Mamalia() {
        this.berkembangbiak = "beranak";
    }

    public void cetak(){
        System.out.println("Mamalia berkembang biak dengan cara " + berkembangbiak);
    }
}

class Sapi extends Mamalia {
    private String nama;
    private String umur;

    public Sapi(){
        suara="Moo";
        berkembangbiak="beranak";
        this.nama = "radit";
        this.umur = "10 tahun";
    }

        public void cetak(){
            System.out.println("\n===== Data Hewan Mamalia Sapi =====");
            System.out.println("Suara : " + suara);
            System.out.println("Berkembang biak : " + berkembangbiak);
            System.out.println("Nama : " + nama);
            System.out.println("Umur : " + umur);
        }
}

class Kambing extends Mamalia{
    private String nama;
    private String umur;

    public Kambing(){
        suara="Mbee";
        berkembangbiak="beranak";
        this.nama = "radit 2";
        this.umur = "5 tahun";
    }

        public void cetak(){
            System.out.println("\n===== Data Hewan Mamalia Kambing =====");
            System.out.println("Suara : " + suara);
            System.out.println("Berkembang biak : " + berkembangbiak);
            System.out.println("Nama : " + nama);
            System.out.println("Umur : " + umur);
        }
}

class Unggas extends Animal{
    protected String berkembangbiak;

    public Unggas() {
        this.berkembangbiak = "bertelur";
    }

    public void cetak(){
        System.out.println("Unggas berkembang biak dengan cara " + berkembangbiak);
    }
}

class Burung extends Unggas{
    private String jenis;
    private String ciri;

    public Burung(){
        suara="Mbeekur...";
        berkembangbiak="bertelur";
        this.jenis = "Merpati";
        this.ciri = "Bulu Putih";
    }

    public void cetak(){
        System.out.println("\n===== Data Hewan Unggas Burung =====");
        System.out.println("Suara : " + suara);
        System.out.println("Berkembang biak : " + berkembangbiak);
        System.out.println("Jenis : " + jenis);
        System.out.println("Ciri : " + ciri);
    }
}

class Ayam extends Unggas{
    private String jenis;
    private String ciri;

    public Ayam(){
        suara="Kukuruyuk...";
        berkembangbiak="bertelur";
        this.jenis = "Ayam Kampung";
        this.ciri = "Bulu Hitam";
    }

    public void cetak(){
        System.out.println("\n===== Data Hewan Unggas Ayam =====");
        System.out.println("Suara : " + suara);
        System.out.println("Berkembang biak : " + berkembangbiak);
        System.out.println("Jenis : " + jenis);
        System.out.println("Ciri : " + ciri);
    }
}

class Ikan extends Animal {
    protected String napas;

    public Ikan() {
        this.napas = "insang";
    }

    public void cetak(){
        System.out.println("Ikan bernapas dengan " + napas);
    }
}

class Gurame extends Ikan{
    private String ciri;
    private String berat;

    public Gurame(){
        suara="Blublub...";
        napas="insang";
        this.ciri = "Bewarna Hitam";
        this.berat = "5 kg";
    }

    public void cetak(){
        System.out.println("\n===== Data Hewan Ikan Gurame =====");
        System.out.println("Suara : " + suara);
        System.out.println("Napas : " + napas);
        System.out.println("Ciri : " + ciri);
        System.out.println("Berat : " + berat);
    }
}

class Lele extends Ikan{
    private String ciri;
    private String berat;

    public Lele(){
        suara="Blublub...";
        napas="insang";
        this.ciri = "Bewarna Hitam Keputihan";
        this.berat = "2 kg";
    }

    public void cetak(){
        System.out.println("\n===== Data Hewan Ikan Lele =====");
        System.out.println("Suara : " + suara);
        System.out.println("Napas : " + napas);
        System.out.println("Ciri : " + ciri);
        System.out.println("Berat : " + berat);
    }
}

class Main {
    public static void main(String[] args) {
        if (!isValidEnvironment()) {
            System.err.println("Error: Program tidak dapat dijalankan di lingkungan ini.");
            return;
        }

        System.out.println("Environment valid, melanjutkan program...");

        Sapi sapi = new Sapi();
        sapi.cetak();

        Kambing kambing = new Kambing();
        kambing.cetak();

        Burung burung = new Burung();
        burung.cetak();

        Ayam ayam = new Ayam();
        ayam.cetak();

        Gurame gurame = new Gurame();
        gurame.cetak();

        Lele lele = new Lele();
        lele.cetak();
    }

    private static boolean isValidEnvironment() {
        String secretKey = System.getenv("MY_SECRET_KEY");
        if (secretKey == null) {
            System.err.println("Error: MY_SECRET_KEY tidak ditemukan dalam variabel lingkungan.");
            return false;
        }
        return "expected_secret_key".equals(secretKey);
    }
}