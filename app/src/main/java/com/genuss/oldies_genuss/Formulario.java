package com.genuss.oldies_genuss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.nineoldandroids.animation.Animator;


/**
 * Created by user on 21/02/2016.
 */
public class Formulario extends Activity{
    private TextView nombre;
    private TextView apPaterno;
    private TextView apMaterno;
    private TextView email;
    private TextView fechaNac;
    private EditText mNombre;
    private EditText mApPaterno;
    private EditText mApMaterno;
    private EditText mEmail;
    private EditText mFechaNac;
    private Beneficiario mBeneficiario;
    private Button procesar;
    @Override
    protected void onCreate(Bundle savedInstaceState)
    {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.formulario_activity);

        mBeneficiario = new Beneficiario();
        nombre = (TextView)findViewById(R.id.textView);
        apPaterno = (TextView)findViewById(R.id.textView2);
        apMaterno = (TextView)findViewById(R.id.textView3);
        email = (TextView)findViewById(R.id.textView4);
        fechaNac = (TextView)findViewById(R.id.textView5);

        mNombre = (EditText)findViewById(R.id.editText);
        mApMaterno = (EditText)findViewById(R.id.editText2);
        mApPaterno = (EditText)findViewById(R.id.editText3);
        mEmail = (EditText)findViewById(R.id.editText4);
        mFechaNac = (EditText)findViewById(R.id.editText5);

        procesar = (Button)findViewById(R.id.button);
        procesar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Pulse).withListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                       Toast.makeText(getApplicationContext(),"Con ahorrar 10 pesos diarios obtendrá 1000 en tres meses",Toast.LENGTH_SHORT);
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {

                    }
                });
            }
        });




    }

}
