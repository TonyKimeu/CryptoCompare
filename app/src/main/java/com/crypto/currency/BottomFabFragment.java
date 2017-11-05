package com.crypto.currency;

import android.app.Dialog;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.allattentionhere.fabulousfilter.AAH_FabulousFragment;

import java.util.ArrayList;

/**
 * Created by tonyk on 10/31/2017.
 */

public class BottomFabFragment extends AAH_FabulousFragment {

    Button btn_close;
    private RadioGroup radioGroup,radioGroup1,radioGroup2,radioGroup3,radioGroup4,radioGroup5;
    private CheckBox USD,EUR,NGN,KES,GBP,JPY,CHF,CAD,AUD,HKD,INR,CNY,EGP,ILS,RUB,ZAR,ARS,BRL,SEK,SAR,QAR;
    public static ArrayList<String> currencies;
    public static ArrayList<String> currency;
    public static String joined;

    public static BottomFabFragment newInstance() {
        BottomFabFragment f = new BottomFabFragment();
        return f;
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override

    public void setupDialog(Dialog dialog, int style) {
        View contentView = View.inflate(getContext(), R.layout.bottom_view, null);

        USD = (CheckBox) contentView.findViewById(R.id.USD);
        EUR = (CheckBox) contentView.findViewById(R.id.EUR);
        NGN = (CheckBox) contentView.findViewById(R.id.NGN);
        GBP = (CheckBox) contentView.findViewById(R.id.GBP);
        JPY = (CheckBox) contentView.findViewById(R.id.JPY);
        CHF = (CheckBox) contentView.findViewById(R.id.CHF);
        CAD = (CheckBox) contentView.findViewById(R.id.CAD);
        AUD = (CheckBox) contentView.findViewById(R.id.AUD);
        HKD = (CheckBox) contentView.findViewById(R.id.HKD);
        INR = (CheckBox) contentView.findViewById(R.id.INR);
        CNY = (CheckBox) contentView.findViewById(R.id.CNY);
        EGP = (CheckBox) contentView.findViewById(R.id.EGP);
        ILS = (CheckBox) contentView.findViewById(R.id.ILS);
        RUB = (CheckBox) contentView.findViewById(R.id.RUB);
        ZAR = (CheckBox) contentView.findViewById(R.id.ZAR);
        ARS = (CheckBox) contentView.findViewById(R.id.ARS);
        BRL = (CheckBox) contentView.findViewById(R.id.BRL);
        SEK = (CheckBox) contentView.findViewById(R.id.SEK);
        SAR = (CheckBox) contentView.findViewById(R.id.SAR);
        QAR = (CheckBox) contentView.findViewById(R.id.QAR);


        RelativeLayout rl_content = (RelativeLayout) contentView.findViewById(R.id.rl_content);
        LinearLayout ll_buttons = (LinearLayout) contentView.findViewById(R.id.ll_buttons);


         currency = new ArrayList<String>();

            USD.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CheckBox checkBox = (CheckBox) v;
                    if (checkBox.isChecked()) {
                        currency.add("USD");
                    } else {
                        currency.remove("USD");
                    }
                }
            });

            EUR.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CheckBox checkBox = (CheckBox) v;
                    if (checkBox.isChecked()) {
                        currency.add("EUR");
                    } else {
                        currency.remove("EUR");
                    }
                }

            });
            NGN.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CheckBox checkBox = (CheckBox) v;
                    if (checkBox.isChecked()) {
                        currency.add("NGN");
                    } else {
                        currency.remove("NGN");
                    }
                }

            });

            GBP.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CheckBox checkBox = (CheckBox) v;
                    if (checkBox.isChecked()) {
                        currency.add("GBP");
                    } else {
                        currency.remove("GBP");
                    }
                }

            });
            JPY.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CheckBox checkBox = (CheckBox) v;
                    if (checkBox.isChecked()) {
                        currency.add("JPY");
                    } else {
                        currency.remove("JPY");
                    }
                }

            });

            CHF.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CheckBox checkBox = (CheckBox) v;
                    if (checkBox.isChecked()) {
                        currency.add("CHF");
                    } else {
                        currency.remove("CHF");
                    }
                }

            });
            CAD.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CheckBox checkBox = (CheckBox) v;
                    if (checkBox.isChecked()) {
                        currency.add("CAD");
                    } else {
                        currency.remove("CAD");
                    }
                }

            });

            AUD.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CheckBox checkBox = (CheckBox) v;
                    if (checkBox.isChecked()) {
                        currency.add("AUD");
                    } else {
                        currency.remove("AUD");
                    }
                }

            });
            HKD.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CheckBox checkBox = (CheckBox) v;
                    if (checkBox.isChecked()) {
                        currency.add("HKD");
                    } else {
                        currency.remove("HKD");
                    }
                }

            });

            INR.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CheckBox checkBox = (CheckBox) v;
                    if (checkBox.isChecked()) {
                        currency.add("INR");
                    } else {
                        currency.remove("INR");
                    }
                }

            });
            CNY.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CheckBox checkBox = (CheckBox) v;
                    if (checkBox.isChecked()) {
                        currency.add("CNY");
                    } else {
                        currency.remove("CNY");
                    }
                }

            });

            EGP.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CheckBox checkBox = (CheckBox) v;
                    if (checkBox.isChecked()) {
                        currency.add("EGP");
                    } else {
                        currency.remove("EGP");
                    }
                }

            });
            ILS.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CheckBox checkBox = (CheckBox) v;
                    if (checkBox.isChecked()) {
                        currency.add("ILS");
                    } else {
                        currency.remove("ILS");
                    }
                }

            });

            RUB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CheckBox checkBox = (CheckBox) v;
                    if (checkBox.isChecked()) {
                        currency.add("RUB");
                    } else {
                        currency.remove("RUB");
                    }
                }

            });

            ZAR.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CheckBox checkBox = (CheckBox) v;
                    if (checkBox.isChecked()) {
                        currency.add("ZAR");
                    } else {
                        currency.remove("ZAR");
                    }
                }

            });
            ARS.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CheckBox checkBox = (CheckBox) v;
                    if (checkBox.isChecked()) {
                        currency.add("ARS");
                    } else {
                        currency.remove("ARS");
                    }
                }

            });
            BRL.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CheckBox checkBox = (CheckBox) v;
                    if (checkBox.isChecked()) {
                        currency.add("BRL");
                    } else {
                        currency.remove("BRL");
                    }
                }

            });
            SEK.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CheckBox checkBox = (CheckBox) v;
                    if (checkBox.isChecked()) {
                        currency.add("SEK");
                    } else {
                        currency.remove("SEK");
                    }
                }

            });
            SAR.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CheckBox checkBox = (CheckBox) v;
                    if (checkBox.isChecked()) {
                        currency.add("SAR");
                    } else {
                        currency.remove("SAR");
                    }
                }

            });
            QAR.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CheckBox checkBox = (CheckBox) v;
                    if (checkBox.isChecked()) {
                        currency.add("QAR");
                    } else {
                        currency.remove("QAR");
                    }
                }

            });



        contentView.findViewById(R.id.btn_close).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeFilter("closed");

            }
        });

        contentView.findViewById(R.id.btn_select).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeFilter("closed");
                currencies = currency;
                joined = TextUtils.join(",", currency);
                Toast.makeText(getActivity(), joined, Toast.LENGTH_SHORT).show();
            }
        });

        //Toast.makeText(getActivity(), currency.toString(), Toast.LENGTH_SHORT).show();









        //params to set
        setAnimationDuration(600); //optional; default 500ms
        setPeekHeight(350); // optional; default 400dp
//        setCallbacks((Callbacks) getActivity()); //optional; to get back result
        setViewgroupStatic(ll_buttons); // optional; layout to stick at bottom on slide
//        setViewPager(vp_types); //optional; if you use viewpager that has scrollview
        setViewMain(rl_content); //necessary; main bottomsheet view
        setMainContentView(contentView); // necessary; call at end before super
        super.setupDialog(dialog, style); //call super at last
    }

}
