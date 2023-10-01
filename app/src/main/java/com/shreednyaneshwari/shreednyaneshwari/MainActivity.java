package com.shreednyaneshwari.shreednyaneshwari;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class MainActivity extends AppCompatActivity {
     private AdView mAdView;
    private final static String TAG="AdMob";
    private InterstitialAd mInterstitialAd;
    AdView adView;
    Button button1,button2,button3,button4,button5,button6,button7,
            button8,button9,button10,button11,button12,button13,button14,button15,button16,button17,button18;
   // private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (haveNetwork())
        {

        }
        else if (!haveNetwork())
        {
            Toast.makeText(this, "Connect to INTERNET", Toast.LENGTH_SHORT).show();
        }

        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button7=findViewById(R.id.button7);
        button8=findViewById(R.id.button8);
        button9=findViewById(R.id.button9);
        button10=findViewById(R.id.button10);
        button11=findViewById(R.id.button11);
        button12=findViewById(R.id.button12);
        button13=findViewById(R.id.button13);
        button14=findViewById(R.id.button14);
        button15=findViewById(R.id.button15);
        button16=findViewById(R.id.button16);
        button17=findViewById(R.id.button17);
        button18=findViewById(R.id.button18);


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    save_id(button1.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    Intent intent1 = new Intent(MainActivity.this, Ek.class);
                    startActivity(intent1);
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    save_id(button2.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    Intent intent1 = new Intent(MainActivity.this, Don.class);
                    startActivity(intent1);
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    save_id(button3.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    Intent intent1 = new Intent(MainActivity.this, Teen.class);
                    startActivity(intent1);
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    save_id(button4.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    Intent intent1 = new Intent(MainActivity.this, Chaar.class);
                    startActivity(intent1);
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    save_id(button5.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    Intent intent1 = new Intent(MainActivity.this, Paach.class);
                    startActivity(intent1);
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    save_id(button6.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    Intent intent1 = new Intent(MainActivity.this, Saha.class);
                    startActivity(intent1);
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    save_id(button7.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    Intent intent1 = new Intent(MainActivity.this, Saat.class);
                    startActivity(intent1);
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    save_id(button8.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    Intent intent1 = new Intent(MainActivity.this, Aath.class);
                    startActivity(intent1);
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    save_id(button9.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    Intent intent1 = new Intent(MainActivity.this, Nau.class);
                    startActivity(intent1);
                }
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    save_id(button10.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    Intent intent1 = new Intent(MainActivity.this, Daha.class);
                    startActivity(intent1);
                }
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    save_id(button11.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    Intent intent1 = new Intent(MainActivity.this, Aakra.class);
                    startActivity(intent1);
                }
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    save_id(button12.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    Intent intent1 = new Intent(MainActivity.this, Bara.class);
                    startActivity(intent1);
                }
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    save_id(button13.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    Intent intent1 = new Intent(MainActivity.this, Tera.class);
                    startActivity(intent1);
                }
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    save_id(button14.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    Intent intent1 = new Intent(MainActivity.this, Chauda.class);
                    startActivity(intent1);
                }
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    save_id(button15.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    Intent intent1 = new Intent(MainActivity.this, Pandhra.class);
                    startActivity(intent1);
                }
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    save_id(button16.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    Intent intent1 = new Intent(MainActivity.this, Sohla.class);
                    startActivity(intent1);
                }
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    save_id(button17.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    Intent intent1 = new Intent(MainActivity.this, Satara.class);
                    startActivity(intent1);
                }
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    save_id(button18.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    Intent intent1 = new Intent(MainActivity.this, Aathra.class);
                    startActivity(intent1);
                }
            }
        });



    }


    @Override

    public void onBackPressed(){

        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Alert");
        builder.setMessage("You Want To Exit");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("No",null);

        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }

    private boolean haveNetwork(){

        boolean have_WIFI=false;
        boolean have_MobileData=false;

        ConnectivityManager connectivityManager=(ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo[] networkInfos=connectivityManager.getAllNetworkInfo();
        for (NetworkInfo info:networkInfos){

            if (info.getTypeName().equalsIgnoreCase("WIFI"))
                if (info.isConnected())
                    have_WIFI=true;
            if (info.getTypeName().equalsIgnoreCase("MOBILE"))
                have_MobileData=true;

        }
        return have_MobileData||have_WIFI;
    }




    private void save_id(int id) {
        SharedPreferences preferences=getSharedPreferences("SAVING",MODE_PRIVATE);
        SharedPreferences.Editor editor= preferences.edit();
        editor.putInt("mID",id);
        editor.apply();
    }
    private int load_id()
    {
        SharedPreferences preferences=getSharedPreferences("SAVING",MODE_PRIVATE);
        int value = preferences.getInt("mID",0);
        Log.d( "ACT ID","value:"+value);
        return preferences.getInt("mID",0);
    }

    @Override
    protected void onStart() {
        super.onStart();
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
                AdRequest adRequest = new AdRequest.Builder().build();

                InterstitialAd.load(MainActivity.this,"ca-app-pub-3877980992289459/5920524091", adRequest,
                        //real unit id is this one above is test id=
                        new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                // The mInterstitialAd reference will be null until
                                // an ad is loaded.
                                mInterstitialAd = interstitialAd;
                                Log.i(TAG, "onAdLoaded");
                                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                                    @Override
                                    public void onAdClicked() {
                                        // Called when a click is recorded for an ad.
                                        Log.d(TAG, "Ad was clicked.");
                                    }

                                    @Override
                                    public void onAdDismissedFullScreenContent() {
                                        // Called when ad is dismissed.
                                        // Set the ad reference to null so you don't show the ad a second time.
                                        Log.d(TAG, "Ad dismissed fullscreen content.");
                                        mInterstitialAd = null;
                                        Intent intent;
                                        switch (load_id())
                                        {
                                            case R.id.button1:
                                                intent=new Intent(MainActivity.this,Ek.class);
                                                break;
                                            case R.id.button2:
                                                intent=new Intent(MainActivity.this,Don.class);
                                                break;
                                            case R.id.button3:
                                                intent=new Intent(MainActivity.this,Teen.class);
                                                break;
                                            case R.id.button4:
                                                intent=new Intent(MainActivity.this,Chaar.class);
                                                break;
                                            case R.id.button5:
                                                intent=new Intent(MainActivity.this,Paach.class);
                                                break;
                                            case R.id.button6:
                                                intent=new Intent(MainActivity.this,Saha.class);
                                                break;
                                            case R.id.button7:
                                                intent=new Intent(MainActivity.this,Saat.class);
                                                break;
                                            case R.id.button8:
                                                intent=new Intent(MainActivity.this,Aath.class);
                                                break;
                                            case R.id.button9:
                                                intent=new Intent(MainActivity.this,Nau.class);
                                                break;
                                            case R.id.button10:
                                                intent=new Intent(MainActivity.this,Daha.class);
                                                break;
                                            case R.id.button11:
                                                intent=new Intent(MainActivity.this,Aakra.class);
                                                break;
                                            case R.id.button12:
                                                intent=new Intent(MainActivity.this,Bara.class);
                                                break;
                                            case R.id.button13:
                                                intent=new Intent(MainActivity.this,Tera.class);
                                                break;
                                            case R.id.button14:
                                                intent=new Intent(MainActivity.this,Chauda.class);
                                                break;
                                            case R.id.button15:
                                                intent=new Intent(MainActivity.this,Pandhra.class);
                                                break;
                                            case R.id.button16:
                                                intent=new Intent(MainActivity.this,Sohla.class);
                                                break;
                                            case R.id.button17:
                                                intent=new Intent(MainActivity.this,Satara.class);
                                                break;
                                            case R.id.button18:
                                                intent=new Intent(MainActivity.this,Aathra.class);
                                                break;

                                            default:
                                                return;
                                        }
                                        startActivity(intent);
                                    }

                                    @Override
                                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                                        // Called when ad fails to show.
                                        Log.e(TAG, "Ad failed to show fullscreen content.");
                                        mInterstitialAd = null;
                                    }

                                    @Override
                                    public void onAdImpression() {
                                        // Called when an impression is recorded for an ad.
                                        Log.d(TAG, "Ad recorded an impression.");
                                    }

                                    @Override
                                    public void onAdShowedFullScreenContent() {
                                        // Called when ad is shown.
                                        Log.d(TAG, "Ad showed fullscreen content.");
                                    }
                                });
                            }

                            @Override
                            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                                // Handle the error
                                Log.d(TAG, loadAdError.toString());
                                mInterstitialAd = null;
                            }
                        });
            }
        });
    }


}

