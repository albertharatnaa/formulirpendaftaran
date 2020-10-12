package android.example.formulirpendaftaran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.example.formulirpendaftaran.databinding.ActivityMainBinding;
import android.os.Bundle;
import android.example.formulirpendaftaran.models.Mahasiswa;
import android.view.View;
import android.widget.CompoundButton;

public class  MainActivity extends AppCompatActivity {
    Mahasiswa mahasiswa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mahasiswa = new Mahasiswa();
        mahasiswa.setJenisKelamin("Laki Laki");
        mahasiswa.setStatus("Menikah");
        mahasiswa.setKewarganegaraan("WNI");

        binding.radioLakiLaki.setOnCheckedChangeListener((new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mahasiswa.setJenisKelamin("Laki Laki");
                }
            }
        }));
        binding.radioPerempuan.setOnCheckedChangeListener((new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mahasiswa.setJenisKelamin("Perumpuan");
                }
            }
        }));

        binding.radioMenikah.setOnCheckedChangeListener((new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mahasiswa.setStatus("Menikah");
                }
            }
        }));

        binding.radioBelumMenikah.setOnCheckedChangeListener((new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mahasiswa.setStatus("Belum Menikah");
                }
            }
        }));

        binding.radioBiarawati.setOnCheckedChangeListener((new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mahasiswa.setStatus("Biaragwan/Biarawati");
                }
            }
        }));

        binding.radioWna.setOnCheckedChangeListener((new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mahasiswa.setKewarganegaraan("WNA");
                }
            }
        }));
        binding.radioWni.setOnCheckedChangeListener((new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mahasiswa.setKewarganegaraan("WNI");
                }
            }
        }));

        binding.btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mahasiswa.setNama(binding.edtNama.getText().toString());
                mahasiswa.setAgama(binding.spinnerAgama.getSelectedItem().toString());
                mahasiswa.setAlamat(binding.edtAlamat.getText().toString());
                mahasiswa.setKota(binding.edtKota.getText().toString());
                mahasiswa.setPropinsi(binding.edtPropinsi.getText().toString());
                mahasiswa.setNotelp(binding.edtTelp.getText().toString());
                mahasiswa.setEmail(binding.edtEmail.getText().toString());
                mahasiswa.setNamaOrtu(binding.edtOrtu.getText().toString());
                mahasiswa.setPendidikanOrtu(binding.spinnerPendidikanOrtu.getSelectedItem().toString());
                mahasiswa.setAsalPtn(binding.edtAsalPtn.getText().toString());
                mahasiswa.setAsalProgStudi(binding.edtAsalProgStudi.getText().toString());
                mahasiswa.setPilihan1(binding.spinnerProgramStudi.getSelectedItem().toString());
                mahasiswa.setPilihan2(binding.spinnerProgramStudi2.getSelectedItem().toString());
                mahasiswa.setNamaSMA(binding.edtNamaSMA.getText().toString());
                mahasiswa.setAlamatSMA(binding.edtAlamatSMA.getText().toString());
                mahasiswa.setKotaSMA(binding.edtKotaSMA.getText().toString());
                mahasiswa.setPropinsiSMA(binding.edtPropSMA.getText().toString());
                mahasiswa.setTahun(binding.edtTahun.getText().toString());
                mahasiswa.setJmlNilai(binding.edtJmlNilai.getText().toString());
                mahasiswa.setJmlMapel(binding.edtJmlMapel.getText().toString());
                mahasiswa.setJurusan(binding.spinnerJurusanSMA.getSelectedItem().toString());
                mahasiswa.setDana(binding.edtDana.getText().toString());


                Intent intent = new Intent(getApplicationContext(),DetailActivity.class);
                // put mahasiswa object to extra
                intent.putExtra("MAHASISWA",mahasiswa);

                startActivity(intent);
            }
        });
    }
}