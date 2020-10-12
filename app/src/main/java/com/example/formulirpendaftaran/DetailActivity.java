package android.example.formulirpendaftaran;

import android.example.formulirpendaftaran.databinding.ActivityDetailBinding;
import android.example.formulirpendaftaran.models.Mahasiswa;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import java.util.Objects;

public class DetailActivity extends AppCompatActivity {
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_detail);
        ActivityDetailBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_detail);
        Mahasiswa mahasiswa = Objects.requireNonNull(getIntent().getExtras()).getParcelable("MAHASISWA");
        binding.setMahasiswa(mahasiswa);
    }
}
