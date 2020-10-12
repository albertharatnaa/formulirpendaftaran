package android.example.formulirpendaftaran.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Mahasiswa implements Parcelable {

    private String nama;
    private String jenisKelamin;
    private String status;
    private String agama;
    private String kewarganegaraan;
    private String alamat;
    private String kota;
    private String propinsi;
    private String notelp;
    private String email;
    private String namaOrtu;
    private String pendidikanOrtu;
    private String asalPtn;
    private String asalProgStudi;
    private String pilihan1;
    private String pilihan2;
    private  String namaSMA;
    private String alamatSMA;
    private  String kotaSMA;
    private  String propinsiSMA;
    private  String tahun;
    private  String jmlNilai;
    private  String jmlMapel;
    private  String jurusan;
    private  String dana;
    private  String dokumen;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getPropinsi() {
        return propinsi;
    }

    public void setPropinsi(String propinsi) {
        this.propinsi = propinsi;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNamaOrtu() {
        return namaOrtu;
    }

    public void setNamaOrtu(String namaOrtu) {
        this.namaOrtu = namaOrtu;
    }

    public String getPendidikanOrtu() {
        return pendidikanOrtu;
    }

    public void setPendidikanOrtu(String pendidikanOrtu) {
        this.pendidikanOrtu = pendidikanOrtu;
    }

    public String getAsalPtn() {
        return asalPtn;
    }

    public void setAsalPtn(String asalPtn) {
        this.asalPtn = asalPtn;
    }

    public String getAsalProgStudi() {
        return asalProgStudi;
    }

    public void setAsalProgStudi(String asalProgStudi) {
        this.asalProgStudi = asalProgStudi;
    }

    public String getPilihan1() {
        return pilihan1;
    }

    public void setPilihan1(String pilihan1) {
        this.pilihan1 = pilihan1;
    }

    public String getPilihan2() {
        return pilihan2;
    }

    public void setPilihan2(String pilihan2) {
        this.pilihan2 = pilihan2;
    }

    public String getNamaSMA() {
        return namaSMA;
    }

    public void setNamaSMA(String namaSMA) {
        this.namaSMA = namaSMA;
    }

    public String getAlamatSMA() {
        return alamatSMA;
    }

    public void setAlamatSMA(String alamatSMA) {
        this.alamatSMA = alamatSMA;
    }

    public String getKotaSMA() {
        return kotaSMA;
    }

    public void setKotaSMA(String kotaSMA) {
        this.kotaSMA = kotaSMA;
    }

    public String getPropinsiSMA() {
        return propinsiSMA;
    }

    public void setPropinsiSMA(String propinsiSMA) {
        this.propinsiSMA = propinsiSMA;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getJmlNilai() {
        return jmlNilai;
    }

    public void setJmlNilai(String jmlNilai) {
        this.jmlNilai = jmlNilai;
    }

    public String getJmlMapel() {
        return jmlMapel;
    }

    public void setJmlMapel(String jmlMapel) {
        this.jmlMapel = jmlMapel;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getDana() {
        return dana;
    }

    public void setDana(String dana) {
        this.dana = dana;
    }

    public String getDokumen() {
        return dokumen;
    }

    public void setDokumen(String dokumen) {
        dokumen = dokumen;
    }

    public Mahasiswa() {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.status = status;
        this.agama = agama;
        this.kewarganegaraan = kewarganegaraan;
        this.alamat = alamat;
        this.kota = kota;
        this.propinsi = propinsi;
        this.notelp = notelp;
        this.email = email;
        this.namaOrtu = namaOrtu;
        this.pendidikanOrtu = pendidikanOrtu;
        this.asalPtn = asalPtn;
        this.asalProgStudi = asalProgStudi;
        this.pilihan1 = pilihan1;
        this.pilihan2 = pilihan2;
        this.namaSMA = namaSMA;
        this.alamatSMA = alamatSMA;
        this.kotaSMA = kotaSMA;
        this.propinsiSMA = propinsiSMA;
        this.tahun = tahun;
        this.jmlNilai = jmlNilai;
        this.jmlMapel = jmlMapel;
        this.jurusan = jurusan;
        this.dana = dana;
        this.dokumen = dokumen;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.jenisKelamin);
        dest.writeString(this.status);
        dest.writeString(this.agama);
        dest.writeString(this.kewarganegaraan);
        dest.writeString(this.alamat);
        dest.writeString(this.kota);
        dest.writeString(this.propinsi);
        dest.writeString(this.notelp);
        dest.writeString(this.email);
        dest.writeString(this.namaOrtu);
        dest.writeString(this.pendidikanOrtu);
        dest.writeString(this.asalPtn);
        dest.writeString(this.asalProgStudi);
        dest.writeString(this.pilihan1);
        dest.writeString(this.pilihan2);
        dest.writeString(this.namaSMA);
        dest.writeString(this.alamatSMA);
        dest.writeString(this.kotaSMA);
        dest.writeString(this.propinsiSMA);
        dest.writeString(this.tahun);
        dest.writeString(this.jmlNilai);
        dest.writeString(this.jmlMapel);
        dest.writeString(this.jurusan);
        dest.writeString(this.dana);
        dest.writeString(this.dokumen);
    }

    protected Mahasiswa(Parcel in) {
        this.nama = in.readString();
        this.jenisKelamin = in.readString();
        this.status = in.readString();
        this.agama = in.readString();
        this.kewarganegaraan = in.readString();
        this.alamat = in.readString();
        this.kota = in.readString();
        this.propinsi = in.readString();
        this.notelp = in.readString();
        this.email = in.readString();
        this.namaOrtu = in.readString();
        this.pendidikanOrtu = in.readString();
        this.asalPtn = in.readString();
        this.asalProgStudi = in.readString();
        this.pilihan1 = in.readString();
        this.pilihan2 = in.readString();
        this.namaSMA = in.readString();
        this.alamatSMA = in.readString();
        this.kotaSMA = in.readString();
        this.propinsiSMA = in.readString();
        this.tahun = in.readString();
        this.jmlNilai = in.readString();
        this.jmlMapel = in.readString();
        this.jurusan = in.readString();
        this.dana = in.readString();
        this.dokumen = in.readString();
    }

    public static final Parcelable.Creator<Mahasiswa> CREATOR = new Parcelable.Creator<Mahasiswa>() {
        @Override
        public Mahasiswa createFromParcel(Parcel source) {
            return new Mahasiswa(source);
        }

        @Override
        public Mahasiswa[] newArray(int size) {
            return new Mahasiswa[size];
        }
    };
}
