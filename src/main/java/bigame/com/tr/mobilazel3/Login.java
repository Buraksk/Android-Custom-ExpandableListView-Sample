package bigame.com.tr.mobilazel3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by burakisik on 7/14/2017.
 */

public class Login extends Activity implements View.OnClickListener {
    Service service=new Service();
    Button btnGiris;
    EditText txtKulAdi,txtKulSifre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnGiris=(Button)findViewById(R.id.btnGiris);
        txtKulAdi=(EditText)findViewById(R.id.txtKulAdi);
        txtKulSifre=(EditText)findViewById(R.id.txtKulSifre);

        btnGiris.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(service.Login(txtKulAdi.getText().toString(),txtKulSifre.getText().toString())==1) {
            Toast.makeText(this, "HOŞ GELDİNİZ.", Toast.LENGTH_SHORT).show();

            Intent intent=new Intent(this,MainActivity.class);
            //intent.putExtra("girisValue","1");
            startActivity(intent);
        }

    }
}
