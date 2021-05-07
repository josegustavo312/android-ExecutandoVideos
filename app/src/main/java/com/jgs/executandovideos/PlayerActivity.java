package com.jgs.executandovideos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayerActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        videoView = findViewById(R.id.videoView);

        //Esconde a StatusBar e barra de navegação
        View decorView = getWindow().getDecorView();
        int uiOpcoes = View.SYSTEM_UI_FLAG_FULLSCREEN | // Executa em tela cheia
                        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION; // Oculta a barra de navegação
        decorView.setSystemUiVisibility(uiOpcoes);

        // Esconde a ActionBar
        getSupportActionBar().hide();

        // Executar o vídeo
        videoView.setMediaController(new MediaController(this)); // Controles
        videoView.setVideoPath("android.resource://"+getPackageName() + "/" + R.raw.video); // Caminho do vídeo
        videoView.start();

    }
}
