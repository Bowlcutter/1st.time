package webbrowser;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.a1sttime.R;

public class browser extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.browser);

            WebView webView = new WebView(this);
            webView.loadUrl("https://javabog.dk");

            setContentView(webView);

        }

}
