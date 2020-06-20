package br.com.laylamonteiro.projetocellep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        /*
        {} chaves -> Bloco ou escopo de programação (não é por identação)
        [] colchetes -> Listas e coleções
        () parênteses -> Condição, passagem de parâmetros ou método construtor
         */

        //Handler é a classe que pausa a execução do aplicativo
        Handler().postDelayed({
            //função lambda **ESTUDAR SOBRE** (basicamente é chamar uma classe dentro de uma função)
            //É a função que vai chamar outra tela (classe), de login
            startActivity(Intent(this@SplashActivity, LoginActivity::class.java))
            finish()
            //2 params: (contexto/onde estamos, para qual classe vamos)
            //é sempre necessário utilizar o ::class.java para referenciar uma classe, senão não funciona
        }, 5000)
    }
}
